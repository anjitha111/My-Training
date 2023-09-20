package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		WebElement js_alert=driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		WebElement js_confirm=driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		WebElement js_prompt=driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		
		js_alert.click();
		Thread.sleep(1000);
		System.out.println("First alert message is "+driver.switchTo().alert().getText());//Prints the alert message.
		driver.switchTo().alert().accept();// To close the alert.
		
		System.out.println("Successfully closed the alert box");// To check whether it is accespted or else give thread sleep or wait.
		
		js_confirm.click();
		Thread.sleep(1000);
		System.out.println("Second alert message is " +driver.switchTo().alert().getText());// Prints the alert message
		
		driver.switchTo().alert().dismiss();//To click the cancel button.
		
		js_prompt.click();
		driver.switchTo().alert().sendKeys("Anjitha");
		Thread.sleep(2000);
		System.out.println("Third alert message is " +driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();// To close the alert.
		
	}

}
