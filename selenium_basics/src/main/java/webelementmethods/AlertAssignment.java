package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
		driver.manage().window().maximize();
		WebElement click_me1=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		WebElement click_me2=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		WebElement prompt_box=driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
		
		click_me1.click();
		Thread.sleep(1000);
		System.out.println("Displayed alert text 1 is "+driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		
		click_me2.click();
		Thread.sleep(1000);
		System.out.println("Displayed alert text 2 is "+driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		prompt_box.click();
		driver.switchTo().alert().sendKeys("Anjitha");
		Thread.sleep(1000);
		System.out.println("Displayed alert text 3 is " +driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
	}

}
