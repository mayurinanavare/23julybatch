package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webelemethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      
		System.setProperty("webdriver.chrome.driver","C:\\Users\\asus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");

		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("facebook sign up");
		driver.findElement(By.xpath("(//input[@class='gNO89b'])[1]")).click();
		driver.findElement(By.xpath("(//span[contains(text(),'facebook')])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("mayuri");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("nanavare");

		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("8263077378");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Swami@12");

        //day for list
      WebElement day = driver.findElement(By.xpath("//select[@aria-label='Day']"));
      Select se=new Select(day);
      se.selectByIndex(16);
      
      //month for list
     WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
     Select se1=new Select(month);
     se1.selectByValue("8");
     
     //year for list
    WebElement year = driver.findElement(By.xpath("//select[@aria-label='Year']"));
    Select se2=new Select(year);
    se2.selectByVisibleText("1997");
   
    
   
    
    //radio button for select
   driver.findElement(By.xpath("//label[text()='Female']")).click();
   
     
    
    
    /*driver.findElement(By.xpath("//label[text()='Custom']")).click();
   WebElement displayed = driver.findElement(By.xpath("//select[@aria-label='Select your pronoun']"));
  boolean result = displayed.isDisplayed();
  System.out.println(result);*/
   
   
   
   ///size of element
  WebElement year1 = driver.findElement(By.xpath("//select[@aria-label='Year']"));
  Select se5=new Select(year1);
  List<WebElement> options = se5.getOptions();
  System.out.println(options);
  int size2=options.size();
  
  System.out.println("size of list is" +size2);
  //System.out.println(size2);
  
  //display element of list
  //int i=0;
  System.out.println(options.get(1).getText());
  
  for(int i=0;i<=options.size()-1;i++)
  {
	  System.out.println(options.get(i).getText());
  }
  
  
      

		
		
		

	}

}
