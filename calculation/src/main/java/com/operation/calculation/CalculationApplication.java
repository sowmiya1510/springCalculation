package com.operation.calculation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages=("com.operation.calculation"))
public class CalculationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculationApplication.class, args);
	}

}
