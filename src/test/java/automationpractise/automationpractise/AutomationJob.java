package automationpractise.automationpractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AutomationJob {

	@Test
	public void testMethod() {
    System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Windows.html");
	String actualurl = driver.getCurrentUrl();
	Assert.assertEquals(actualurl, "http://demo.automationtesting.in/Windows.html");
	driver.quit();
		
	}
	}
