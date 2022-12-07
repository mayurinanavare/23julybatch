package parameterzation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();	
	    driver.get("https://www.facebook.com/");
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	   js.executeScript("window.scrollBy(0,2000)");
	    Thread.sleep(2000);

	    js.executeScript("window.scrollBy(0,-2000)");
	    Thread.sleep(2000);
	  

	    
	}

}
