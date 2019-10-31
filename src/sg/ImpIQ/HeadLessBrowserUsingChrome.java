package sg.ImpIQ;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessBrowserUsingChrome 
{

	public static WebDriver driver;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\workspace\\Practice\\library\\Drivers\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		
		driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/index.html");
		
		System.out.println("login page title:"+driver.getTitle());
		
		driver.findElement(By.name("username")).sendKeys("santhu");
		driver.findElement(By.name("password")).sendKeys("1ac05cs046");
	//	driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	
		
		

	}

}
