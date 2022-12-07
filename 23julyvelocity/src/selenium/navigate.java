package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.get("https://www.amazon.com");

		driver.switchTo().newWindow(WindowType.TAB); 
		driver.get("https://www.oracle.com/");
	    //driver.navigate().to("https://www.amazon.com");
	    driver.navigate().back();
	    Thread.sleep(3000);
		//driver.navigate().forward();
		//Thread.sleep(3000);
		driver.navigate().refresh();
		
	//dimension s=new dimension();

		
	    

	}

}
