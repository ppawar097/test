package com.katalyst.ensoul.testHarness;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.katalyst.base.TestBase;
import com.katalyst.ensoul.page.DashboardPage;
import com.katalyst.ensoul.page.Office365LoginPage;
import com.katalyst.util.PropertyManager;
import com.katalyst.util.Reports;

public class DashboardSrc extends TestBase {
	public static String suite = PropertyManager.getInstance().getSuite();

	public void Dashboard(String loginData[]) throws Exception {
		PageFactory.initElements(driver, DashboardPage.class);
		
		HttpURLConnection huc = null;
		int respCode =200;
		String currentUrl;
		String profileUrl ="https://id.devtest.ensoulinc.com/Identity/Account/Profile";
		String createNewUserUrl ="https://id.devtest.ensoulinc.com/Identity/Account/Register";
		String userList ="https://id.devtest.ensoulinc.com/Identity/UsersList";
		String roleUrl ="https://id.devtest.ensoulinc.com/Role/Index";
		String policyUrl ="https://id.devtest.ensoulinc.com/Policy/Index";
		String logOut ="https://id.devtest.ensoulinc.com/Identity/Logout";
		
		currentUrl =driver.getCurrentUrl();

		if (driver.getPageSource().contains("Welcome")) {
			Reports.passTest("Login Succesful");
		} else {
			Reports.failTest("Login Un - Succesful");
		}				
		
		waitForElement(DashboardPage.getNotification(),20);
		click(DashboardPage.getNotification(), "Clicked on Notification");	

		// Check both display username's are same

		String LeftDisplayName = DashboardPage.getLeftUserName().getText();
		String RightDisplayName = DashboardPage.getRightUsername().getText();
		
		try
		{ 
			assertEquals(LeftDisplayName,RightDisplayName); 
			Reports.passTest("Both display Username are same"); 
		}
		catch(AssertionError e) 
		{ 
			Reports.failTest(e.getMessage()); 
		}
		
		waitForElement(DashboardPage.getMenu(), 20);
		click(DashboardPage.getMenu(), "Clicked on Menu toggel");
		click(DashboardPage.getMenu(), "Clicked on Menu toggel");
		
		click(DashboardPage.getBtnFullScreen(), "Clicked on Full screen button");
		click(DashboardPage.getBtnLock(), "Clicked on Lock button");
		click(DashboardPage.getBtnSettings(), "Clicked on Setting button");
		
		
		//URL checking
				
		huc = (HttpURLConnection)(new URL(profileUrl).openConnection());        
        huc.setRequestMethod("HEAD");        
        huc.connect();        
        respCode = huc.getResponseCode();    
        
        if(respCode == 504|| respCode == 503||respCode == 502||respCode == 501||respCode == 500||respCode == 404||
        		respCode == 403||respCode == 402||respCode == 401||respCode == 400||respCode == 301||respCode == 204){
        	Reports.failTest(profileUrl+"Link is not working");
        }
        else{
        	Reports.passTest(profileUrl+" is a valid link");
        }      
        
        huc = (HttpURLConnection)(new URL(createNewUserUrl).openConnection());        
        huc.setRequestMethod("HEAD");        
        huc.connect();        
        respCode = huc.getResponseCode();        
        if(respCode == 504|| respCode == 503||respCode == 502||respCode == 501||respCode == 500||respCode == 404||
        		respCode == 403||respCode == 402||respCode == 401||respCode == 400||respCode == 301||respCode == 204){
        	Reports.failTest(createNewUserUrl+"Link is not working");
        }
        else{
        	Reports.passTest(createNewUserUrl+" is a valid link");
        }
                      
        huc = (HttpURLConnection)(new URL(roleUrl).openConnection());        
        huc.setRequestMethod("HEAD");        
        huc.connect();        
        respCode = huc.getResponseCode();        
        if(respCode == 504|| respCode == 503||respCode == 502||respCode == 501||respCode == 500||respCode == 404||
        		respCode == 403||respCode == 402||respCode == 401||respCode == 400||respCode == 301||respCode == 204){
        	Reports.failTest(roleUrl+"Link is not working");
        }
        else{
        	Reports.passTest(roleUrl+" is a valid link");
        }
        
        huc = (HttpURLConnection)(new URL(policyUrl).openConnection());        
        huc.setRequestMethod("HEAD");        
        huc.connect();        
        respCode = huc.getResponseCode();        
        if(respCode == 504|| respCode == 503||respCode == 502||respCode == 501||respCode == 500||respCode == 404||
        		respCode == 403||respCode == 402||respCode == 401||respCode == 400||respCode == 301||respCode == 204){
        	Reports.failTest(policyUrl+"Link is not working");
        }
        else{
        	Reports.passTest(policyUrl+" is a valid link");
        }
     
		/*
		 * //checking logout button try { click(DashboardPage.getBtnLogOff(),
		 * "Clicked on Logout button"); if(currentUrl !=
		 * "https://id.devtest.ensoulinc.com/Identity/Account/Logout" || respCode ==
		 * 504|| respCode == 503|| respCode == 502||respCode == 501||respCode ==
		 * 500||respCode == 404||respCode == 403||respCode == 402|| respCode ==
		 * 401||respCode == 400||respCode == 301||respCode == 204) {
		 * Reports.failTest(logOut+"Link is not working"); } else{
		 * Reports.passTest(logOut+" is a valid link"); } } catch(Exception e) {
		 * Reports.failTest(logOut+"Link is not working"); }
		 * 
		 * 
		 * huc = (HttpURLConnection)(new URL(userList).openConnection());
		 * huc.setRequestMethod("HEAD"); huc.connect(); respCode =
		 * huc.getResponseCode(); try { if(respCode == 504|| respCode == 503||respCode
		 * == 502||respCode == 501||respCode == 500||respCode == 404|| respCode ==
		 * 403||respCode == 402||respCode == 401||respCode == 400||respCode ==
		 * 301||respCode == 204){ Reports.failTest(userList+"Link is not working"); }
		 * else{ Reports.passTest(userList+" is a valid link"); } } catch(Exception e) {
		 * Reports.failTest(userList+"Link is not working"); }
		 */
	}
}
