package seleniumwait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("h	");
		driver.manage().window().maximize();
		Wait wait = new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)) //Then it will check for 6 times.Syntax for fluent wait.//Can give 
				.ignoring(Exception.class);//We can supress certain exception.
		
		WebElement start_download=driver.findElement(By.xpath("//button[@id='downloadButton']"));
		start_download.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Close' and @class='ui-button ui-corner-all ui-widget']")));
		WebElement text=driver.findElement(By.xpath("//div[text()='Complete!']"));
		System.out.println("Displayed text after completion is "+text.getText());
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='progress-label')]")));
		

	}

}
