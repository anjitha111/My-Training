package webelementmethods;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Switching_Assignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/window-popup.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

		WebElement like_button = driver.findElement(By.xpath("//a[@class='btn btn-primary windowSingle']"));
		like_button.click();
		Set<String> windows_id = driver.getWindowHandles();

		String parent_window = driver.getWindowHandle();
		Iterator<String> itr = windows_id.iterator();
		while (itr.hasNext()) {
			String child_window = itr.next();// Fetch the data from the current position and points to the next.
			if (parent_window.equals(child_window)) {
				System.out.println("No need to switch");
			} else {
				driver.switchTo().window(child_window);
			}

		}

		WebElement connect = driver.findElement(By.xpath(
				"//div[@class='x1xka2u1 xqfms19']//span[contains(text(),'Connect with Obsqura Zone on Facebook')]"));
		System.out.println("Displayed text is " + connect.getText());
		WebElement login = driver.findElement(By.xpath(
				"//div[@class='x1n2onr6 x1ja2u2z x78zum5 x2lah0s xl56j7k x6s0dn4 xozqiw3 x1q0g3np xi112ho x17zwfj4 x585lrc x1403ito x972fbf xcfux6l x1qhh985 xm0m39n x9f619 xn6708d x1ye3gou xtvsq51 x1fq8qgq']"));
		if (login.isDisplayed() == true)
			System.out.println("Login button is displayed.");
		else
			System.out.println("Login button is not displayed.");

		driver.close();
		driver.switchTo().window(parent_window);
		System.out.println("Switched to parent window");

	}

}
