/**
 * 
 */
package com.sb.boot.repositories;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.sb.boot.resources.GreetingController;

/**
 * @author ankur
 *
 */
@Repository
public class GreetingRepository {
	private static final Logger LOGGER = LogManager.getLogger(GreetingRepository.class);

	public boolean findStatusById() {
		LOGGER.info("Inside repository layer.");
		return true;
	}
}
