package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/form-submit.php");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert ('Anjitha')");
		driver.switchTo().alert().accept();
		
		WebElement fname = driver
				.findElement(By.xpath("//div[@class='col-md-4 mb-3']//input[@id='validationCustom01']"));
			fname.sendKeys("Anvi");

		WebElement lname = driver
				.findElement(By.xpath("//div[@class='col-md-4 mb-3']//input[@id='validationCustom02']"));
		lname.sendKeys("Nair");

		WebElement uname = driver
				.findElement(By.xpath("//div[@class='input-group']//input[@id='validationCustomUsername']"));
		uname.sendKeys("anvinair");
		
		WebElement city = driver
				.findElement(By.xpath("//div[@class='col-md-6 mb-3']//input[@id='validationCustom03']"));
		city.sendKeys("Kochi");

		WebElement state = driver
				.findElement(By.xpath("//div[@class='col-md-3 mb-3']//input[@id='validationCustom04']"));
		state.sendKeys("Kerala");

		WebElement zip = driver.findElement(By.xpath("//div[@class='col-md-3 mb-3']//input[@id='validationCustom05']"));
		zip.sendKeys("682307");
		
		WebElement terms = driver.findElement(By.xpath("//input[@id='invalidCheck']"));
		js.executeScript("arguments[0].click();",terms);
		
		WebElement submit_button=driver.findElement(By.xpath("//button[text()='Submit form']"));
		js.executeScript("arguments[0].click();",submit_button);
		
	}

}
