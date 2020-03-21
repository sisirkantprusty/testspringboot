package com.ex.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@PageObjectDesktop
public class TestCaseTwoPage {

	@FindBy(xpath = "//a[contains(text(),'Mobile')]")
	public WebElement linkMobile;

	public void getNoOfLinks() throws InterruptedException {
		linkMobile.click();
		Thread.sleep(10000);
	}
}
