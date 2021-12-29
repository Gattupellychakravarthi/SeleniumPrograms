package qsp;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowsing {
	
	WebDriver driver= null;
	String mobilename=null;
	
	public static void main(String[] args) throws InterruptedException {
		CrossBrowsing obj = new CrossBrowsing();
		obj.login();
		obj.XpathCases();
	
	}
		public  void login() throws InterruptedException {
		System.out.println("Enther the Browser name");
		Scanner scan = new Scanner(System.in);
		String BrowserName = scan.next();
		if (BrowserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver1.exe");
			driver = new ChromeDriver();
		} else if (BrowserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("Enter Correct Browser Name");
		}
		driver.get("https://www.google.com/");
		WebElement gmailAdress = driver.findElement(By.xpath("//a[@class='gb_f' and text()='Gmail']"));
		String gmailtext = gmailAdress.getText();
		System.out.println(gmailtext);
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("Enter Mobile number: ");
		mobilename=scan.next();
	}
	
	public void XpathCases() throws InterruptedException {
		
		
		WebElement str= driver.findElement(By.xpath("//input[@type='text']"));
		str.sendKeys("iphone");
		str.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		
		
	}

}
