package seleniumcommunity;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementsSession3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/index.php/");
		
		driver.findElement(By.partialLinkText("Create new account")).click();
        driver.findElement(By.name("firstname")).sendKeys("Shruti");
        driver.findElement(By.name("lastname")).sendKeys("Jain");
        Select month = new Select(driver.findElement(By.name("birthday_day"))); 
        month.selectByVisibleText("11");
        month.selectByValue("6");
       List<WebElement> allValues = month.getOptions();
       for(WebElement ele : allValues) 
       {
    	  System.out.println(ele.getText()); 
       
    	  if (ele.getText().equals("29"))
    	  {
    		  System.out.println("the date is present");
    	  }
       } 
       Select day = new Select(driver.findElement(By.name("birthday_month"))); 
       System.out.println(day.getFirstSelectedOption().getText());
       day.selectByVisibleText("Jun");
       List<WebElement> monthValues = day.getOptions();
       for (WebElement mon: monthValues)
       {
    	   System.out.println(mon.getText());
       }
       driver.findElement(By.xpath("//label[text()='Female']")).click();
       driver.findElement(By.name("websubmit")).click();
       
       
        
	}
	
}
