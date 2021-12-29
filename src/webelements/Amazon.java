package webelements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	ChromeDriver driver;
	public void Execution() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver1.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	public void Flow() throws InterruptedException, AWTException {
		
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement from=driver.findElement(By.cssSelector("input[class='gLFyf gsfi']"));
	from.sendKeys("Amazon");
	Thread.sleep(5000);
	from.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input[class='gNO89b']")).click();
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	jse.executeScript("window.scrollBy(0,50);");
	driver.findElement(By.xpath("//h3[contains(text(),'Amazon.in')]")).click();
	Thread.sleep(3000);
	WebElement from1=driver.findElement(By.xpath("//input[@type='text']"));
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	from1.sendKeys("Nokia");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	from1.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(3000);
	from1.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(3000);
	from1.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(3000);
	from1.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(3000);
	from1.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(3000);
	driver.findElement(By.id("nav-search-submit-button")).click();
	
	
	
}
}
