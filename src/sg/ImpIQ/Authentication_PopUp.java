package sg.ImpIQ;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_PopUp 
{
	public static WebDriver driver;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\workspace\\Practice\\library\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		//http://username:password@test.com		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String popMessager = driver.findElement(By.cssSelector("p")).getText();
		System.out.println(popMessager);
		

	}

}
