package com.operation.calculation.controller;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.operation.calculation.service.serviceclass;

@RestController
@RequestMapping("/api/")

public class Testcontroller {
	@Autowired
	 serviceclass objserviceclass;
	
	
	@RequestMapping(value="testAPI",method=RequestMethod.GET)
	public ResponseEntity<?> testApi(@RequestParam  String operation ,@RequestParam int a,@RequestParam int b) throws Exception
	{
	int result = 0;
	switch(operation) {
	case "add":
		result=objserviceclass.add(a,b) ;
	break;
	case "sub":
		result= objserviceclass.sub(a,b) ;
	break;
	case "mul":
		result=objserviceclass.mul(a,b) ;
	break;
	case "div":
		result=	objserviceclass.div(a,b) ;
	break;
	}
	return new ResponseEntity<>(result, HttpStatus.OK);
	}
	}



