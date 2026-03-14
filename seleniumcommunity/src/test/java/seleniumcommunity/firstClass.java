package seleniumcommunity;


import org.openqa.selenium.WebElement;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class firstClass {

	public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	String title= driver.getTitle();
	System.out.println(driver.getTitle());
	if (title == "Amazon") {
		System.out.println("TestCase PASS");
	}
	else {
		System.out.println("TestCase FAIL");
	}
	WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("iPhone");
	search.sendKeys(Keys.ENTER);
		//driver.findElement(By.id("nav-search-submit-button")).click();
	}
	

}
