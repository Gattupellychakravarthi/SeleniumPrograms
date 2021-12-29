package windowHandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver1.exe");
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parantwindow=driver.getWindowHandle();
		System.out.println(parantwindow);
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String>childwindow=driver.getWindowHandles();
		System.out.println(childwindow);
		Thread.sleep(2000);
		driver.switchTo().window(parantwindow);
		driver.switchTo();
				
		
		
	}

}
