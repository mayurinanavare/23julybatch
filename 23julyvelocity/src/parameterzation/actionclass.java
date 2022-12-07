package parameterzation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();	
	    driver.get("https://demoqa.com/buttons");
	   WebElement doubleclick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
	   Actions a=new Actions(driver);
	   a.doubleClick(doubleclick).perform();
	   

	}

}
