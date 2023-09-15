package keyboardmouseinteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClicks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		//WebElement right_click=driver.findElement(By.xpath("//span[text()='right click me']"));
		//WebElement double_click=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		//actions.contextClick(right_click).build().perform();//For right click
		//actions.contextClick().build().perform();
		//Example for method overloading.With and w/o parameters.
		//actions.doubleClick(double_click).build().perform();//For double click.
		//actions.doubleClick().build().perform();
		driver.get("https://selenium.obsqurazone.com/form-submit.php");
		WebElement firstname=driver.findElement(By.xpath("//input[@id='validationCustom01']"));
		Actions actions=new Actions(driver);
		//actions.sendKeys(firstname,"Anjitha").build().perform();// To input the element in the text field.
		actions.clickAndHold(firstname).build().perform();// To continuously click on that web element.
		actions.release(firstname).build().perform();// To release the mouse click.
		//firstname.clear(); It worked even w/o giving release actions.
		actions.keyDown(Keys.ENTER).build().perform();//To press ENTER key,shift key etc.
	
		
		
	}

}
