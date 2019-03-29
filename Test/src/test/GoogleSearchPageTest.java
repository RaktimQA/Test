package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		googleSearchTest();
				
	}
	
	public static void googleSearchTest() {
		
		System.setProperty("webdriver.chrome.driver", "/root/Documents/jee-oxygen/Worspace2/Java_Tutorials/Test/lib/chromedriver/chromedriver");
		driver = new ChromeDriver();
		
		GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
		
		driver.get("https://google.com");
		
		searchPageObj.setTextInSearchBox("A B C D");
		searchPageObj.clickSearchButton();
		
		driver.close();
	}

}
