package webelementmethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitchingUsingForEach {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		
		WebElement clickhere=driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickhere.click();
	
		Set<String> window_ids=driver.getWindowHandles();
		
		String parent_window=driver.getWindowHandle();
		System.out.println("ID is "+parent_window);
		
		for(String id:window_ids)
		{
			if(parent_window.equals(id))
			{
				System.out.println("No need to switch.");
			}
			else
			{
				driver.switchTo().window(id);
			}
		}
		WebElement new_window=driver.findElement(By.xpath("//h3[text()='New Window']"));
		System.out.println("Displayed text is "+new_window.getText());
		driver.close();
		driver.switchTo().window(parent_window);
		clickhere.click();
	}

}
