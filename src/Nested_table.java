import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_table {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Automation_Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/accessing-nested-table.html");
		Thread.sleep(3000);
		String innerText = driver.findElement(By.xpath("//html/body/center/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]")).getText(); 	
		        System.out.println(innerText); 
		        Thread.sleep(3000);
			driver.quit();

}
}
