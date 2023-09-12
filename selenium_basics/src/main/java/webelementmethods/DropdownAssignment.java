package webelementmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/jquery-select.php");
		driver.manage().window().maximize();
		WebElement al=driver.findElement(By.xpath("//span[contains(text(),'Alaska')]"));
		al.click();// It will get visible only by this way.
		List <WebElement> dropdown = driver.findElements(By.xpath("//ul[@class='select2-results__options']//li"));
		
		List<WebElement>litag=driver.findElements(By.xpath("//li"));// It will store all the dropdown elements in a list.
		System.out.println("Size of dropdown is "+litag.size());
		System.out.println("Name of the states are ");
		System.out.println(".........................");
		for (int i=1; i <=dropdown.size();i++)
		{
			String text=dropdown.get(i-1).getText();
			System.out.println(i+" "+text);
		}
	}

}
