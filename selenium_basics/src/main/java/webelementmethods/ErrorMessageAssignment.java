package webelementmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorMessageAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/form-submit.php");
		driver.manage().window().maximize();
		WebElement submit_button=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		submit_button.click();
		List <WebElement> error_msg=driver.findElements(By.xpath("//div[@class='invalid-feedback']"));
		System.out.println("Error messages are ");
		for(WebElement index:error_msg)
		{
			String text=index.getText();
			System.out.println(text);
		}
			
	}

}
