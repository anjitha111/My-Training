package seleniumwait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitExample {

	public static void main(String[] args) throws InterruptedException
	{
			System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
			driver.manage().window().maximize();
			
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// Implicit wait syntax.Applicable to all webelements coming below this.
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));//It will always takes the latest given time.
			
			WebElement startbutton=driver.findElement(By.xpath("//div[@id='start']//button"));
			startbutton.click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement text=driver.findElement(By.xpath("//h4[contains(text(),'Hello World')]"));
			System.out.println("Displayed text is " +text.getText());//No such element exception came since it didn't find a webelement within a few seconds since there is a speed difference between browser and selenium.
	}

}
