package sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class FileDownloading 
{

	public static WebDriver driver;
	public static void main(String[] args) throws FindFailed 
	{
		// TODO Auto-generated method stub
		
		Screen screen = new Screen();

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\workspace\\Practice\\library\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://www.softwaretestingmaterial.com/");
		
		driver.manage().window().maximize();
		
		Pattern pattern = new Pattern("C:\\Users\\user\\workspace\\Practice\\screenshots\\Untitled.png");
		
		screen.click(pattern);
		screen.doubleClick(pattern);
		
		
		
		
	}

}
