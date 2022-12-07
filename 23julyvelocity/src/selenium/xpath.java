package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();	
	   driver.get("https://www.amazon.in/");
	   WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(20));
	  WebElement ele = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='tet']")));
	  ele.sendKeys("mobile phone");
	  
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobile phone");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
        driver.findElement(By.xpath("//div[@id='imgTagWrapperId']")).click();
        
        
        

		 
        
	}

}
