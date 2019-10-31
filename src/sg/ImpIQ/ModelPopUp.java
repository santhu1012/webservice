package sg.ImpIQ;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ModelPopUp 
{

	public static WebDriver driver;
	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\workspace\\Practice\\library\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		
		driver.get("https://www.freecrm.com/index.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Thread.sleep(5000);
		
		driver.findElement(By.name("username")).sendKeys("santhu");
		driver.findElement(By.name("password")).sendKeys("1ac05cs046");
		
		
		driver.switchTo().frame("intercom-borderless-frame");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'intercom-chat-card-author')]"))).build().perform();
		
		driver.findElement(By.xpath("//div[contains(@class,'intercom-borderless-discuss-button')]//span")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

}
