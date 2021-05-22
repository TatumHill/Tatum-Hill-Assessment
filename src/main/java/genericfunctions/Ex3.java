package genericfunctions;

import org.testng.annotations.*;

public class Ex3 {
	
UtilityFunctions utils = new UtilityFunctions();
	
	@Test
	public void Test() throws Exception
	{
		//Open Chrome browser
		utils.SetupWebDriver("Chrome");
		
		//Wait
		utils.WaitTime(2);
		
		//Navigate to URL
		utils.NavigateToURL("http://demo.guru99.com/test/newtours/");
		
		
		//Wait
		utils.WaitTime(2);
		
		//Expected Title
		String sExpectedTitle = "Welcome: Mercury Tours";
		
		//Actual Title
		String sActualTitle = utils.getWebdriver().getTitle();
		
		//Compare
		if(sActualTitle.equals(sExpectedTitle))
		{
			//Print to Console
			System.out.println("Title Matches, Test Passed");
		}
		else
		{
			//Print to Console
			System.out.println("Title does not match, Test Failed");
		}
		
		//Close Chrome Browser		
		utils.CloseBrowser();
	}}