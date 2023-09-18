package keyboardmouseinteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/form-submit.php");
		driver.manage().window().maximize();
		WebElement fname=driver.findElement(By.xpath("//input[@id='validationCustom01']"));
		
		Actions actions=new Actions(driver);
		actions.sendKeys(fname,"Ayaansh").build().perform();
		
		WebElement lname=driver.findElement(By.xpath("//input[@id='validationCustom02']"));
		actions.sendKeys(lname,"Vishnu Nair").build().perform();
		
		WebElement uname=driver.findElement(By.xpath("//input[@id='validationCustomUsername']"));
		actions.sendKeys(uname,"ayaansh").build().perform();
		
		WebElement city=driver.findElement(By.xpath("//input[@id='validationCustom03']"));
		actions.sendKeys(city,"Ernakulam").build().perform();
		
		WebElement state=driver.findElement(By.xpath("//input[@id='validationCustom04']"));
		actions.sendKeys(state,"Kerala").build().perform();
		
		WebElement zip=driver.findElement(By.xpath("//input[@id='validationCustom05']"));
		actions.sendKeys(zip,"682305").build().perform();

		WebElement terms_checkbox=driver.findElement(By.xpath("//input[@class='form-check-input']"));
		actions.click(terms_checkbox).build().perform();
		
		WebElement submit_button=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		actions.click(submit_button).build().perform();
		

	}

}
