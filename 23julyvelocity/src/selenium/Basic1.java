
/////////////////////////////////////get title//////////////////////////////////////
package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic1 {

	public static void main(String[] args) throws InterruptedException { //throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();	
	    driver.get("https://www.amazon.com");
	    //Thread.sleep(2000);  //hold that tab for some second
	    //driver.close();
        
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.oracle.com/");
		//driver.close();  //close only one tab 
		//driver.quit(); //close all tab open in chrome
		String name=driver.getTitle();  //get the title in console that is url 
	    System.out.println(name);
		String expect="Oracle | Cloud Applications and Cloud Platform";
		if(name.equalsIgnoreCase(expect))  //ignore case consideration 
		{
			System.out.println("navigate to correct page");
		}
		else
		{
			System.out.println("navigate to wrong page");
		}
	
		
		
		
		
	    

	   

	}

}
