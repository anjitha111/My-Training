package launchbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdge {

	public static void main(String[] args) {
		
	    System.setProperty("webdriver.chrome.driver","D:\\EdgeDriver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    String url= driver.getCurrentUrl();
	    System.out.println("Current URL is "+url);
	    driver.get(url);
	    driver.get("https://www.flipkart.com");
	    String title=driver.getTitle(); 
	    System.out.println("Current tab title is "+title);
	    driver.navigate().to("https://www.jetairways.com");
		driver.navigate().to("https://www.swiggy"+ ".com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
