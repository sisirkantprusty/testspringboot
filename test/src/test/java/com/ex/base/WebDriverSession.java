package com.ex.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class WebDriverSession {
	Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	RuntimeConfiguration runtimeConfiguration;
	
	public static WebDriver webDriver;
	public void setChromeDriver(){
		logger.info("####################### SET UP CHROME DRIVER #############");
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe");
		webDriver = new ChromeDriver();
		webDriver.manage().window().maximize();
	}
	
	public void init() throws InterruptedException {
		logger.info("This is init in Webdriver session");
		String browserType="chrome";
		
		switch(browserType){
		case "chrome":
			setChromeDriver();
			break;
		default:
			System.out.println("######### No Browser Type provided #################");
		}
		
		logger.info("Load the server url: " + runtimeConfiguration.getServerUrl());
		
		webDriver.get(runtimeConfiguration.getServerUrl());
		Thread.sleep(5000);
	}
	
	public void quitBrowser(){
		webDriver.quit();
	}

}
