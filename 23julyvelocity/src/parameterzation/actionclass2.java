package parameterzation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();	
	    driver.get("http://mrbool.com/");
	   WebElement content = driver.findElement(By.xpath("//a[@class='menulink']"));
	   Actions ac=new Actions(driver);
	   ac.moveToElement(content).perform();
	  WebElement articles = driver.findElement(By.xpath("//a[text()='Articles']"));
	  //ac.contextClick(articles).perform();
	  ac.click().perform();
      //driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");   

	  

	}

}
