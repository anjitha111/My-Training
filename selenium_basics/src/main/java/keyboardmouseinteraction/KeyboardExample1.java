package keyboardmouseinteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardExample1{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchbar=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		//searchbar.sendKeys("Latest Lenovo laptops" +Keys.ENTER);// To perform enter in the keyboard.
		searchbar.sendKeys("Iphone 14 pro max" +Keys.BACK_SPACE);//It will remove the last char.
		Thread.sleep(2000);
		searchbar.sendKeys(Keys.chord(Keys.CONTROL,"A")+Keys.BACK_SPACE);// Cntrl+A action plus clears all text.
		
	
		
	}

}
