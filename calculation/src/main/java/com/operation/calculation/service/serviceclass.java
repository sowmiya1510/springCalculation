package com.operation.calculation.service;

import org.springframework.stereotype.Service;

@Service
public class serviceclass {
	
	
	public int add(int a,int b) {
		int add=a+b;
		return add;
	
		
	}
	public int sub(int a,int b) {
		int sub=a-b;
		return sub;
	}
	public int mul(int a,int b) {
		int mul=a*b;
		return mul;
	}
	public int div(int a,int b) {
		int div=a/b;
		return div;
	}

}

