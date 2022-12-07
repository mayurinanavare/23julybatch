package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();	
	    driver.get("https://www.amazon.com/");
	   boolean button = driver.findElement(By.xpath("//input[@id='continue']")).isEnabled();
	  // boolean result = button.isEnabled();
	   System.out.println(button);	   
	   
	  /* if(result==true)
	   {
		   System.out.println("button is enbled");
		   
	   }
	   else
		   
	   {
		   System.out.println("button is not enabled");
	   }*/

	}

}
