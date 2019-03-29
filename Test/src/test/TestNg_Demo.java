package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class TestNg_Demo {
	
	static WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		
		//set driver path
		System.setProperty("webdriver.chrome.driver", "/root/Documents/jee-oxygen/Worspace2/Java_Tutorials/Test/lib/chromedriver/chromedriver");
		driver = new ChromeDriver();
		
	}
	
	@Test
	public static void googleSearch() {
		
		
		//open browser
		driver.get("https://www.google.co.in/");
		
		//search in the text box
		driver.findElement(By.name("q")).sendKeys("automation");
	
		//if submit not works we can submit by enter
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]")).sendKeys(Keys.RETURN);

		
	}

	@AfterTest
	public void tearDownTest() {
		
		//close browser
		driver.close();
		System.out.println("Completed");
		
	}
}
