package qsp;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CssSelector {
	WebDriver driver =null;

	public static void main(String[] args) throws InterruptedException {

		CssSelector b = new CssSelector();
		b.openBrowser();
		b.Check();
		b.get();
		b.login();
		b.inspectPage();
		b.createCoustomer();

	}

	public void openBrowser() throws InterruptedException {
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
		driver.manage().window().maximize();
		Thread.sleep(5000);

	}

	public void get() throws InterruptedException {
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("Google")) {
			System.out.println("Title page displayed Pass");
		} else {
			System.out.println("Title page displayed failed");
		}
		Thread.sleep(6000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(6000);
		System.out.println(driver.getPageSource());
		Thread.sleep(6000);
	}

	public void Check() throws InterruptedException {
		Thread.sleep(6000);
		Dimension dim = new Dimension(600, 700);
		driver.manage().window().setSize(dim);
		Thread.sleep(6000);
		Point p = new Point(600, 400);
		driver.manage().window().setPosition(p);
		Thread.sleep(6000);
		driver.manage().window().maximize();
	}

	public void login() throws InterruptedException {

		driver.navigate().to("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
		Thread.sleep(2000);
	}

	public void inspectPage() throws InterruptedException {
		Thread.sleep(6000);
		driver.findElement(By.id("container_tasks")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div[class='title ellipsis']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[class='item createNewCustomer']")).click();
		Thread.sleep(2000);
	}

	public void createCoustomer() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input[class='inputFieldWithPlaceholder newNameField inputNameField']"))
				.sendKeys("Chakravarthi");
		WebDriverWait Wait = new WebDriverWait(driver, 20);
		Wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("textarea[placeholder='Enter Customer Description']")))
				.sendKeys("Aluminium Manufacturing Industry");

		Thread.sleep(4000);
		driver.findElement(By.cssSelector("div[class='emptySelection']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("div[class='itemRow cpItemRow ']")).click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		Thread.sleep(6000);
		driver.close();

	}

}
