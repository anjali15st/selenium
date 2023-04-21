import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Location_By_tag_class {
public static void main(String[] args) throws Exception {
	System.setProperty("Webdriver.chrome.driver","D:\\Automation_Tools\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.cssSelector("input#email")).sendKeys("AnjaliH");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input#pass")).sendKeys("AnjaliH");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input.inputtext._55r1._6luy")).clear();
	Thread.sleep(3000);
	driver.close();
}
}
