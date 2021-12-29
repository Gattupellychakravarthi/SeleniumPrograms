package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Final {
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		Final obj = new Final();
		obj.openbrowser();

	}

	public void openbrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver1.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("flipkart");
		Thread.sleep(2000);
		ele.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,50)");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//h3[text()='Flipkart']")).click();
	}
    public void Flikart() {
    	driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
    	driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
    	WebElement ele = driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 (Black, 64 GB)']"));
    	ele.getText();
    	ele.click();
    	
    	
    }
}
