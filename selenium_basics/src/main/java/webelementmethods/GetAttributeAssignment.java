package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/jquery-progress-bar.php");
		driver.manage().window().maximize();
		WebElement startdownload=driver.findElement(By.xpath("//button[@id='downloadButton']"));
		System.out.println("Webelement's tag name is " +startdownload.getTagName());
		System.out.println("Webelement's class attribute is "+startdownload.getAttribute("class"));
		System.out.println("Webelement's id attribute is "+startdownload.getAttribute("id"));
	}

}
