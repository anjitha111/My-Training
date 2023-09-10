package xpathelementlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_06Sep {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		//WebElement forgotlink=driver.findElement(By.xpath("//a[starts-with(text(),'Forgotten')]"));
		//forgotlink.click();
		//WebElement amazonlogo=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		//WebElement amazonsearchbar=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		WebElement image_bar=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']//following::input[@id='twotabsearchtextbox']"));// 'following' usage
		image_bar.sendKeys("Phones");
		
		//input[@id='inlineRadio1']/following-sibling::label-> To take the immediate sibling [input's].If we remove sibling,it will take other tag's siblings as well.
		//label[@for='inlineRadio1']/preceding-sibling::input-> To take the immediate preceeding sibling.
		
		//If double slash is used,it will traverse after immediate or preceeding ones.

	}

}
