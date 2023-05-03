import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload_files {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","D:\\Automation_Tools\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/upload/");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	WebElement uploadElement =driver.findElement(By.id("uploadfile_0"));
	uploadElement.sendKeys("C:\\sample2.html");
	Thread.sleep(3000);
	driver.findElement(By.id("terms")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("submitbutton")).click();
	Thread.sleep(3000);	
	Thread.sleep(1000);
	driver.close();
}
}
