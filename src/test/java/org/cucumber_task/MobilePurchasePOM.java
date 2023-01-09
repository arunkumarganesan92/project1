package org.cucumber_task;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobilePurchasePOM extends CommonClass{
	
	public  MobilePurchasePOM() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "twotabsearchtextbox")
	private WebElement search;
	@FindBy(xpath = "//span[contains(text(),'Samsung Galaxy')]")
	private WebElement mobile;
	@FindBy(xpath = "//input[@id='buy-now-button']")
	private WebElement buyNow;
	
	
	public WebElement getSearch() {
		return search;
	}
	public WebElement getMobile() {
		return mobile;
	}
	public WebElement getBuyNow() {
		return buyNow;
	}

}
