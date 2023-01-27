import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompareURL 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//driver.get("https://www.google.in/");
		driver.get("chrome://settings/");
		
		//System.out.println(driver.findElement(By.cssSelector("cr[aria-pressed='true']")));
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//String Expected = "updateStatusMessage";
		//String Actual ="";
		/*String ExpectedTitle = "Google";
		String ActualTitle = "";
		ActualTitle = driver.getTitle();
		if(ActualTitle.contentEquals(ExpectedTitle))
		{
			System.out.println("TEST IS PASS");
		}
		else
		System.out.println("TEST IS FAIL");
		System.out.println("Tagname is " + driver.findElement(By.className("gb_d")).getTagName());*/
		

	}
	

}
