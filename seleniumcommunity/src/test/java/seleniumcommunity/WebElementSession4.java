package seleniumcommunity;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementSession4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.makemytrip.com/");
	    Actions actions = new Actions(driver);
	    actions.moveByOffset(10, 10).click().build().perform();
	    WebElement hotel= driver.findElement(By.xpath("//span[text()='Hotels']"));
		hotel.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hotel.sendKeys(Keys.PAGE_DOWN);
		
		
		
		
	}

}
