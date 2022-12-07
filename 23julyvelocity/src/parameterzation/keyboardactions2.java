package parameterzation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardactions2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();	
	    driver.get("https://text-compare.com/");
	   driver.findElement(By.xpath("//textarea[@name='text1']")).sendKeys("welcome to selenium");
	   driver.findElement(By.xpath("//textarea[@name='text1']"));
	   Actions ac=new Actions(driver);
	   //control A -select data
	   ac.keyDown(Keys.CONTROL);
	   ac.sendKeys("a");
	   ac.keyUp(Keys.CONTROL);
	   ac.perform();
	   //control C -copy data
	   ac.keyDown(Keys.CONTROL);
	   ac.sendKeys("c");
	   ac.keyUp(Keys.CONTROL);
	   ac.perform();
	  //tab- shift to input box2
       ac.keyDown(Keys.TAB);
	   ac.perform();
	   //control V -paste data

	   ac.keyDown(Keys.CONTROL);
	   ac.sendKeys("v");
	   ac.keyUp(Keys.CONTROL);
	   ac.perform();
	   
	   

	}

}
