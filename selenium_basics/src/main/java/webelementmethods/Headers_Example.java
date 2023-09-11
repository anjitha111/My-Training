package webelementmethods;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Headers_Example {

	public static void main(String[] args) {
		
		
				System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://selenium.obsqurazone.com/index.php");
				driver.manage().window().maximize();
				WebElement progressbar=driver.findElement(By.xpath("//ul[@class='navbar-nav']//li[5]//a")); // Since it contains multiple li class,to get the exact match w gave a tag as well.
				System.out.println("Displayed text is "+progressbar.getText());
				
				List <WebElement> headers=driver.findElements(By.xpath("//ul[@class='navbar-nav']//li//a"));
				System.out.println("Size of the list is "+headers.size());// This list consists of 8 webelements.
				for(int index=0;index<headers.size();index++)
				{
					String text=headers.get(index).getText();// To print the text label.
					System.out.println("Progress bar label is " +text);
					String attribute=headers.get(index).getAttribute("class");
					System.out.println("Attribute value is "+attribute);
				
				}
				for(WebElement element:headers) // For List,Strings,Array
				{
					String text1=element.getText();
					System.out.println("Progress bar item is " +text1);
				}
				List<WebElement>atag=driver.findElements(By.tagName("a"));// It will store all the a tag webelements to a list.
				System.out.println("Size of atag is "+atag.size());
				for(WebElement element:atag) 
				{
					String string1=element.getAttribute("href");
					System.out.println("A tag data is "+string1);
					String string2=element.getAttribute("class");
					System.out.println("Class attribute of a tag is "+string2);
				}
				driver.quit();
	}

}
