package windowHandles;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Tabs {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		/*
		 * System.out.println(driver.getTitle()); Thread.sleep(3000); WebElement add =
		 * driver.findElement(By.xpath("//a[text()='Gmail']")); Actions act = new
		 * Actions(driver); act.contextClick(add).build().perform();
		 */
         WebElement add=driver.findElement(By.cssSelector("svg[class='gb_Pe']"));
          Actions act = new Actions(driver);
          act.moveToElement(add).build().perform();
          act.contextClick(add).build().perform();
	}

}
