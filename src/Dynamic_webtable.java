import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_webtable {
	public static void main(String[] args) throws Exception {
		WebDriver wd;
       System.setProperty("webdriver.chrome.driver","D:\\Automation_Tools\\chromedriver_win32\\chromedriver.exe");
		wd=new ChromeDriver();
		wd.get("https://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(3000);
		//No.of Columns
        List <WebElement> col = wd.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th[3]"));
        System.out.println("No of cols are : " +col.size()); 
        //No.of rows 
        List <WebElement> rows = wd.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th[3]"));
        System.out.println("No of rows are : " + rows.size());
        wd.close();
		
}
}
