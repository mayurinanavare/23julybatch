package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class interviewquestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    //WebDriver driver =new WebDriver();	 //cannot create object of interface because webdriver is a interface
	    //RemoteWebDriver driver=new RemoteWebDriver(); //
	    RemoteWebDriver driver=new ChromeDriver();  //we can do it also that but most perferable is webdriver
	    ChromeDriver cd=new ChromeDriver();  //we can also use this but it call only chrome driver 
	                                         //dose not perform cross browser testing
	    
	    driver.get("https://www.amazon.com");

	}

}
