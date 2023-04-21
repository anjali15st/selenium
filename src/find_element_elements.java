import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class find_element_elements {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","D:\\Automation_Tools\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/ajax.html");
	List<WebElement> elements=driver.findElements(By.name("name"));
	System.out.println("Number of elements:" +elements.size());
	driver.manage().window().maximize();
	for(int i=0; i<elements.size();i++)
	{
		System.out.println("Radio button text:"+elements.get(i).getAttribute("value"));
	}
	Thread.sleep(3000);
	driver.close();
	
}
}

