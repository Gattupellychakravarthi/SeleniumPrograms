package robotclass;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mocktest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver1.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/time/viewemployeeTimesheet");
		String str= driver.getTitle();
		System.out.println(str);
		Thread.sleep(2000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("menu_time_viewTimeModule")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("employee")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("employee")).sendKeys("Chakravarthi");
		Thread.sleep(1000);
		driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("leaveList_chkSearchFilter_1")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("btnSearch")).click();
		Thread.sleep(1000);
		driver.close();
		
		
		

	}

}
