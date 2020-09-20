package com.sb.boot.resources;

import java.util.concurrent.atomic.AtomicLong;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sb.boot.pojo.Response;
import com.sb.boot.services.GreetingService;

/**
 * @author ankur.mahajan
 * @written 12-Sep-2017
 */
@RestController
@RequestMapping(path = "/api")
public class GreetingController {

	private static final Logger LOGGER = LogManager.getLogger(GreetingController.class);

	private final AtomicLong counter = new AtomicLong();

	@Autowired
	private GreetingService greetingService;

	@RequestMapping(value = "/status", method = RequestMethod.GET)
	private ResponseEntity<Response> getStatus() {
		LOGGER.info("The status API request.");
		Response response = new Response();
		response.setSuccess(true);
		response.setMessage("Service is running with status " + greetingService.getStatus());
		response.setData(counter.incrementAndGet());
		LOGGER.info("The status API response.", response);
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}
}
