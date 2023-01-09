package org.cucumber_task;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonMobilePurchase extends CommonClass {
	MobilePurchasePOM mp = new MobilePurchasePOM();
	CommonClass cc = new CommonClass();

	@Given("user has to click on search box {string}")
	public void user_has_to_click_on_search_box(String s1) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		cc.sendText(mp.getSearch(), s1);

	}

	@When("user has to select a mobile")
	public void user_has_to_select_a_mobile() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		cc.elementClick(mp.getMobile());
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for (String x : child) {
			if (!parent.equals(x)) {
				driver.switchTo().window(x);

			}
		}

	}

	@Then("user has to click a buynow button")
	public void user_has_to_click_a_buynow_button() {
		cc.elementClick(mp.getBuyNow());
	}

}
