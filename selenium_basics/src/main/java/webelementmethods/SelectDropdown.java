package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement alldropdown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select select=new Select(alldropdown); //Select is an example of parametrised constructor.
		select.selectByIndex(0);//To select by index position
		select.selectByIndex(2);// It will select the 2nd indexed element in the dropdown.
		select.selectByValue("search-alias=alexa-skills");//To select the option based on the value given which was displayed in option tag.
		select.selectByVisibleText("Baby");//To select based on the visible text in the dropdown.
	
	}

}
