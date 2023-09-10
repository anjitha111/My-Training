package xpathelementlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAssignmentContains {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.manage().window().maximize();
		WebElement radiobutton=driver.findElement(By.xpath("//label[text()='Male']"));
		//div[@class='form-check form-check-inline']//label[text()='Male'])[2] [To get second occurrence.But not much preferred during interviews.]
		radiobutton.click();
		WebElement showbutton=driver.findElement(By.xpath("//button[contains(text(),'Show Selected Value')]"));
		showbutton.click();
		
		WebElement secondradio=driver.findElement(By.xpath("//label[contains(@for,'inlineRadio21')]"));
		secondradio.click();
		WebElement thirdradio=driver.findElement(By.xpath("//label[contains(@for,'inlineRadio23')]"));
		thirdradio.click();
		WebElement getresults=driver.findElement(By.xpath("//button[contains(@id,'button-two')]"));// To specify attribute as well.
		getresults.click();
		
	}
}