package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkey {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();	
	    driver.get("http://www.cookbook.seleniumacademy.com/Alerts.html");

		driver.findElement(By.xpath("//button[@id='prompt']")).click();
		Alert alt = driver.switchTo().alert();
		//alt.accept();
		Thread.sleep(4000);
		alt.sendKeys("mayuri");
		alt.accept();
		Thread.sleep(4000);
		
	    
		
	}

}
