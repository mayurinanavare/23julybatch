package parameterzation;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardactions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();	
	    driver.get("http://the-internet.herokuapp.com/key_presses");
	    Actions ac=new Actions(driver);
	    ac.sendKeys(Keys.ENTER).perform();
	    Thread.sleep(2000);
	    ac.sendKeys(Keys.BACK_SPACE).perform();
	    Thread.sleep(2000);
	    ac.sendKeys(Keys.SPACE).perform();
	    Thread.sleep(2000);
	    ac.sendKeys(Keys.ESCAPE).perform();
	    Thread.sleep(2000);
	}

}
