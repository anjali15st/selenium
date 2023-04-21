import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Max_Screen {
public static void main(String[] args) throws Exception {
	System.setProperty("Webdriver.chrome.driver","D:\\\\Automation_Tools\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.close();
 }
}
