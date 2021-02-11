package SeleniumAutomationProject.AutomationProject.FirstPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import org.testng.annotations.*;

public class FirstTestClass extends AbstractTestClass
{
	 WebDriver driver;
		
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("I will execute each method in the class");
		commonUtilityMethod();
	}
	
	
	@Test
	public void FirstMethod1()
	{
		System.out.println("First Method");
		commonUtilityMethod();
	}
	
	@Test
	public void FirstMethod2()
	{
		System.out.println("Second Method");
		commonUtilityMethod();
	}
	
	@Test
	public void testMethod1()
	{
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\Srujana Gavini\\Downloads\\chromedriver_win32\\chromedriver.exe");
      
		  // Launch chrome browser
          driver = new ChromeDriver();
          
          String baseURL = "http://demo.guru99.com/test/newtours/";
          String expTitle = "Welcome: Mercury Tour";
          String actTitle = "";
          
          // Open the URL in the chrome browser
          driver.get(baseURL);
          
          //get the actual value of the title
          actTitle = driver.getTitle();
          
          //displaying the atual and expected titles
          
          System.out.println("actTitle: "+actTitle);
          System.out.println("expTitle: "+expTitle);
          
          //comaring actual and expected titles
          Assert.assertEquals(actTitle, expTitle,"Title is not found");
          
          System.out.println("Test Passed");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("I will execute after every test method in the class");
		
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After executing all the test method in a class");
		driver.close();
		
	}
	
}
