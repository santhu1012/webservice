package sg.ImpIQ;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarSelectByJS
{

	public static WebDriver driver;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\workspace\\Practice\\library\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.spicejet.com/");
				
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement date = driver.findElement(By.id("ctl00_mainContent_view_date1"));
		
		String dateVal = "22-11-2017";
		
		selectdateByJS(driver, date, dateVal);

	}
	
	public static void selectdateByJS(WebDriver driver,WebElement element,String dateVal)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');",element);
	}

}
