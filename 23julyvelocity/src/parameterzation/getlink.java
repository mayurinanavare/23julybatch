package parameterzation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();	
	    driver.get("https://www.amazon.com/");
	   List<WebElement> links = driver.findElements(By.xpath("//a"));
	   System.out.println(links.size());
	   for(int i=0;i<=links.size()-1;i++)
	   {
		   System.out.println(links.get(i).getText()+":"+links.get(i).getAttribute("href"));
	   }

	}

}
