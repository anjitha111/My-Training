package webelementmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/jquery-select.php");
		driver.manage().window().maximize();
		List <WebElement> dropdown = driver.findElements(By.xpath("//ul[@class='select2-results__options//li']"));
		List<WebElement>li=driver.findElements(By.tagName("id"));// It will store all the dropdown elements in a list/
		System.out.println("Size of dropdown is "+li.size());
		for (int i = 0; i <dropdown.size();i++)
		{
			String text=dropdown.get(i).getText();
			System.out.println("Elements in the dropdown are " + text);
		}
		driver.quit();
	}

}
