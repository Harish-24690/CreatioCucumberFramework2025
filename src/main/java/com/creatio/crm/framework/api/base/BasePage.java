package com.creatio.crm.framework.api.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import com.creatio.crm.framework.utilities.PropUtil;

import io.cucumber.java.After;
import io.cucumber.java.Before;





public class BasePage  {
	
	private static WebDriver driver=null;
	Properties prop = PropUtil.readData("Config.properties");
	
	@Before
	public void setupBrowser() {
		String browserName =prop.getProperty("BROWSER");
		if(browserName.equalsIgnoreCase("chrome")){
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}else {
			Assert.fail("The browser is not supported"+browserName);
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@After
	public void teardownDriver() {
		if(driver!=null) {
			driver.quit();
		}
	}
	
	public static WebDriver getDriver() {
        return driver;
    }
	
	public static void setDriver(WebDriver driver) {
        BasePage.driver = driver;
    }

}
