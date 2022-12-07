package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkey1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();	
	    driver.get("http://demoqa.com/alerts");
	    //accept alert pop up 
	   /* driver.findElement(By.xpath("//button[@id='alertButton']")).click();
	   Alert ss = driver.switchTo().alert();
	   Thread.sleep(2000);
	   ss.accept();*/
	   
	   //dismiss alert popup
	   driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
	   Alert al = driver.switchTo().alert();
	   al.dismiss();
	   

	}

}
