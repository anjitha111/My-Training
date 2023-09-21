package webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");
		driver.manage().window().maximize();
		
		WebElement office_heading=driver.findElement(By.xpath("//table[@id='dtBasicExample']//thead//tr[1]//th[3]"));
		System.out.println("Third column heading is "+office_heading.getText());
		List<WebElement> allheadings=driver.findElements(By.xpath("//table[@id='dtBasicExample']//thead//tr[1]//th"));
		
		//thead:Table heading
		//To print all title headings
		System.out.println("Title headings : ");
		System.out.println("......................");
		for(WebElement element:allheadings)
		{
			System.out.println(element.getText());
		}
		
		List<WebElement> footerheadings=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tfoot//tr[1]//th"));//tfoot : Table footer
		
		//To print all footer headings.
		System.out.println("Footer headings : ");
		System.out.println("......................");
		for(WebElement element:footerheadings)
		{
		 System.out.println(element.getText());
		}
		
		WebElement cedric_position=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[4]//td[2]"));//tr-Table row,td-Table column tbody-table body.
	
			System.out.println("Cedric Kelly's position is "+cedric_position.getText());
		
			List<WebElement> names=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
			//To print all names.
			System.out.println("Displayed names are : ");
			System.out.println("......................");
			for(WebElement element:names)
			{
				System.out.println(element.getText());
			}
			//To print the details of Herrod.
			System.out.println("Herrod Chandler's details : ");
			System.out.println("......................");
			List<WebElement> herrod_chandler=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[7]//td"));
			
			for(WebElement element:herrod_chandler)
			{
				 System.out.println(element.getText());
			}
	}

}
