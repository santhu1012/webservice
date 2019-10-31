package sg.ImpIQ;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class BootStrapHandleDropdown 
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
		
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.findElement(By.xpath("//div//button[contains(@class,'multiselect dropdown-toggle btn btn-default') and @type='button']")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label"));
		
		System.out.println(list.size());
		
		
		//select all the checkbox/options
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
			list.get(i).click();
		}
		

		//selecting Angular option
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("Angular"))
					{
				list.get(i).click();
				break;
					}
		}
		
	}

}
