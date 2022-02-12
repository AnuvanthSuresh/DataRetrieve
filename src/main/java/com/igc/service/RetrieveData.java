package com.igc.service;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.igc.exceptionhandler.InvalidDataException;
import com.igc.model.RequestModel;
import com.igc.model.ResponseModel;
import com.igc.utils.Constants;

@Service
public class RetrieveData {

	@Autowired
	private Environment environment;
	
	@Autowired
	ResponseModel responseModel;
	

	public ResponseModel getBondData(RequestModel request) {
		responseModel.setCompanyName(request.getCompanyName());
		responseModel.setIcin(request.getICIN());
		responseModel.setTimeStamp(new SimpleDateFormat(Constants.DateFormat).format(new Date()));
		try {
		Document doc = Jsoup.connect(environment.getProperty("bond.data.base.url")
				.replace(Constants.NAME, request.getCompanyName()).replace(Constants.ICIN, request.getICIN()))
				.timeout(5000).get();
		doc.getElementsByClass(Constants.MasterDivClass).stream().limit(6).forEach((element) -> {
			switch (element.getElementsByTag(Constants.h4).get(0).text().toString().trim()) {
			case "Yield":
				responseModel.setYield(element.getElementsByTag(Constants.h5).get(0).text());
			case "Coupon rate":
				responseModel.setCouponRate(element.getElementsByTag(Constants.h5).get(0).text());
			case "Face Value":
				responseModel.setFaceValue(element.getElementsByTag(Constants.h5).get(0).text());
			case "Maturity date":
				responseModel.setMaturityDate(element.getElementsByTag(Constants.h5).get(0).text());
			case "Last Traded Price":
				responseModel.setLastTradedprice(element.getElementsByTag(Constants.h5).get(0).text());
			case "Last Traded Date":
				responseModel.setLastTradeddate(element.getElementsByTag(Constants.h5).get(0).text());
			}
		});
		}catch (NullPointerException e) {
			throw new NullPointerException("Null value encountered when parsing html");
		}catch (IOException e) {
			throw new InvalidDataException("Supplied ICIN or Bond Name is Invalid");
		}
		return responseModel;
	}

}
