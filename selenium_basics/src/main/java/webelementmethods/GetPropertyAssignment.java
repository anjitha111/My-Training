package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPropertyAssignment {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/window-popup.php");
		driver.manage().window().maximize();
		WebElement likeusbutton =driver.findElement(By.xpath("//a[@class='btn btn-primary windowSingle']"));
		System.out.println("Tool tip of Like Us on Facebook button is " +likeusbutton.getAttribute("title"));
		WebElement followall=driver.findElement(By.xpath("//a[@class='btn btn-success']"));
		System.out.println("Background colour of the button follow all is "+followall.getCssValue("background-color"));
		System.out.println("Font size of the Like Us on Facebook button is "+likeusbutton.getCssValue("font-size"));

	}

}
