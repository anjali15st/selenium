import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locating_By_tag_attribute {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","D:\\Automation_Tools\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	driver.findElement(By.cssSelector("input[name=firstName")).sendKeys("ANjali");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input[name=lastName")).sendKeys("Sheth");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input[name=phone")).sendKeys("9874563256");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input[name=userName")).sendKeys("abc@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input[name=address1")).sendKeys("a-301");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input[name=city")).sendKeys("Ahmd");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input[name=state")).sendKeys("Gujrat");
	Thread.sleep(3000);
	driver.close();
}
}
