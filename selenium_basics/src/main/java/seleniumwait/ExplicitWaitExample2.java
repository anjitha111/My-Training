package seleniumwait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/jquery-progress-bar.php");
		driver.manage().window().maximize();

		WebElement startdownload = driver.findElement(By.xpath("//button[@id='downloadButton']"));
		startdownload.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions
				.invisibilityOfElementLocated(By.xpath("//button[contains(text(),'Cancel Download')]")));

		/*
		 * WebElement close_button=driver.findElement(By.
		 * xpath("//button[text()='Close' and @class='ui-button ui-corner-all ui-widget']"
		 * ));
		 * 
		 * if(close_button.isDisplayed()) // 2nd way {
		 * System.out.println("Actions are completed"); }
		 * 
		 * else System.out.println("Actions are not completed ");
		 */

		// WebElement
		// cancel_download=driver.findElement(By.xpath("//button[contains(text(),'Cancel
		// Download')]"));
		WebElement complete_message = driver.findElement(By.xpath("//div[@class='progress-label']"));

		// Always give wait before webdriver declaration.

		System.out.println("Displayed message is " + complete_message.getText());// 1st way
	}
}
