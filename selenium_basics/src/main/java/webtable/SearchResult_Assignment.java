package webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResult_Assignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/table-sort-search.php");
		driver.manage().window().maximize();
		
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		WebElement search=driver.findElement(By.xpath("//input[@type='search']"));
		search.sendKeys("Brielle Williamson");
		//wait.until(ExpectedConditions.elementToBeClickable(search));
		
		List <WebElement> row_data=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tr[@class='odd']//td"));
		System.out.println("Brielle Williamson's details :");
		for(WebElement index:row_data)
		{
			System.out.println(index.getText());
		}
		

	}

}
