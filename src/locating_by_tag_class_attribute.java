import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locating_by_tag_class_attribute {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","D:\\Automation_Tools\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input.inputtext._55r1._6luy[data-testid=royal_email]")).sendKeys("Anjali");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi[data-testid=royal_pass]")).sendKeys("Sheth");
	Thread.sleep(3000);
	driver.close();
}
}
