package SeleniumAutomationProject.AutomationProject.FirstPackage;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SecondTestClass {
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before executing each class");
	}
		
	@Test
	public void FirstMethod1()
	{
		System.out.println("First Method");
	}
	
	@Test
	public void FirstMethod2()
	{
		System.out.println("Second Method");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After executing each class");
	}
	

}
