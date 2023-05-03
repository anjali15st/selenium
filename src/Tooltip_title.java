import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip_title {
	public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.chrome.driver","D:\\Automation_Tools\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.guru99.com/test/social-icon.html");
			//driver.manage().window().maximize();
			Thread.sleep(3000);
			 String expectedTooltip = "Github";	
			 WebElement github = driver.findElement(By.xpath("//*[@id=\"page\"]/div[2]/div/a[4]"));	
			 
		        
		        //get the value of the "title" attribute of the github icon		
		        String actualTooltip = github.getAttribute("title");	
		        
		        //Assert the tooltip's value is as expected 		
		        System.out.println("Actual Title of Tool Tip"+actualTooltip);							
		        if(actualTooltip.equals(expectedTooltip)) {							
		            System.out.println("Test Case Passed");		
		           }
		 
	 driver.close();
}
}

