package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
		driver.manage().window().maximize();
		
		 driver.findElementByLinkText("Drop down").click();	
		 
		Thread.sleep(2000);
		
		
		
		driver.close();

	}

}
