package seleniumwait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/dynamic-load.php");
		driver.manage().window().maximize();
		
		
		WebElement getnewuser=driver.findElement(By.xpath("//button[@id='save']"));
		getnewuser.click();
		
		//Explicit wait
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='card text-center']/img")));
		WebElement name=driver.findElement(By.xpath("//div[@class='card-body']/h5"));
		WebElement email=driver.findElement(By.xpath("//div[@class='card-body']//p"));
		
		System.out.println("Name is "+name.getText());
		System.out.println("E-Mail ID is "+email.getText());

	}

}
