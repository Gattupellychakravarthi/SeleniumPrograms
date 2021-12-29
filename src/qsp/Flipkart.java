package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.worldometers.info/coronavirus/");
		String str1 = driver.findElement(By.xpath("//h1[text()='Coronavirus Cases:']")).getText();
		System.out.print(str1);
		String str = driver.findElement(By.xpath("//h1[text()='Coronavirus Cases:']/../div/span")).getText();
		System.out.println(str);
		String str2 = driver.findElement(By.xpath("//h1[text()='Deaths:']")).getText();
		System.out.print(str2);
		String str3= driver.findElement(By.xpath("//h1[text()='Deaths:']/../div/span")).getText();
		System.out.println(str3);
		String str4 = driver.findElement(By.xpath("//h1[text()='Recovered:']")).getText();
		System.out.print(str4);
		String str5 =driver.findElement(By.xpath("//h1[text()='Recovered:']/../div")).getText();
		System.out.println(str5);

	}

}
