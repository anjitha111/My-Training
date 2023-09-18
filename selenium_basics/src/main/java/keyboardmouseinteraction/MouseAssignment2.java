package keyboardmouseinteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAssignment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.manage().window().maximize();
		WebElement male_btn = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));

		Actions action = new Actions(driver);
		action.click(male_btn).build().perform();
		
		WebElement submit=driver.findElement(By.xpath("//button[@id='button-one']"));
		action.click(submit).build().perform();

		WebElement msg=driver.findElement(By.xpath("//div[@id='message-one']"));
		System.out.println("Displayed text is "+msg.getText());
		
		if (male_btn.isSelected() == true)
			System.out.println("Male radio button is selected.");
		else
			System.out.println("Male radio button is not selected.");

	}

}
