package com.sb.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ankur.mahajan
 * @written 12-Sep-2017
 * 
 *          This will work only if the other packages are under this.
 */
@SpringBootApplication
@EnableAutoConfiguration
public class BootStarter {

	public static void main(String[] args) {
		SpringApplication.run(BootStarter.class, args);
	}
}
