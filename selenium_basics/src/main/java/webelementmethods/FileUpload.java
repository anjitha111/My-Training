package webelementmethods;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		WebElement choosefile=driver.findElement(By.xpath("//input[@name='file']"));
		choosefile.sendKeys("D:\\Files\\Image.png");// To upload an image.
		driver.get("https://the-internet.herokuapp.com/upload");//stale element reference exception : Caused due to session id difference.
		
		choosefile=driver.findElement(By.xpath("//input[@name='file']"));// Re-initiated to get it assigned to a new session.
		File file=new File("D:\\Files\\Image.png");
		choosefile.sendKeys(file.getAbsolutePath());// It will return the file's path.[Second way]
		
	}

}
