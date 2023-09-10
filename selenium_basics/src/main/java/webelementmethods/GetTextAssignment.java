package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement message=driver.findElement(By.xpath("//div[@class='form-group']//input[@id='single-input-field']"));
		message.sendKeys("Hello Everyone");
		WebElement showmsg=driver.findElement(By.xpath("//button[@id='button-one']"));
		showmsg.click();
		WebElement displayedmsg=driver.findElement(By.xpath("//div[contains(text(),'Your Message')]"));
		String text=displayedmsg.getText();
		System.out.println("Displayed message is "+text);

	}

}
