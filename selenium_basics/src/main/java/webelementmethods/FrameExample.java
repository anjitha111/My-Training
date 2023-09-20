package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame(0); //To get switched to zeroth frame.
		driver.switchTo().frame("frame-left");//For getting the left-frames.
		WebElement left=driver.findElement(By.xpath("//body[contains(text(),'LEFT')]"));//No visibility inside the frame.We will get No such element exception.
		System.out.println("The frame name is "+left.getText());
	
	}

}
