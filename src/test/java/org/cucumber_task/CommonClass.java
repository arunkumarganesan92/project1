package org.cucumber_task;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonClass {
	public static WebDriver driver;

	public void browserLaunch() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
	}

	public void launchUrl(String url) {
		driver.get(url);
	}

	public void browserClose() {

		driver.quit();
	}

	
	public void sendText(WebElement ele, String text) {
		ele.sendKeys(text,Keys.ENTER);

	}

	public void snapShot(String path) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File f = new File(path);
		try {
			FileUtils.copyFile(src, f);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void actionClick(WebElement ele) {
		Actions a = new Actions(driver);
		a.moveToElement(ele).click().build().perform();

	}

	public void elementClick(WebElement ele) {
		ele.click();
	}

}
