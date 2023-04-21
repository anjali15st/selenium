import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukri_demo {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","D:\\Automation_Tools\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(3000);
	driver.get("https://www.naukri.com/nlogin/login");
	Thread.sleep(3000);
	driver.findElement(By.id("usernameField")).sendKeys("ANjali");
	Thread.sleep(3000);
	driver.findElement(By.id("passwordField")).sendKeys("123a");
	Thread.sleep(3000);
	driver.findElement(By.linkText("Login")).click();
	Thread.sleep(3000);


driver.close();
}
}
