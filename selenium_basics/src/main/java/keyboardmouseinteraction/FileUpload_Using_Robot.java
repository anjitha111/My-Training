package keyboardmouseinteraction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload_Using_Robot {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		
		
		WebElement choosefile=driver.findElement(By.xpath("//input[@name='file']"));
		action.moveToElement(choosefile).click().build().perform();
		
		Robot robot=new Robot();
		String path="D:\\Files\\Image.png";
		//choosefile.click();
		
		StringSelection ss = new StringSelection(path);//Type casting
		//Converts the String file name to a format or object which can be easily transferred to the file upload window which we get on clicking “Choose File” button of any website. 
		//At first, we need to import the following files in our program: import java. awt.
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null); // To set the clip board. Ctl+C
		
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);//To press control.It won't get pressed simultaneously.
		robot.keyPress(KeyEvent.VK_V); //V
		robot.delay(1000);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);//For release
		robot.keyRelease(KeyEvent.VK_V); 
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);// We will be pressing enter for every keyboard actions.
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement upload_button=driver.findElement(By.xpath("//input[@id='file-submit']"));
		//upload_button.click();
		
		action.moveToElement(upload_button).click().build().perform();//Another way.
		
		//Anyways using send keys is the best option.
	}
}