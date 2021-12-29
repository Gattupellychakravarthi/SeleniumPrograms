package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Static_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver1.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,350)");
		WebElement drop = driver.findElement(By.name("employees_c"));

		Select act = new Select(drop);
		WebElement e = act.getFirstSelectedOption();
		System.out.println(e.getText());
		Thread.sleep(3000);
		act.selectByVisibleText("1 - 10 employees");
		Thread.sleep(3000);
		act.selectByIndex(4);
		Thread.sleep(3000);
		act.selectByValue("level3");
		Thread.sleep(3000);
		List<WebElement> ele = act.getAllSelectedOptions();
		System.out.println(ele.size());
		Thread.sleep(3000);
		act.deselectAll();
		List<WebElement> ele1 = act.getAllSelectedOptions();
		System.out.println(ele1.size());
		

	}

}
