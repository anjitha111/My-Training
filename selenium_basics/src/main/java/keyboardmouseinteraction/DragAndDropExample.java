package keyboardmouseinteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement source=driver.findElement(By.xpath("(//li[@data-id='2']/a)[1]"));
		WebElement destination=driver.findElement(By.xpath("//ol[@id='amt7']/li"));
		Actions actions=new Actions(driver);
		actions.dragAndDrop(source, destination).build().perform();
	}

}
