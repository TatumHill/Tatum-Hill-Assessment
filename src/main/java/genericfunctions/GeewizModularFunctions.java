package genericfunctions;

//TestNG
import org.testng.annotations.*;

//Excel
import org.apache.poi.ss.usermodel.*;

public class GeewizModularFunctions {
	
	public int iRow;
	public Sheet sheet;
	public String sRun;
	public String timeStamp;
	
	UtilityFunctions utils = new UtilityFunctions();
	AssFunctionLibrary funcLibs = new AssFunctionLibrary();
	DataFunctions data = new DataFunctions();
	Reporting repo = new Reporting();
	
	@BeforeMethod
	public void beforeMethod() throws Exception
	{
		//Setup WebDriver and Initialize Extent Reports
		utils.Setup("chrome");
		
		//Wait
		utils.WaitTime(2);
	}
	
	@Test()
	public void main() throws Exception {
		// TODO Auto-generated method stub
		
		//Get Sheet
		sheet = data.readExcel("\\TestData\\DemoTours6.xlsx","Sheet1");
		
		//Get Number of Rows from Excel
		iRow = DataFunctions.rowCount(sheet);
		
		
		for(int x=1; x<iRow; x++)
		{
			//Check Run Status
			sRun = DataFunctions.getExcelCellData("Run", x, sheet);
			
			if(sRun.toUpperCase().equals("YES"))
			{
				System.out.println("**** Starting Iteration: "+ x+" ****");
				
				//Creates the name of the Extent Report
				repo.setExtentTest(repo.getExtent().createTest("Geewiz - "+x));
				
				//Navigate to URL
				funcLibs.NavigateToURL(sheet, x);
				
				//Search item
				funcLibs.Search(sheet, x);
				
				//Sort Item
				funcLibs.SortBy(sheet, x);
				
				//Wait
		          utils.WaitTime(5);
		          
		        //Wait
		          utils.WaitTime(5);
				
				//Click First Result
				funcLibs.ClickFirstResult();
				
				//Enter QTY
				funcLibs.EnterQTY(sheet, x);
				
				//AddToCart
				funcLibs.AddToCart();
				
				//ContinueShopping
				funcLibs.ContinueShopping();
				
				System.out.println("**** Ending Iteration: "+ x+" ****");
				
				//Get Current Timestamp
		        timeStamp = DataFunctions.getTimeStamp();
				
				DataFunctions.writeExcel("Status", x, sheet, "Passed_"+timeStamp);
				//DataFunctions.writeExcel("Price", x, sheet, "Passed_"+timeStamp);
				//DataFunctions.writeExcel("CartAmount", x, sheet, "Passed_"+timeStamp);
				
				
			}
		}
	}
	
	@AfterMethod
	public void afterMethod() throws Exception
	{
		//Wait
		utils.WaitTime(5);
		
		//Close Browser and WebDriver
		utils.CloseBrowser();
		
		//Close and Save Extent Report
		repo.getExtent().flush();
	}
}