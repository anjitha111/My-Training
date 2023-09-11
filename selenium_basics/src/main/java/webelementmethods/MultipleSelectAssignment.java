package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		driver.manage().window().maximize();
		WebElement selectcolor=driver.findElement(By.xpath("//div[@class='form-group']//select[@id='multi-select-field']"));
		Select select=new Select(selectcolor);
		select.selectByVisibleText("Green");
		WebElement getfirstselected=driver.findElement(By.xpath("//button[@id='button-first']"));
		getfirstselected.click();
	}

}
