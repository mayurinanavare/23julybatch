package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fileupload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.get("https://www.automationtestinginsider.com/");
	    //driver.findElement(By.xpath("//a[text()='DEMO WEBSITES']")).click();
	    //driver.findElement(By.xpath("(//a[text()='Different Elements on a Web Page'])[1]")).click();
	    driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
	    Actions ac=new Actions(driver);
	   WebElement choosefile= driver.findElement(By.xpath("//input[@id='fileupload1']"));
	   ac.moveToElement(choosefile).perform();
	   choosefile.sendKeys("C:\\Users\\asus\\Desktop\\txt.txt");
       

	}

}
