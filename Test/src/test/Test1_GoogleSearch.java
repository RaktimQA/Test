package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class Test1_GoogleSearch {
	
	public static void main(String[] args) {
		
		/*System.setProperty("webdriver.gecko.driver", "/root/Documents/jee-oxygen/Worspace2/Java_Tutorials/Test/lib/geckodriver/geckodriver");
		System.setProperty("webdriver.firefox.bin", "/root/Downloads/firefox/firefox-bin");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.goaptive.com");*/		
		
		googleSearch();
						
	}
	
	public static void googleSearch() {
		
		//set driver path
		System.setProperty("webdriver.chrome.driver", "/root/Documents/jee-oxygen/Worspace2/Java_Tutorials/Test/lib/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//open browser
		driver.get("https://www.google.co.in/");
		
		//search in the text box
		driver.findElement(By.name("q")).sendKeys("automation");
	
		//if submit not works we can submit by enter
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]")).sendKeys(Keys.RETURN);

		//close browser
		driver.close();
		System.out.println("Completed");
	}	

}
