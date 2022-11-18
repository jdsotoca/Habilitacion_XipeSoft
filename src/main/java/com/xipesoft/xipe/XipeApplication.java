package com.xipesoft.xipe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.xipesoft.xipe.controllers", "com.xipesoft.xipe.servicies"})
public class XipeApplication {

	public static void main(String[] args) {
		SpringApplication.run(XipeApplication.class, args);
	}

}
