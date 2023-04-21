import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_dropdown {
public static void main(String[] args) throws Exception  {
	System.setProperty("webdriver.chrome.driver","D:\\Automation_Tools\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://output.jsbin.com/osebed/2");
	driver.manage().window().maximize();
	Select fruits=new Select(driver.findElement(By.id("fruits")));
	fruits.selectByVisibleText("Orange");
	fruits.selectByValue("banana");
	fruits.selectByIndex(3);
	fruits.selectByVisibleText("Apple");
	fruits.deselectByVisibleText("Banana");
	
	Thread.sleep(3000);
	driver.close();
}
}
