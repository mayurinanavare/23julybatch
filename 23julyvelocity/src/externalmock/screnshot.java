package externalmock;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class screnshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.google.com/");
		 //String a=RandomString.make(2);
		 Date currentdate=new Date();
		String name= currentdate.toString().replace(":", "-").replace(" ", "-");
		File src=(( TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des=new File("D:\\oracle\\product\\google"+name+".jpeg");
		FileHandler.copy(src, des);
		

	}

}
