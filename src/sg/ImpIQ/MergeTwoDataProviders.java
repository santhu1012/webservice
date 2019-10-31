package sg.ImpIQ;

import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MergeTwoDataProviders 
{
	
	
	
	@Test(dataProvider="dataProviderTwo")
	public void usingTwoDataProviders(HashMap<String,String> data)
	{
		System.out.println("FirstName is:"+ data.get("FirstName"));
		System.out.println("LastName is:"+ data.get("LastName"));
		System.out.println("Location is:"+ data.get("Location"));
		
		System.out.println("email is:"+ data.get("email"));
		System.out.println("phone is :"+ data.get("phone"));
	}
	
	@DataProvider(name="mergedDataProvider")
	public static Object[][] mergedDataProvider()
	{
		HashMap<String,String> dp3 = new HashMap<String,String>();
		
		dp3.putAll((HashMap<String,String>) dataProviderOne()[0][0]);
		dp3.putAll((HashMap<String,String>) dataProviderTwo()[0][0]);
		
		
		Object[][] o = new Object[1][];
		o[0] = new Object[] {dp3};
		
		return o;
	}
	
	@DataProvider(name="dataProviderOne")
	public static Object[][] dataProviderOne()
	{
		Object[][] o = new Object[1][];
		
		HashMap<String,String> dp1 = new HashMap<String,String>();
		
		dp1.put("FirstName", "Santhosh");
		dp1.put("LastName", "Gowda");
		dp1.put("Location", "Bangalore");
		
		o[0] = new Object[] {dp1};
		
		return o;
		
		
	}
	

	@DataProvider(name="dataProviderTwo")
	public static Object[][] dataProviderTwo()
	{
		Object[][] o = new Object[1][];
		
		HashMap<String,String> dp2 = new HashMap<String,String>();
		
		dp2.put("email", "Santhosh.cs046@gmail.com");
		dp2.put("phone", "9739847707");
		
		
		o[0] = new Object[] {dp2};
		
		return o;
		
		
	}
	
}
