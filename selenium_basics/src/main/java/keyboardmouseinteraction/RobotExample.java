package keyboardmouseinteraction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotExample {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.manage().window().maximize();
		
		Robot robot=new Robot(); //No interaction with selenium
		robot.keyPress(KeyEvent.VK_DOWN);//keyEvent is a class.To press down arrow on keyboard.
		robot.keyPress(KeyEvent.VK_DOWN);// It will press down arrow for the second time.
		//Can we used for file upload using Ctl+c and Ctl+v

	}

}
