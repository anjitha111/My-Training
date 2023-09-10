package elementlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataEntryLocator {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement message=driver.findElement(By.id("single-input-field"));
		message.sendKeys("Hello All");
		WebElement showmsg=driver.findElement(By.id("button-one"));
		showmsg.click();
	}
	}
