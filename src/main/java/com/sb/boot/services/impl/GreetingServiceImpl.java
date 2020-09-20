/**
 * 
 */
package com.sb.boot.services.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.boot.repositories.GreetingRepository;
import com.sb.boot.services.GreetingService;

/**
 * @author ankur
 *
 */
@Service
public class GreetingServiceImpl implements GreetingService {

	private static final Logger LOGGER = LogManager.getLogger(GreetingServiceImpl.class);

	@Autowired
	private GreetingRepository greetingRepository;

	@Override
	public boolean getStatus() {
		LOGGER.info("Inside service layer.");
		return greetingRepository.findStatusById();
	}

}
