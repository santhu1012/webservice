package sg.ImpIQ;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable
{

	public static WebDriver driver;
	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\workspace\\Practice\\library\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		
		//*[@id="customers"]/tbody/tr[7]/td[1]
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int rowCount = rows.size();
		System.out.println("Total rows in Web table:"+rowCount);
		
		String beforeXpath = "//*[@id='customers']/tbody/tr[";
		String afterXpath = "]/td[1]";
		
		for(int i=2;i<=rowCount;i++)
		{
			String actualxpath = beforeXpath+i+afterXpath;
			WebElement ele = driver.findElement(By.xpath(actualxpath));
			System.out.println(ele.getText());
			
			if(ele.getText().equals("Island Trading"))
			{
				System.out.println("company name:"+ele.getText()+" is a found" + "at position :"+ (i-1));
				break;
			}
		}
		
		
		System.out.println("************************************");
		
		//*[@id="customers"]/tbody/tr[2]/td[2]
		String afterXpathContact = "]/td[2]";
		
		for(int i=2;i<=rowCount;i++)
		{
			String actualxpath = beforeXpath + i +afterXpathContact;
			WebElement ele = driver.findElement(By.xpath(actualxpath));
			System.out.println(ele.getText());
		}
		
		

		System.out.println("************************************");
		
		//*[@id="customers"]/tbody/tr[2]/td[3]
		String afterXpathCountry = "]/td[3]";
		
		for(int i=2;i<=rowCount;i++)
		{
			String actualxpath = beforeXpath + i +afterXpathCountry;
			WebElement ele = driver.findElement(By.xpath(actualxpath));
			System.out.println(ele.getText());
		}
		
		
				
		//Handle webTable columns :
		
		//*[@id="customers"]/tbody/tr[1]/th[1]
		//*[@id="customers"]/tbody/tr[1]/th[2]
		//*[@id="customers"]/tbody/tr[1]/th[3]
		
		
		String colBeforeXpath = "//*[@id='customers']/tbody/tr[1]/th[";
		String colAfterXpath = "]";
		List<WebElement> cols = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[1]/th"));
		
		int colCount = cols.size();
		System.out.println("total no of columns:"+colCount);
		
		System.out.println("columns values are:");
		for(int i=1;i<=colCount;i++)
		{
			WebElement element = driver.findElement(By.xpath(colBeforeXpath+i+colAfterXpath));
			String colText = element.getText();
			System.out.println(colText);
		}
		driver.close();

	}

}
