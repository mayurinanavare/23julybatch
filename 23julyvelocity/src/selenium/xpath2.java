package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();	
	   driver.get("https://www.google.com/");
	   driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("google meet");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//input[@value='Google Search']")).click();
       ////h3[@class='LC20lb MBeuO DKV0Md']
       driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']")).click();
       ////span[@class='cta_text']
       driver.findElement(By.xpath("//input[@type='text']")).sendKeys("https://meet.google.com/osr-rtst-rgc");
       
       
       //https://meet.google.com/oau-wgmy-afo
	}

}
