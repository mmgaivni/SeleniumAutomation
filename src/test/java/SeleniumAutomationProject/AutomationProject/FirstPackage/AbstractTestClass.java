package SeleniumAutomationProject.AutomationProject.FirstPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class AbstractTestClass {
	
	@BeforeTest
	public void beforeTestMethod()
	{
		System.out.println("Executing before test method");
	}
	
	@AfterTest
	public void afterTestMethod()
	{
		System.out.println("Executing after test method");
	}
	
	public void commonUtilityMethod()
	{
		System.out.println("executing common utility method");
		
	}


}
