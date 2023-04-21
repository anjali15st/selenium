import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locater_demo {
	
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Automation_Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Thread.sleep(3000);
        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);
        driver.findElement(By.name("email")).sendKeys("Anjali");
        Thread.sleep(3000);
        driver.findElement(By.id("pass")).sendKeys("Anjali123");
        Thread.sleep(3000);
        driver.findElement(By.linkText("Forgotten password?"));
        Thread.sleep(4000);

        driver.close();
	}
	

}
