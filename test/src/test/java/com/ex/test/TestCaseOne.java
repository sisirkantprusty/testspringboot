package com.ex.test;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ex.base.BaseTest;
import com.ex.base.RuntimeConfiguration;
import com.ex.pageobjects.TestCaseOnePage;

public class TestCaseOne extends BaseTest{
	Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	RuntimeConfiguration RuntimeConfiguration;
	
	/**
	 * By default, Spring creates all singleton beans eagerly at the startup/bootstrapping of the application context. 
	 * The reason behind this is simple: to avoid and detect all possible errors immediately rather than at runtime.
	 * However, there're cases when we need to create a bean, not at the application context startup, but when we request it.
	 * So @Lazy is used for the same
	 */
	@Lazy @Autowired
	TestCaseOnePage testCaseOnePage;
	
	@Lazy @Autowired
	TestCaseOnePage testCaseTwoPage;
  
	@Test
	public void testOne() {
		logger.info("Test case 1 STARTED");
		if (RuntimeConfiguration.getClubMarket().equalsIgnoreCase("true"))
			logger.info("Club Market is true");
		Assert.assertEquals(2 * 2, 4, "2x2 should be 4");
		logger.info("Test case ONE is completed");
	}
	
	@Test
	public void testTwo() throws InterruptedException {
		logger.info("Test case 2 executed");
		testCaseOnePage.getNoOfLinks();
		logger.info("Test case TWO is completed");
	}
	
	@Test
	public void testThree() throws InterruptedException {
		logger.info("Test case 2 executed");
		testCaseTwoPage.getNoOfLinks();
		logger.info("Test case THREE is completed");
	}
}
