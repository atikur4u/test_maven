package test_maven;

import aquality.selenium.browser.*;
import org.testng.annotations.Test;

public class SimpleMaven {
	public static Browser browser;
	@Test
	public void runBrowser() {
		browser = AqualityServices.getBrowser();
		browser.goTo("https://google.com");
		browser.waitForPageToLoad();
		browser.maximize();
		browser.quit();
	}

}
