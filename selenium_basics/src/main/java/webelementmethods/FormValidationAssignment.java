package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormValidationAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/form-submit.php");
		driver.manage().window().maximize();
		WebElement submitform = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		String text = submitform.getText();

		System.out.println("Label of the button is " + text);
		System.out.println("Selected status of submit form button is " + submitform.isSelected());
		System.out.println("Enable status of submit form button is " + submitform.isEnabled());

		WebElement terms = driver.findElement(By.xpath("//label[@class='form-check-label']"));
		String text1 = terms.getText();
		System.out.println("Label of the terms and conditions is " + text1);
		System.out.println("Selected status of terms and conditions checkbox is " + terms.isSelected());
		System.out.println("Enable status of terms and conditions checkbox is " + terms.isEnabled());

		WebElement fname = driver
				.findElement(By.xpath("//div[@class='col-md-4 mb-3']//input[@id='validationCustom01']"));
		System.out.println("Display status of the field First name is " + fname.isDisplayed());

		WebElement lname = driver
				.findElement(By.xpath("//div[@class='col-md-4 mb-3']//input[@id='validationCustom02']"));
		System.out.println("Display status of the field Last name is " + lname.isDisplayed());

		WebElement uname = driver
				.findElement(By.xpath("//div[@class='input-group']//input[@id='validationCustomUsername']"));
		System.out.println("Display status of the field Username is " + uname.isDisplayed());

		WebElement city = driver
				.findElement(By.xpath("//div[@class='col-md-6 mb-3']//input[@id='validationCustom03']"));
		System.out.println("Display status of the field City is " + city.isDisplayed());

		WebElement state = driver
				.findElement(By.xpath("//div[@class='col-md-3 mb-3']//input[@id='validationCustom04']"));
		System.out.println("Display status of the field State is " + state.isDisplayed());

		WebElement zip = driver.findElement(By.xpath("//div[@class='col-md-3 mb-3']//input[@id='validationCustom05']"));
		System.out.println("Display status of the field Zip is " + zip.isDisplayed());

	}

}
