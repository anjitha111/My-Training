package elementlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 WebElement searchfield=driver.findElement(By.id("twotabsearchtextbox"));// Nosuch element exception occurred since I have given wrong id.[added2 at end]
		 //WebElement alldropdown=driver.findElement(By.name("url"));// All dropdown in Amazon site.
		 //WebElement alldropdown=driver.findElement(By.tagName("select"));
		 //searchfield.sendKeys("Phones");
		 //searchfield.clear();// To clear the existing data
		 //searchfield.sendKeys("Mobiles");
		 //alldropdown.click();
		 //WebElement alldropdown1=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		 //alldropdown1.sendKeys("Mobile phones");
		 WebElement searchfield2=driver.findElement(By.cssSelector(".nav-input.nav-progressive-attribute"));
		 searchfield.sendKeys("Tabs");
	}

}
