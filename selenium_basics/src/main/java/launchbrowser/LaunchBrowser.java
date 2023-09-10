package launchbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
	    System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// Runtime polymorphism. Click on "Webdriver" by pressing control button.
	    //driver=new EdgeDriver();
	    driver.get("https://www.amazon.in/");// To launch the URL
	    driver.manage().window().maximize();//To maximise the tab
	    String url= driver.getCurrentUrl();// To return the current URL.
	    System.out.println("Current URL is "+url);
	    driver.get(url);// History won't get stored in driver.get()
	    System.out.println("2nd Current URL is "+url);
	    driver.get("https://www.flipkart.com");// To launch new URL.
	    String title=driver.getTitle(); // To retrieve tab title.
	    System.out.println("Current tab title is "+title);
	    driver.close();//It will close only the current tab.
	    driver.quit();// It will close all tabs in the browser.
	    
	}

}
