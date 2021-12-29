package test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class TakeScreenshort {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		/*
		 * TakesScreenshot ts = (TakesScreenshot) driver; File src =
		 * ts.getScreenshotAs(OutputType.FILE); File dest = new
		 * File("F:\\Screenshort\\Google.jpg"); Files.copy(src,dest);
		 */
		/*
		 * RemoteWebDriver dr = (RemoteWebDriver) driver; File src
		 * =dr.getScreenshotAs(OutputType.FILE); File dest= new
		 * File("F:\\\\Screenshort\\\\Google1.jpg"); Files.copy(src, dest);
		 */
		
		/*
		 * EventFiringWebDriver et = new EventFiringWebDriver(driver); File src =
		 * et.getScreenshotAs(OutputType.FILE); File dest = new
		 * File("F:\\\\\\\\Screenshort\\\\\\\\Google3.jpg"); Files.copy(src, dest);
		 */
		WebElement Google = driver.findElement(By.cssSelector("img[class='lnXdpd']"));
		File src = Google.getScreenshotAs(OutputType.FILE);
		File dest = new File("F:\\\\\\\\\\\\\\\\Screenshort\\\\\\\\\\\\\\\\Google4.jpg");
		Files.copy(src, dest);
		
		
	}

}
