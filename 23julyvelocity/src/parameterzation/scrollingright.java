package parameterzation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollingright {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();	
	    driver.get("https://www.album.alexflueras.ro/index.php");
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	   js.executeScript("window.scrollBy(2000,0)");
	    Thread.sleep(2000);
	    js.executeScript("window.scrollBy(-2000,0)");
	    Thread.sleep(2000);
	    

	}

}
