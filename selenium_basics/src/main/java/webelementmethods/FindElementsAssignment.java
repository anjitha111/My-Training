package webelementmethods;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsAssignment{

	public static void main(String[] args) {
		
		
				System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
				driver.manage().window().maximize();
				List <WebElement> checkboxes= driver.findElements(By.xpath("//div[@class='form-group']//input"));//input is the child tag and div class='form-group' is the grandparent.
				for(int i=0;i<checkboxes.size();i++ )
				{
					String text=checkboxes.get(i).getAttribute("class");
					checkboxes.get(i).click();
					System.out.println("Ticked checkbox's class attribute is is "+text);
				
					
				}
	
	}
	
}