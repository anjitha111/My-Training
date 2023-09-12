package seleniumwait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicExample {

	public static void main(String[] args) throws InterruptedException
	{
	
			System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
			driver.manage().window().maximize();
			WebElement start=driver.findElement(By.xpath("//div[@id='start']//button"));
			start.click();
			Thread.sleep(8000);// We are giving wait time here.This is a java wait.
			WebElement text=driver.findElement(By.xpath("//h4[contains(text(),'Hello World')]"));
			System.out.println("Displayed text is "+text.getText());//No such element exception came since the speed of browser and selenium is different.It didn't wait since we haven't provided any wait time.
	}

}
