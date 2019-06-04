package test_sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Practice\\Selenium_installable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("www.google.com");
	}

}
