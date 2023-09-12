package seleniumwait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));// Maximum amount of time it is supposed to wait.
		
		WebElement startbutton=driver.findElement(By.xpath("//div[@id='start']//button"));
		//wait.until(ExpectedConditions.elementToBeClickable(startbutton));//wait.until is a method.ExpectedConditions is a class.
		startbutton.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(),'Hello World')]")));// It should be before Webelement declaration since we haven't got this webelement loaded.visibilityOfElementLocated is a static method.
		WebElement text1=driver.findElement(By.xpath("//h4[contains(text(),'Hello World')]"));
		
		System.out.println(text1.getText());

	}

}
