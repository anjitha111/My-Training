package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicElementMethodsAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.manage().window().maximize();

		WebElement clickcheckbox = driver.findElement(By.xpath("//input[@id='gridCheck']"));

		WebElement checkbox1 = driver.findElement(By.xpath("//input[@id='check-box-one']"));

		WebElement checkbox2 = driver.findElement(By.xpath("//input[@id='check-box-two']"));

		WebElement checkbox3 = driver.findElement(By.xpath("//input[@id='check-box-three']"));

		WebElement checkbox4 = driver.findElement(By.xpath("//input[@id='check-box-four']"));

		System.out.println("Click checkbox's displayed result is " + clickcheckbox.isDisplayed());

		System.out.println("Checkbox 1's displayed result is " + checkbox1.isDisplayed());
		System.out.println("Checkbox 2's displayed result is " + checkbox2.isDisplayed());
		System.out.println("Checkbox 3's displayed result is " + checkbox3.isDisplayed());
		System.out.println("Checkbox 4's displayed result is " + checkbox4.isDisplayed());
		System.out.println("Click checkbox's selected result is " + clickcheckbox.isSelected());
		System.out.println("Checkbox 1's selected result is " + checkbox1.isSelected());
		System.out.println("Checkbox 2's selected result is " + checkbox2.isSelected());
		System.out.println("Checkbox 3's selected result is " + checkbox3.isSelected());
		
		System.out.println("Checkbox 4's selected result is " + checkbox4.isSelected());
	}
}
