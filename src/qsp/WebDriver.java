package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.close();
	}

}
