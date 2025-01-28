package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.logindemo;

public class logintesttt {
WebDriver driver;
@BeforeTest
public void set() {
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
}
@Test
public void loginnnn() {
	logindemo obj=new logindemo(driver);
	obj.setvalues("abc@mail.com", "sfdf1234");
	
}
}
