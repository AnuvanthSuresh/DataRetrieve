package com.igc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.igc.model.RequestModel;
import com.igc.model.ResponseModel;
import com.igc.service.RetrieveData;

@RestController(value = "/data")
public class SecureController {
	
	@Autowired
	RetrieveData retrieveBondData;
	
	@GetMapping(value = "/bond",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseModel GetData(@RequestBody RequestModel request) {
		return retrieveBondData.getBondData(request);
	}

}
