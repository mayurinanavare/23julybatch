package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class randomnamescreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.meesho.com/");
		String name=RandomString.make(4);
		
	File src=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File des =new File("D:\\oracle\\product\\test"+name+".png");
	FileHandler.copy(src, des);
	
	
		

	}

}
