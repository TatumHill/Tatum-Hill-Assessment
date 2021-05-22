package genericfunctions;

import org.testng.annotations.Test;

public class Ex2Test {
	
	UtilityFunctions utils = new UtilityFunctions();

  @Test
  public void Test_2() throws Exception
	{
		//Open Chrome browser
		utils.SetupWebDriver("Chrome");
		
		//Wait
		utils.WaitTime(2);
		
		//Navigate to URL
		utils.NavigateToURL("http://demo.guru99.com/test/newtours/");
		
		//Wait
		utils.WaitTime(2);
		
  }
}
