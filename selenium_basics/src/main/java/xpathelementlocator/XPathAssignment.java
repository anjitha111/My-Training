package xpathelementlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAssignment {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/form-submit.php");
		driver.manage().window().maximize();
		WebElement fname = driver
				.findElement(By.xpath("//div[@class='col-md-4 mb-3']//input[@id='validationCustom01']"));
		fname.sendKeys("Niranjana");
		WebElement lname = driver
				.findElement(By.xpath("//div[@class='col-md-4 mb-3']//input[@id='validationCustom02']"));
		lname.sendKeys("Anuj");
		WebElement username = driver
				.findElement(By.xpath("//div[@class='input-group']//input[@id='validationCustomUsername']"));
		username.sendKeys("niru");
		WebElement city = driver
				.findElement(By.xpath("//div[@class='col-md-6 mb-3']//input[@id='validationCustom03']"));
		city.sendKeys("Kochi");
		WebElement state = driver
				.findElement(By.xpath("//div[@class='col-md-3 mb-3']//input[@id='validationCustom04']"));
		state.sendKeys("Kerala");
		WebElement zip = driver.findElement(By.xpath("//div[@class='col-md-3 mb-3']//input[@id='validationCustom05']"));
		zip.sendKeys("686254");
		WebElement agreecheckbox = driver.findElement(By.xpath("//label[@class='form-check-label']"));
		agreecheckbox.click();
		WebElement submitbutton = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		submitbutton.click();

	}

}
