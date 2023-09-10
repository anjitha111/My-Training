package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAssignment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		
		System.out.println("HTML page source is " +driver.getPageSource());// To get html code of the webpage.
		driver.manage().window().maximize();
		WebElement malebutton=driver.findElement(By.xpath("//div[@class='form-check form-check-inline']//input[@id='inlineRadio1']"));
		int x=malebutton.getLocation().getX();
		int y=malebutton.getLocation().getY();
		Dimension z=malebutton.getSize();// To get size. If we are printing directly,no need to mention the "Dimension" class.
		System.out.println("Size is "+z);
		System.out.println("X coordinate is "+x);// To get x coordinate.
		System.out.println("Y coordinate is "+y);// To get y coordinate.
		malebutton.click();
		WebElement showselectedvalue=driver.findElement(By.xpath("//button[@id='button-one']"));
		showselectedvalue.click();
		WebElement displayedmsg=driver.findElement(By.xpath("//div[@id='message-one']"));
		String text=displayedmsg.getText();
		System.out.println("Displayed message is "+text);

	}

}
