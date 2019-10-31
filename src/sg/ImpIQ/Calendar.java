package sg.ImpIQ;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calendar 
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
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	Thread.sleep(3000);
	
	
	driver.switchTo().frame("mainpanel");
	
	String date = "32-July-2018";
	String dateArr[] = date.split("-"); //{18,july,2018}
	String day = dateArr[0];
	String month = dateArr[1];
	String year = dateArr[2];
	
	Select oselect = new Select(driver.findElement(By.name("slctMonth")));
	oselect.selectByVisibleText(month);
	
	Select oselect1 = new Select(driver.findElement(By.name("slctYear")));
	oselect1.selectByVisibleText(year);
	
	//*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]
	//*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]
	//*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[7]
	
	
	String beforeXpath = "//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[";
	String afterXpath = "]/td[";
	
	final int totalWeekDays = 7;
	String dayVal = null;
	boolean flag = false;
	
	for(int rowNum=2;rowNum<=7;rowNum++)
	{
		for(int colNum=1;colNum<=totalWeekDays;colNum++)
		{
			try
			{
			 dayVal = driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).getText();
			
			}
			catch(NoSuchElementException e)
			{
				System.out.println("please enter the current date value");
				flag = false;
				break;
				
			}
			System.out.println(dayVal);
			if(dayVal.equals(day))
			{
				driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).click();
				flag = true;
				break;
			}
		}
		if(flag)
		{
			break;
		}
		
	}
	
	
	

	}

}
