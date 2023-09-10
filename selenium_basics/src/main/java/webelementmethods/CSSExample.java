package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/bootstrap-alert.php");
		driver.manage().window().maximize();
		WebElement autoclosewarning=driver.findElement(By.xpath("//div[@class='col-md-6']//button[@id='autoclosable-btn-warning']"));
		
		System.out.println("Font colour value is "+autoclosewarning.getCssValue("color"));//To get the font colour.Can convert the code to colour using the site https://cssgenerator.org/rgba-and-hex-color-generator.html
		System.out.println("Background colour is "+autoclosewarning.getCssValue("background-color"));//To get the background colour.
		System.out.println("Font size is "+autoclosewarning.getCssValue("font-size"));// To get font size.
		System.out.println("Font style is "+autoclosewarning.getCssValue("font-style"));//To get font style.
	}

}
