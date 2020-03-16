package com.ex.test;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ex.base.BaseTest;
import com.ex.base.RuntimeConfiguration;
import com.ex.base.WebDriverSession;

public class TestCaseOne extends BaseTest{
	Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	WebDriverSession session;
	
	@Autowired
	RuntimeConfiguration RuntimeConfiguration;
  
	@Test
	public void testOne() {
		logger.info("Test case 1 STARTED");
		if (RuntimeConfiguration.getClubMarket().equalsIgnoreCase("true"))
			logger.info("Club Market is true");
		Assert.assertEquals(2 * 2, 4, "2x2 should be 4");
	}
	
	//@Test
	public void testTwo() {
		logger.info("Test case 2 executed");
		Assert.assertEquals(2 * 2, 4, "2x2 should be 4");
	}
}
