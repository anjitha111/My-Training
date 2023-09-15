package keyboardmouseinteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseBasics {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/window-popup.php");
		driver.manage().window().maximize();
		WebElement likeusbutton=driver.findElement(By.xpath("//a[text()='  Like us On Facebook ']"));
		Actions actions=new Actions(driver);//Aggregation
		actions.moveToElement(likeusbutton).build().perform();//It will make it ready to perform the execution.It will show the tool tip here.
		actions.moveToElement(likeusbutton, 10, 10).build().perform(); // Eg: for method overloading.We are just specifying the coordinates.
		System.out.println("X coordinate is "+likeusbutton.getLocation().getX());
		System.out.println("Y coordinate is "+likeusbutton.getLocation().getY());
		actions.moveByOffset(518, 275);
		//actions.doubleClick(likeusbutton).build().perform();//It will double click on the specified webelement.
		actions.click(likeusbutton).build().perform();//It will click on the web element
		
	}

}
