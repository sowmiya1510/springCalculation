package com.operation.calculation.controller;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.operation.calculation.service.Serviceclass2;

import java.io.FileInputStream;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sds")
public class Uselogin {
	
	@Autowired
	 Serviceclass2 serviceClass;
	@Value("${sowmiya}")
	private String probpath;
	
	
	@RequestMapping(value="/userLogin", method =RequestMethod.GET, produces="application/json")
	public String userLogin(@RequestParam String userName, @RequestParam String password){
		String result ="";
		try {
			result = serviceClass.userLogin(userName, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
		
	}
   
	@RequestMapping(value="loadpropertise", method =RequestMethod.GET)
	 public ResponseEntity<?>load(@RequestParam Map<String,String>mapping){
		Properties prob=new Properties();
		try {
			FileInputStream file=new FileInputStream(probpath);
				prob.load(file);
		    }
		catch(Exception e) {
			System.out.println(e);
	}
		return new ResponseEntity<>(prob,HttpStatus.OK);
		
	}
	
	
 
  }
  
  
