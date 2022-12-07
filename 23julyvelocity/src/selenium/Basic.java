
////////////////open new tab and window//////////////////////////////////////

package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\asus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		//open new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.oracle.com/");
		//open new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.google.com/");
		
		

	}

}
