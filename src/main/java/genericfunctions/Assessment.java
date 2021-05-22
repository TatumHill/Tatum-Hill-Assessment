package genericfunctions;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
import org.apache.poi.ss.usermodel.*;



public class Assessment {

	
       
UtilityFunctions utils = new UtilityFunctions();
Reporting repo = new Reporting();
       
       @Test
       public void Asses_1() throws Exception
       {
              //Open Chrome browser
              utils.SetupWebDriver("Chrome");
              
              //Wait
              utils.WaitTime(2);
              
              //Navigate to URL
              utils.NavigateToURL("https://www.geewiz.co.za");
              
              // Enter Search Item in "Search" text box e.g., "solar"
              utils.ClickObject("ID", "search_widget");
              utils.EnterText("xpath", "//input[@placeholder='Search our catalogue']", "solar");
              
              //Wait
              utils.WaitTime(2);  
              
              //Click on the Magnifying glass button
              utils.ClickObject("xpath", "/html/body/main/header/div/div[2]/div/div[1]/div[3]/div/form/button/i");
              
              //Wait
              utils.WaitTime(2);
              
              
              //Select in the "Sort By" dropDown list e.g., "Price: Lowest first“
              utils.ClickObject("xpath", "/html/body/main/section/div/div[2]/section/section/div[1]/div/div/div[2]/div/div/div/button");
              utils.ClickObject("xpath", "//*[@id='js-product-list-top']/div/div[2]/div/div/div/div/a[4]");
              
            
              
              //Wait
              utils.WaitTime(2);
              
              //Click on the First result
              utils.ClickObject("xpath", "//*[contains(text(),'SwitchBot Curtain')]");
              
              
              //Wait
              utils.WaitTime(5);
              
              
              //Scroll
              utils.PageDown();
              
              
              //Wait
              utils.WaitTime(5);
              
              //Enter quantity in the "Quantity" text field greater than 15 e.g., “20"
              utils.ClickObject("id", "quantity_wanted");
              utils.EnterText("id", "quantity_wanted", "20");
              
           
                                                
              //Wait
              utils.WaitTime(5);
              
              //Wait
              utils.WaitTime(5);
              
              //Click on the "Add to cart" button
              utils.ClickObject("xpath", "//div[2]/button");
          
              //Wait
              utils.WaitTime(5);
              
              //Wait
              utils.WaitTime(5);
          
          
              utils.ClickObject("xpath", "//div[2]/button");
              
              
              //Wait
              utils.WaitTime(5);
            
             
              //Handle Low Stock pop up window
              utils.ClickObject("xpath", "//*[@id='product_confirmation_modal']/div[2]/button[1]/span");
              //utils.ClickObject("ID", "product_confirmation_modal");
          
              
              //Wait
              utils.WaitTime(5);
              
              //Click on the "Continue shopping" button , when the pop up appears.           
              utils.ClickObject("xpath", "//*[@id='blockcart-modal']/div/div/div[2]/div/div[2]/div/div/button"); 
              
              //Wait
              utils.WaitTime(5);
              
           
              //Click on Shopping Cart              
              utils.ClickObject("xpath", "//*[@id='cart-block']/div/div/a/span[2]");
              
       }
                        
           
              public static void main (String [] args) {
              int Cart1;
                           
              Cart1=10000;
       
        		
            	if (Cart1== 200000) {	
      	 	
            		System.out.println("Value is greater than 10000");

              
              
              
        
              
        
        
        
         }
              
              
            
      
              
       

              
          
           
            
              
            
              
          
              
         
              
              
       }
}
