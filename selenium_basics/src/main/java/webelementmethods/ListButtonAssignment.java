package webelementmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListButtonAssignment {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/table-data-download.php");
		driver.manage().window().maximize();
		
		WebElement copy=driver.findElement(By.xpath(""));
		WebElement csv=driver.findElement(By.xpath(""));
		WebElement excel=driver.findElement(By.xpath(""));
		
		List<WebElement> buttons=driver.findElements(By.xpath(""));
		for(WebElement element:buttons)
			{
			System.out.println("Button name is "+element.getText());
			};

	}

}
