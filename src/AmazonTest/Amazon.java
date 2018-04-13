package AmazonTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.gecko.driver","G:\\Selenium\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		    WebDriver driver=new FirefoxDriver(); //Launch FirefoxF
		    
		    driver.get("http://www.amazon.com"); //enter URL
			driver.manage().window().maximize(); // Maximize window
			driver.manage().deleteAllCookies();
					
		    driver.findElement(By.id("nav-link-accountList")).click();	
			driver.findElement(By.id("createAccountSubmit")).click();
			driver.findElement(By.id("ap_customer_name")).sendKeys("Mukund");
			driver.findElement(By.id("ap_email")).sendKeys("Mukund.Kuchekar1@yahoo.co.in");
			
			driver.findElement(By.id("ap_password")).sendKeys("hgdeurik");
			driver.findElement(By.id("ap_password_check")).sendKeys("hgdeurik");
			driver.findElement(By.id("continue")).click();
		
	}

}
