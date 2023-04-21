import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Location_By_Tag_Id 
{
	public static void main(String[] args) throws Exception {
		System.setProperty("WebDriver.chrome.driver","D:\\Automation_Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.cssSelector("input#email")).sendKeys("Anjali");
        driver.findElement(By.cssSelector("input#pass")).sendKeys("Anjali123");
        
        Thread.sleep(3000);
        driver.close();
	}

}
