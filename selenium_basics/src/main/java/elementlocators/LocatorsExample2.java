package elementlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample2 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com");
		 driver.manage().window().maximize();
		 WebElement email_field=driver.findElement(By.name("email"));
		 email_field.sendKeys("neha@gmail.com");
		 WebElement hreflink=driver.findElement(By.linkText("Forgotten password?"));//It will check for the given link text in the web page.
		 //hreflink.click();
		 WebElement hrefpartiallink=driver.findElement(By.partialLinkText("Forgotten"));//It will check for the given partial link text in the web page.
		 //hreflink.click();
		 hrefpartiallink.click();
	}

}
