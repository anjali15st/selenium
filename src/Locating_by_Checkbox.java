import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locating_by_Checkbox {
public static void main(String[] args) throws Throwable {
	System.setProperty("Webdriver.chrome.driver","D:\\Automation_Tools\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/radio.html");
	driver.manage().window().maximize();
	WebElement c1=driver.findElement(By.id("vfb-6-0"));
	WebElement c2=driver.findElement(By.id("vfb-6-1"));
	WebElement c3=driver.findElement(By.id("vfb-6-2"));
	Thread.sleep(3000);
	c1.click();
	if(c1.isSelected())
	{
		System.out.println("Checkbox 1 is selected");
	}
	Thread.sleep(1000);
	
	if(c2.isSelected())
	{
		System.out.println("checkbox 2 is selected");
	}
	else
	{
		System.out.println("Checkbox 2 is not selected");
	}
	Thread.sleep(1000);
	c3.click();
	Thread.sleep(1000);
	
	driver.close();
		
}
}
