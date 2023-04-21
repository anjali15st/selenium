import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locating_by_innertext {
public static void main(String[] args) throws Exception {
	    System.setProperty("webdriver.chrome.driver","D:\\Automation_Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(3000);
		String passlabel= driver.findElement(By.cssSelector("font:contains(Password:)")).getText();
		System.out.println("passlabel");
		Thread.sleep(3000);
		driver.close();
		//Not working Incorrect program
}
}
