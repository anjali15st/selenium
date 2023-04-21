import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locating_by_image {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "D:\\Automation_Tools\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.tops-int.com/automation-testing-training-course");
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector("a[class=navbar-brand]")).click();
	String url=driver.getCurrentUrl();
	if(url.equals("https://www.tops--int.com/"))
	{
		System.out.println("test pass");
	}
	else
	{
		System.out.println("Test fail");
	}
	
	
	Thread.sleep(3000);
	driver.close();
}
}
