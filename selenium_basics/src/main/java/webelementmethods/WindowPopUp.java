package webelementmethods;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		
		WebElement clickhere=driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickhere.click();
		//clickhere.click();
		
		Set<String> window_ids=driver.getWindowHandles();//Return set of string containing ids of all open tabs.
		//It contains parent and children.The set contains parent and child elements,but not in any particular order.
		System.out.println("Size of the set is "+window_ids.size());
	
		String parent_window=driver.getWindowHandle();//Returns the id of window which is in current control. getWindowHandles returns the id of all open tabs.
		System.out.println("ID is "+parent_window);// It will print different IDs when each time driver.get is executed.

		Iterator<String> iterate=window_ids.iterator();
		while(iterate.hasNext())
		{
			String child_window=iterate.next();//Taking each elements one by one.
			if(parent_window.equals(child_window))
			{
				System.out.println("No need to switch.");
			}
			else
			{
				driver.switchTo().window(child_window);
			}
		}
		WebElement new_window=driver.findElement(By.xpath("//h3[text()='New Window']"));
		System.out.println("Displayed text is "+new_window.getText());
		//clickhere.click(); It won't work since we are in the child window right now.
		driver.close();
		driver.switchTo().window(parent_window);
		clickhere.click();
	}

}
