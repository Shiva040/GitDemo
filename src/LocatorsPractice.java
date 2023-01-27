import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice 
{

	public static void main(String[] args) 
	{
		//implicit wait: if we give5 seconds delay, after every line,it will delay for 5 seconds
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.get("https://www.google.in/");
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Shiva");
		driver.findElement(By.name("inputPassword")).sendKeys("850077");
		driver.findElement(By.className("signInBtn")).click();
		//System.out.println(driver.findElement(By.className("error")));
		// CSS Selector- Class name: Tagname.Classname, id: Tagname#id
		//Link text locator: tag should be anchor represented by a.
		//if represented by a, then it is a link
	    System.out.println((driver.findElement(By.cssSelector("p.error"))).getText());
		/*String x = driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println("Value is " + x);
		String[] str = x.split(" ");
		for(int i=0; i<str.length; i++)
		System.out.println(str[i]);*/
	    ///////
	    driver.findElement(By.linkText("Forgot your password?")).click();
	    //Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Shi");
	    //driver.findElement(By.cssSelector("$('input')")).sendKeys("Shi");
	     driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("shiva@gmail.com");;
	    //x.sendKeys("shiva@gmail.com");
	     driver.findElement(By.cssSelector("input[type='text']:nth-child(2)")).clear();//for CSS locator
	    //driver.findElement(By.xpath("//input[@type='text'][2]")).clear();//for xpath locator
	    driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Shivakumar");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9490252264");
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
	    //var x= driver.findElement(By.cssSelector((".infoMsg"))).getText();
		var x= driver.findElement(By.cssSelector("form p")).getText();
		System.out.println("String is " + x);
		

	}

}
