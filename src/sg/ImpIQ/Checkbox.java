package sg.ImpIQ;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Checkbox 
{

	public static WebDriver driver;
	
	@Test
	public void textbox() throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\workspace\\Practice\\library\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://my.monsterindia.com/create_account.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@id='ind']")).click();
		
		driver.findElement(By.xpath("//*[@title='Any']/preceding-sibling::div")).click();
		
		driver.findElement(By.xpath("//*[@class='right clip_image closedropdown']")).click();
		
	}
}


////*[@title="Any"]/preceding-sibling::div