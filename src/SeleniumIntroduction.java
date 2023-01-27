import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {
		//Invoke browsers
		//runs in chrome, edge, safari.
		//chrome - need ChromeDriver
		//ChromeDriver class will have all different methods to execute in chrome.
		//driver can access WebDriver methods + internal class methods of ChromeDriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.in/");
		driver.manage().window().maximize();
		System.out.println("Title of page is " + driver.getTitle());
		System.out.println("Current page URL is " + driver.getCurrentUrl());
		driver.findElement(By.className("gb_d")).click();
		System.out.println(driver.findElement(By.className("gb_d")));
		//driver.close();
		
		
		//FIREFOX LAUNCH
		//Gecko driver - works between selenium and firefox browser
		/*System.setProperty("webdriver.gecko.driver", "C:\\Users\\Windows\\Downloads\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.in/");
		System.out.println("Title of page is " + driver.getTitle());
		System.out.println("Current page URL is " + driver.getCurrentUrl());
		driver.close();*/
		
		//MICROSOFT EDGE LAUNCH
		
		/*System.setProperty("webdriver.edge.driver", "C:\\Users\\Windows\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.rahulshettyacademy.com/");
		driver.manage().window().maximize();
		System.out.println("Title of page is " + driver.getTitle());
		System.out.println("Current page URL is " + driver.getCurrentUrl());
		driver.close();*/
		
		
		
		
		
		
		
		
		
		
		
	}

}
