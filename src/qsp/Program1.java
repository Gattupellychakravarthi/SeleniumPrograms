package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/groups/feed/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("9030839781");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("Jyosthna@2244");
		Thread.sleep(3000);
		driver.findElement(By.id("loginbutton")).click();
		

	}

}
