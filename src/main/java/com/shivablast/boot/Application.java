package com.shivablast.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ankur.mahajan
 * @written 12-Sep-2017
 * 
 *          This will work only if the controller package is under
 *          com.shivablast.boot package.
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
