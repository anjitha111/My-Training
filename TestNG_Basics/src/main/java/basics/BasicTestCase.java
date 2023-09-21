package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicTestCase {
	WebDriver driver;
	@BeforeMethod
	public void launchmeesho()
	{
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver=new EdgeDriver();
		driver=new ChromeDriver();
		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void verifyTitle()
	{
		String actual_title=driver.getTitle();
		System.out.println(actual_title);
		String expected_title="Online Shopping Site for Fashion, Electronics, Home & More | Meesho";
		Assert.assertEquals(actual_title,expected_title); //For validation
		
	}
}
