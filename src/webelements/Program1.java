package webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) {
		int count = 0;
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver1.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		List<WebElement> ele = driver.findElements(By.xpath("//a"));
		for (WebElement i : ele) {

			String str = i.getText();
			System.out.println(str);
			count++;
		}
		System.out.println(count);

	}

}
