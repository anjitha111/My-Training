package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Java_Script_Executor {

	public static <JavaScriptExecutor> void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();

		JavascriptExecutor js=(JavascriptExecutor) driver;//Creating the JavascriptExecutor interface object by Type casting.	
		js.executeScript("alert ('Anjitha')"); // To get the alert.	
		driver.switchTo().alert().accept();
		
		//js.executeScript("window.scrollBy(0,50)"); //To scroll based on the Y-axis
		//js.executeScript("window.scrollBy(0,100)");// Will scroll a bit more.
		
		WebElement haircolor=driver.findElement(By.xpath("//a[contains(text(),'Hair Color')]"));
		//js.executeScript("arguments[0].scrollIntoView();",haircolor);// To scroll to which web element, we are giving args[0]
		
		js.executeScript("arguments[0].click();",haircolor);// To click using javascript executor.
	}

}
