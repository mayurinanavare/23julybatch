package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class enabeld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();	
	    driver.get("https://login.yahoo.com/?");
	 WebElement  next =driver.findElement(By.xpath("//input[@type='submit']"));
    boolean	result= next.isEnabled();
    System.out.println(result);
    
    
    //is selected
    WebElement checkbox= driver.findElement(By.xpath("//label[@for='persistent']"));
    boolean result1=checkbox.isSelected();
    
    System.out.println(result1);

	}

}
