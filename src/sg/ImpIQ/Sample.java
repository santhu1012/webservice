package sg.ImpIQ;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample 
{
	public static WebDriver driver;

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\workspace\\Practice\\library\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@id='lst-ib' and @class='gsfi']")).sendKeys("selenium");
		
		//driver.close();
	}

}
