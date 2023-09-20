package webelementmethods;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/window-popup.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		WebElement like_button=driver.findElement(By.xpath("//a[@class='btn btn-primary windowSingle']"));
		like_button.click();
		WebElement followbutton=driver.findElement(By.xpath("//a[@id='windowMulti']"));
		followbutton.click();
		Set<String> windows_id=driver.getWindowHandles();
		
		String parent_window=driver.getWindowHandle();
		Iterator<String> itr=windows_id.iterator();
		while(itr.hasNext())
		{
			String child_window=itr.next();//Fetch the data from the current position and points to the next.
			driver.switchTo().window(child_window);
			String title=driver.getTitle();
			System.out.println("Title is "+title);
			if(title.contains("Instagram")) 
			{
				driver.manage().window().maximize();
				break;//It won't go to other pages.
			}
			else
			{
				driver.close();// It will close all other tabs except instagram tab.
			}
			
		}
	}
}

/*We can do this using for each loop as well.
for(String item:childwindow)
{
	driver.switchTo().window(item);
	String title=driver.getTitle();
	System.out.println(title);
	
*/