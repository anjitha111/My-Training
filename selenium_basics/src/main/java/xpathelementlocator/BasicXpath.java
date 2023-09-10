package xpathelementlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BasicXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    /*WebElement emailid=driver.findElement(By.xpath("//input[@id='email']"));//x-path=tagName[@attribute='attributevalue']
	    emailid.sendKeys("niya@gmail.com");
	    WebElement pwd=driver.findElement(By.xpath("//input[@id='pass']"));
	   pwd.sendKeys("abcd123");
	    WebElement login=driver.findElement(By.xpath("//button[text()='Log in']"));
	    login.click();
	    WebElement continuebutton=driver.findElement(By.xpath("//button[@type='submit']"));
	    continuebutton.click();*/
	    WebElement forgotpwd=driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]"));
	    forgotpwd.click();
	}

}
