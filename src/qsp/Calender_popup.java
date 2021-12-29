package qsp;


import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_popup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		
		
	}
	
}
