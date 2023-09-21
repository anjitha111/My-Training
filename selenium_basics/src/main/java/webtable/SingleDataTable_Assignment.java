package webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleDataTable_Assignment{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");
		driver.manage().window().maximize();
		
		WebElement collen_age=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tr[9]//td[4]"));
		System.out.println("Age of Collen Hurst is "+collen_age.getText());
		
		WebElement herrod_sal=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tr[7]//td[6]"));
		System.out.println("Salary of Herrod Chandler is "+herrod_sal.getText());
		

		List <WebElement> sonya_details=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tr[10]//td"));
		System.out.println("Sonya Frost's details : ");
		for(WebElement index:sonya_details)
		{
			System.out.println(index.getText());
		}
		
		
	}
}