package launchbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationExample {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://www.jetairways.com");// It won't wait for page loading like driver.get().
			driver.navigate().to("https://www.lufthansa.com");
			driver.navigate().back();// To go back to previous page
			driver.navigate().forward();// To move to next page.
			driver.navigate().refresh();// To refresh the page.

	}

}
