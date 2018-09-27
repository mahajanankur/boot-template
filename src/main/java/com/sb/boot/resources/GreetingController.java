package com.sb.boot.resources;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sb.boot.pojo.Response;

/**
 * @author ankur.mahajan
 * @written 12-Sep-2017
 */
@RestController
public class GreetingController {

	// private static final Logger LOGGER =
	// Logger.getLogger(GreetingController.class.getName());

	private final AtomicLong counter = new AtomicLong();

	@RequestMapping(value = "/status", method = RequestMethod.GET)
	private ResponseEntity<Response> getStatus() {
		Response response = new Response();
		response.setSuccess(true);
		response.setMessage("Service is active!!");
		response.setData(counter.incrementAndGet());
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}
}
