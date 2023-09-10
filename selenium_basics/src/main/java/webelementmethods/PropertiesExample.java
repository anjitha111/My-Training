package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement searchfield=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		System.out.println("Webelement's tag name is " +searchfield.getTagName());//To print the tag name.Return type is string.
		System.out.println("Webelement's class attribute is "+searchfield.getAttribute("class"));// To get the tag attributes
		System.out.println("Webelement's id attribute is "+searchfield.getAttribute("id"));
		System.out.println("Webelement's name attribute is "+searchfield.getAttribute("name"));
		searchfield.sendKeys("Tabs");
		System.out.println("Webelement's value is "+searchfield.getAttribute("value"));//It will display the value we entered in the search field.*/
		
		driver.get("https://demo.guru99.com/test/social-icon.html");
		driver.manage().window().maximize();
		WebElement mail=driver.findElement(By.xpath("//div[@class='wf-td right-block']//a[@title='Mail']"));
		System.out.println("Title value is "+mail.getAttribute("title"));// To print the tool tip.
		
		
	}
}
