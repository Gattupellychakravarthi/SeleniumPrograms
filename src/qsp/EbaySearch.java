package qsp;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbaySearch {
	ChromeDriver driver;
	String name = "Mobile";
	Scanner scan = new Scanner(System.in);

	public void Webpage() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
	}

	public void SearchElement() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='main-content']/div/ul/li[3]/a"));
		Thread.sleep(3000);
		driver.findElement(By.name("_nkw")).sendKeys(name);
		driver.findElement(By.id("gh-btn")).click();
		Thread.sleep(2000);
		String str = driver.findElement(By.xpath(
				"//span[text()='Smartphone 4GB+64GB Android 10 Dual SIM 10-Core 5.8\" 4G Mobile Cell Phone US GSM']/../../../div/div/span"))
				.getText();
		System.out.println(str);
		driver.close();

	}

	public static void main(String[] args) throws InterruptedException {
		EbaySearch obj = new EbaySearch();
		obj.Webpage();
		obj.SearchElement();

	}

}
