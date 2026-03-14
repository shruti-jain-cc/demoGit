package seleniumcommunity;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementsSession2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.simplilearn.com/");
		driver.findElement(By.className("login")).click();
		driver.findElement(By.name("user_login")).sendKeys("jainshruti118@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Tudip@123");
		driver.findElement(By.name("btnlogin")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		 if (driver.getCurrentUrl().contains("dashboard"))
		 {
			 System.out.println("Login Success");
		 }
		 else
		 {
			 System.out.println("Login Failed");
		 }
		
		 driver.findElement(By.partialLinkText("Continue learning")).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

}
