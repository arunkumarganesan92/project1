package org.cucumber_task;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends CommonClass {

	CommonClass c = new CommonClass();

	@Before
	public void launch() {
		c.browserLaunch();
		c.launchUrl("https://www.amazon.com/");
	}

	@After
	public void browserQuit() {
		//c.browserClose();
	}

}
