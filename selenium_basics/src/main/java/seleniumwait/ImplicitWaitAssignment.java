package seleniumwait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/jquery-progress-bar.php");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement startdownload = driver.findElement(By.xpath("//button[@id='downloadButton']"));
		startdownload.click();
		WebElement text = driver.findElement(By.xpath("//div[contains(text(),'Complete!')]"));
		System.out.println("Displayed text is " + text.getText());
	}

}
