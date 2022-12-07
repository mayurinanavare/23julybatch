package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.ISelect;

public class listbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.get("https://www.google.com/");
	    driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("facebook sign up");
	    driver.findElement(By.xpath("(//input[@class='gNO89b'])[1]")).click();
	    driver.findElement(By.xpath("(//span[contains(text(),'Facebook')])[1]")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("mayuri");
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("nanavare");

        driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("8263077378");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Swami@12");
        //day
        WebElement list=driver.findElement(By.xpath("(//select[@aria-label='Day'])[1]"));
        Select se=new Select(list);
        se.selectByIndex(16);
        System.out.println("day is selected");
        
        //month

        WebElement list1=driver.findElement(By.xpath("//select[@aria-label='Month']"));
        Select se1=new Select(list1);
        se1.selectByValue("8");
        System.out.println("month is selected");
        //Thread.sleep(3000);
        
        //year

        WebElement list2=driver.findElement(By.xpath("//select[@aria-label='Year']"));
        Select se2=new Select(list2);
        se2.selectByVisibleText("1996");
   
       

        WebElement list3=driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
        list3.click();
        
        System.out.println("list3 is Selected");
        
       
        
        
       
        


        

	}

}
