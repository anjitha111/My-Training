package webelementmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebCssAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/bootstrap-alert.php");
		driver.manage().window().maximize();
		
		List<WebElement> alertbars=driver.findElements(By.xpath("//div[@class='col-md-6']/button"));
		System.out.println("Size of the alert bars is "+alertbars.size());
		System.out.println("Bootstrap alert elements are ");
		for(int i=0;i<alertbars.size();i++)
		{
			String text=alertbars.get(i).getText();
			System.out.println(text);
			System.out.println("Background colour is "+alertbars.get(i).getCssValue("background-color"));
			
		}
		
	}

}
