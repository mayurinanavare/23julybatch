package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathtext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.get("https://www.google.com/");
	   
	    driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("amazon sign in");
	    driver.findElement(By.xpath("(//input[@class='gNO89b'])[1]")).click();
	    driver.findElement(By.xpath("//span[@class='x2VHCd OSrXXb qzEoUe']")).click();
	    driver.findElement(By.xpath("//span[@class='nav-line-2 ']")).click();
	    driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mayuri Nanavare");
	    driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8263077378");
	    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("mayurinanavare999@gmail.com");
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Swami@12");
	    driver.findElement(By.xpath("//input[@id='continue']")).click();
	   //driver..manage.minimize();
	   


	    

	 

	    
	    


	 
	    
	    ;

	}

}
