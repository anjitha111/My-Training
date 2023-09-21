package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementButtonAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/table-data-download.php");
		driver.manage().window().maximize();
		
		//List <WebElement> buttons=driver.findElements(By.xpath("//div[@class='dt-buttons']"));//It will be giving the result horizontally.
		List <WebElement> buttons=driver.findElements(By.xpath("//div[@class='dataTables_wrapper dt-bootstrap4']//button[@type='button']"));
		System.out.println("Displayed buttons are : ");
		for(WebElement index:buttons)
		{
			System.out.println(index.getText());
		}

	}

}
