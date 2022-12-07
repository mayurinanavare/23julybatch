package selenium;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshottime {

	public static void main(String[] args) throws IOException {
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Downloads\\chromedriver_win32\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.meesho.com/");
     
     
//display current date and time of system by using date class of java
   Date currentdate=new Date();
   System.out.println(currentdate);
   
 //convert that date into string   
   String screenshotfilename =currentdate.toString().replace(" ", "-").replace(":", "-");
   System.out.println(screenshotfilename);
   
   
  //take screenshots
     File src=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 	File des =new File("D:\\oracle\\product\\"+screenshotfilename+".png");
 	FileHandler.copy(src, des);
   
     
     
	}

}
