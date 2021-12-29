package qsp;

import java.util.Scanner;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class EbaySystem {

	ChromeDriver driver;
	String name;

	public void Openweb() throws InterruptedException {
		
		
		System.out.println("Enter any of Mobile name");
		Scanner scan = new Scanner(System.in);
		name = scan.next();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		Thread.sleep(3000);
		
	}

	public void SearchMolibe() throws InterruptedException {
		driver.findElement(By.id("gh-ac")).sendKeys(this.name);
		Thread.sleep(2000);
		driver.findElement(By.id("gh-btn")).click();
		Thread.sleep(2000);
		String str = driver.findElement(By.xpath("//h3[contains(text(),'Apple iPhone 7 32GB')]/../../div/div/span")).getText();
		System.out.println(name + " Mobile Price:  " + str);
		Thread.sleep(2000);	
		driver.navigate().back();
		driver.close();
	}

	public void Nokia() throws InterruptedException {
		driver.findElement(By.id("gh-ac")).sendKeys(this.name);
		Thread.sleep(2000);
		driver.findElement(By.id("gh-btn")).click();
		Thread.sleep(2000);
		String str1 = driver
				.findElement(By.xpath("//h3[contains(text(),'NOKIA LUMIA 1520 WHITE ')]/../../div/div/span")).getText();
		System.out.println(name + " Mobile Price: " + str1);
		Thread.sleep(2000);
		driver.navigate().back();
		driver.close();

	}

	public void Redmi() throws InterruptedException {
		driver.findElement(By.id("gh-ac")).sendKeys(this.name);
		Thread.sleep(2000);
		driver.findElement(By.id("gh-btn")).click();
		Thread.sleep(2000);
		String str2 = driver
				.findElement(By.xpath("//h3[contains(text(),'Xiaomi Redmi Note 9 Pro 64GB')]/../../div/div/span"))
				.getText();
		System.out.println(name + " Mobile Price: " + str2);
		Thread.sleep(2000);
		driver.navigate().back();
		driver.close();
	}

	public void Samsung() throws InterruptedException {

		driver.findElement(By.id("gh-ac")).sendKeys(this.name);
		Thread.sleep(2000);
		driver.findElement(By.id("gh-btn")).click();
		Thread.sleep(2000);
		String str3 = driver
				.findElement(By.xpath("//h3[contains(text(),'Samsung Galaxy A32 5G 64gb')]/../../div/div/span"))
				.getText();
		System.out.println(name + " Mobile Price: " + str3);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.close();

	}

	public static void main(String[] args) throws InterruptedException {

		EbaySystem ebay = new EbaySystem();
		ebay.Openweb();
		ebay.SearchMolibe();
		EbaySystem ebay1 = new EbaySystem();
		ebay1.Openweb();
		ebay1.Nokia();
		EbaySystem ebay2 = new EbaySystem();
		ebay2.Openweb();
		ebay2.Redmi();
		EbaySystem ebay3= new EbaySystem();
		ebay3.Openweb();
		ebay3.Samsung();
		
	
	}

}
