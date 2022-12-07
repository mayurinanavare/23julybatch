package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browsersize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();	
	    driver.get("https://www.amazon.com");
	    Dimension de=new Dimension(100,300);
	    
	    driver.manage().window().setSize(de);
	    
	    Point p=new Point(200,300);
	    driver.manage().window().setPosition(p);

	}

}
