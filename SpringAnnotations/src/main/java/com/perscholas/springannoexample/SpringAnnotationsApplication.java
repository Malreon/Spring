package com.perscholas.springannoexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.perscholas"})

public class SpringAnnotationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAnnotationsApplication.class, args);
	}

}
