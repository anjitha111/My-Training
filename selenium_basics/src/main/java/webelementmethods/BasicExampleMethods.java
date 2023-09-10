package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicExampleMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement fbmoto = driver.findElement(By.xpath("//h2[@class='_8eso']"));
		String text=fbmoto.getText();// Method to get Webelement text.
		System.out.println("Webelement text is "+text);
		WebElement forgotpwd = driver.findElement(By.xpath("//a[contains(text(),'Forgotten password')]"));
		String text2=forgotpwd.getText();
		System.out.println("Forgot password text is "+text2);*/
		
		/*driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		WebElement checkbox1=driver.findElement(By.xpath("//form[@id='checkboxes']//input[1]"));
		WebElement checkbox2=driver.findElement(By.xpath("//form[@id='checkboxes']//input[2]"));
		System.out.println("Result 1 is "+checkbox1.isSelected());// To check whether the checkbox is selected or not.
		System.out.println("Result 2 is "+checkbox2.isSelected());
		if(!checkbox1.isSelected())
		{
			checkbox1.click();
		}
		if(!checkbox2.isSelected())
		{
			checkbox2.click();
		}
		System.out.println("New Result 1 is "+checkbox1.isSelected());
		System.out.println("New Result 2 is "+checkbox2.isSelected());*/
		
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.manage().window().maximize();
		WebElement malebutton=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		WebElement femalebutton=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		
		if(!malebutton.isSelected())
		{
			malebutton.click();
		}
		if(!femalebutton.isSelected())
		{
			femalebutton.click();
		}
		System.out.println("Result of radiobutton 1 " +malebutton.isSelected());
		System.out.println("Result of radiobutton 1 " +femalebutton.isSelected());
		System.out.println("Male:isDisplayed result is "+malebutton.isDisplayed());//It will display true even if it is not in bright colour.
		System.out.println("Female:isDisplayed result is "+femalebutton.isDisplayed());
	}

}