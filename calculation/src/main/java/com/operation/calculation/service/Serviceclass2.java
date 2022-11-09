package com.operation.calculation.service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Serviceclass2 {
	
        @Value("${spring.userName}")
		private String userNames;
		
		@Value("${spring.password}")
		private String passwords;
		
		
		public String userLogin(String userName,String password) throws Exception {
			
			String message="";
			try {

			if(userName!=null && password !=null) {
				
			  String name = userNames;
					
			        if(userName.equals(name)) {
			        	
					  if(password.equals(passwords)){
						  
						message = "you have succesfully logined";
					  }
					  else {
							message = "please provide correct password";
						
				       }
						
				      } 
					
				      else {
						message = "please provide correct username";
					 }
					
				    } 
				    else {
					
					message = "given userName and password is an empty";
			  	    }
				
			} catch(Exception ex) {
			throw new Exception(ex.getMessage());	
			}
			return message;
			
		}

	}

	


