package com.ex.base;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.ex.test.TestApplication;

@SpringBootTest(classes = TestApplication.class)
public class BaseTest extends AbstractTestNGSpringContextTests  {
	/**
	 * Sample comment
	 */
	Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	WebDriverSession webDriverSession;
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		logger.info("Before method started");
		webDriverSession.init();
	}

	@AfterMethod
	public void tearDown() {
		logger.info("After method started");
		webDriverSession.quitBrowser();
	}
}
