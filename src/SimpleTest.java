import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleTest {

	
	public static void main(String[] args)throws Exception 
	{	
		System.setProperty("webdriver.chrome.driver","D:\\Automation_Tools\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    Thread.sleep(3000);
	    driver.get("https://www.facebook.com");
	    Thread.sleep(3000);
	    driver.findElement(By.name("email")).sendKeys("Anjali");
	    Thread.sleep(3000);
	    driver.close();
		
	}
}
