package windowHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.id("username"));
		ele.sendKeys("admin");
		Thread.sleep(2000);
		ele.clear();
		System.out.println("tagname" + ele.getTagName());
		System.out.println(ele.getAttribute("class"));
		Thread.sleep(3000);
		WebElement ele1 = driver.findElement(By.id("whiteBoxWithLogoBody"));
		System.out.println(ele1.getText());
		System.out.println(ele.getLocation());
		System.out.println(ele.getRect().x);
		System.out.println(ele.getRect().y);
		System.out.println(ele.getRect().width);
		System.out.println(ele.getRect().height);
		System.out.println(ele.getCssValue("font-size"));
		WebElement wb = driver.findElement(By.id("keepLoggedInCheckBox"));
		wb.click();
		Thread.sleep(2000);
		if (wb.isDisplayed()) {
			System.out.println("check box is displayed");
			if (wb.isEnabled()) {
				System.out.println("check box is enabled");
				if (wb.isSelected()) {
					System.out.println("**********");
				} else {
					System.out.println("select now");
					wb.click();
				}
			}
		}

	}

}
