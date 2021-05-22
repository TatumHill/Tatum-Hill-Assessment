package genericfunctions;
import org.apache.poi.ss.usermodel.*;


public class AssFunctionLibrary {
	
	boolean bStepCheck;
	String sStatus;
	
	public static String sURL;
	public static int iIteration;
	public static Sheet sheetGlobal;
	
      
	UtilityFunctions utils = new UtilityFunctions();
	Reporting repo = new Reporting();
       
       
       public void NavigateToURL(Sheet sheet, int i) throws Exception
       {
    	   
    	   //Set iIteration to i
   			iIteration = i;
   		
   			//Set sheetGlobal to sheet
   			sheetGlobal = sheet;
   		
   			sURL = DataFunctions.getExcelCellData("URL", i, sheet);
   		
   			//Navigate to the URL
   			utils.NavigateToURL(sURL);
   		
   			//Validate Navigation to URL
   			repo.ReportStep("xpath", "//*[@id='category-tree-branch-main']/ul/li/ul/li[1]/a" , "Navigate to URL");
   		}
   		
       public void Search(Sheet sheet, int i) throws Exception
   	{
   		//Click Search Field
   		utils.ClickObject("ID", "search_widget");
   		
   		//Enter Search Item
   		utils.EnterText("xpath", "//input[@placeholder='Search our catalogue']", DataFunctions.getExcelCellData("Search", i, sheet));
         
   		//Click on the Magnifying glass button
        utils.ClickObject("xpath", "/html/body/main/header/div/div[2]/div/div[1]/div[3]/div/form/button/i");
   		
        //Validate Search
        repo.ReportStep("xpath", "//*[@id='category-tree-branch-main']/ul/li/ul/li[2]/a" , "Enter Search Item");    
   	}
       
       public void SortBy(Sheet sheet, int i) throws Exception
       {
              //Select in the "Sort By" dropDown list e.g., "Price: Lowest first“
    	   utils.ClickObject("xpath", "/html/body/main/section/div/div[2]/section/section/div[1]/div/div/div[2]/div/div/div/button");
           utils.ClickObject("xpath", "//*[@id='js-product-list-top']/div/div[2]/div/div/div/div/a[4]");
    	   
    	   
    	   //utils.ClickObject("xpath", "//*[@id='js-product-list-top']/div/div[2]/div/div/div/button/i");  	   
    	   //utils.SelectDropDownVisibleText("cssSelector", "btn-unstyle select-title", DataFunctions.getExcelCellData("SortBy", i, sheet));
          
    	   
    	   
    	   //Validate SortBy
    	   repo.ReportStep("xpath", "//*[@id='category-tree-branch-main']/ul/li/ul/li[2]/a" , "Enter Search Item");
       }      
       
       public void ClickFirstResult() throws Exception
   	{
    	   
    	   //Click on the First result
    	   utils.ClickObject("xpath", "//*[contains(text(),'SwitchBot Curtain')]");
    	   
   			//Validate Results
   			repo.ReportStep("xpath", "/html/body/main/header/div/div[2]/div/div[1]/div[3]/div/form/button/i", "Click on First Result");
   	}
   	
              
       public void EnterQTY(Sheet sheet, int i) throws Exception
       {
    	   
    	   //Enter quantity in the "Quantity" text field greater than 15 e.g., “20"“
    	   utils.ClickObject("id", "quantity_wanted");
   	    	   
    	   utils.EnterText("id", "quantity_wanted", DataFunctions.getExcelCellData("QTY", i, sheet));
    	   
    	   //Wait
           utils.WaitTime(5);
    	   
    	 //Click on the "Add to cart" button
           //utils.ClickObject("xpath", "//div[2]/button");
           //utils.ClickObject("xpath", "//div[2]/button");
    	   
          //Validate QTY Entered
    	   repo.ReportStep("xpath", "//*[@id='product_confirmation_modal']/div[2]/button[1]/span" , "Enter QTY");
       }    
       
       public void AddToCart() throws Exception
      	{
       	   
       	   //Click on the First result
    	   utils.ClickObject("xpath", "//div[2]/button");
    	   
    	   //Wait
           utils.WaitTime(5);
           
           //Wait
           utils.WaitTime(5);
           
           utils.ClickObject("xpath", "//div[2]/button");
           
           //Wait
           utils.WaitTime(5);
    	   
      		
      		//Validate Results
      		repo.ReportStep("xpath", "//*[@id='product_confirmation_modal']/div[2]/button[1]/span", "Add to Cart");
      	}
       
       public void ContinueShopping() throws Exception
     	{
      	   
    	 //Handle Low Stock pop up window
           utils.ClickObject("xpath", "//*[@id='product_confirmation_modal']/div[2]/button[1]/span");
           //utils.ClickObject("ID", "product_confirmation_modal");
       
           
           //Wait
           utils.WaitTime(5);
           
           //Click on the "Continue shopping" button , when the pop up appears.           
           utils.ClickObject("xpath", "//*[@id='blockcart-modal']/div/div/div[2]/div/div[2]/div/div/button"); 
           
           //Wait
           utils.WaitTime(5);
           
         
     		
     		//Validate Results
     		repo.ReportStep("xpath", "//*[@id='cart-block']/div/div/a/span[2]", "ContinueShopping");
     	}
              
}           
         
              
              
 


