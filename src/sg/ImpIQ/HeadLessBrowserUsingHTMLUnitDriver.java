package sg.ImpIQ;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadLessBrowserUsingHTMLUnitDriver 
{
	public static WebDriver driver;

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\workspace\\Practice\\library\\Drivers\\chromedriver.exe");
		
		driver = new HtmlUnitDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/index.html");
		
		System.out.println("before login page title:"+driver.getTitle());
		
		driver.findElement(By.name("username")).sendKeys("santhu");
		driver.findElement(By.name("password")).sendKeys("1ac05cs046");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		System.out.println("after login page title:"+driver.getTitle());
		

	}

}
