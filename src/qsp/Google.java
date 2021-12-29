package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("kohli");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).click();
		driver.getTitle();
		System.out.println();
		Thread.sleep(3000);
		driver.close();
	}
}
