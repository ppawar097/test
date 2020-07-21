package com.katalyst.ensoul.tests;

import org.testng.annotations.Test;

import com.katalyst.base.TestBase;
import com.katalyst.ensoul.dataProvider.StaticDataProvider;
import com.katalyst.ensoul.testHarness.RoleSrc;
import com.katalyst.util.Reports;
import com.katalyst.util.Retry;

public class RoleTest extends TestBase {

	// Class objects
	RoleSrc role = new RoleSrc();

		@Test(priority = 1, dataProviderClass = StaticDataProvider.class, dataProvider = "d_role", retryAnalyzer = Retry.class)
		public void RoleCreation(String RoleData[]) throws Exception {
			Reports.test = Reports.extent.createTest("Role Creation");
			try {
				role.RoleCreation(RoleData);
			} catch (Exception e) {
				Reports.failTest("Error in the Role creation" + e.getMessage());
			}
		}
				
		@Test(priority = 2, dataProviderClass = StaticDataProvider.class, dataProvider = "d_role", retryAnalyzer = Retry.class)
		public void SameNameAsPolicy(String RoleData[]) throws Exception {
			Reports.test = Reports.extent.createTest("Role Creation - Same name as Policy");
			try {
				role.NameAsPolicy(RoleData);
			} catch (Exception e) {
				Reports.failTest("Error in the Role creation" + e.getMessage());
			}
		}
		
		@Test(priority = 3, dataProviderClass = StaticDataProvider.class, dataProvider = "d_role", retryAnalyzer = Retry.class)
		public void AplhaNumericRole(String RoleData[]) throws Exception {
			Reports.test = Reports.extent.createTest("Role Creation - With Alpha Numeric Value");
			try {
				role.AplhaNumeric(RoleData);
			} catch (Exception e) {
				Reports.failTest("Error in the Role creation" + e.getMessage());
			}
		}		
		
		@Test(priority = 4, dataProviderClass = StaticDataProvider.class, dataProvider = "d_role", retryAnalyzer = Retry.class)
		public void MultiplePolicy(String RoleData[]) throws Exception {
			Reports.test = Reports.extent.createTest("Role Creation - Multiple Policies");
			try {
				role.MultiplePolicies(RoleData);
			} catch (Exception e) {
				Reports.failTest("Error in the Role creation" + e.getMessage());
			}
		}
					
		@Test(priority = 5, dataProviderClass = StaticDataProvider.class, dataProvider = "d_role", retryAnalyzer = Retry.class)
		public void RoleWithSpecialChars(String RoleData[]) throws Exception {
			Reports.test = Reports.extent.createTest("Role Creation - With Speccial Characters");
			try {
				role.SpecialChar(RoleData);
			} catch (Exception e) {
				Reports.failTest("Error in the Role creation" + e.getMessage());
			}
		}
		
		@Test(priority = 6, dataProviderClass = StaticDataProvider.class, dataProvider = "d_role", retryAnalyzer = Retry.class)
		public void DuplicateRoleName(String RoleData[]) throws Exception {
			Reports.test = Reports.extent.createTest("Role Creation - Duplicate Role Name");
			try {
				role.RoleCreation(RoleData);
			} catch (Exception e) {
				Reports.failTest("Error in the Role creation" + e.getMessage());
			}
		}
		
		@Test(priority = 7, dataProviderClass = StaticDataProvider.class, dataProvider = "d_role", retryAnalyzer = Retry.class)
		public void EditRole(String RoleData[]) throws Exception {
			Reports.test = Reports.extent.createTest("Edit Role");
			try {
				role.RoleEdit(RoleData);
			} catch (Exception e) {
				Reports.failTest("Error in the Role creation" + e.getMessage());
			}
		}

		@Test(priority = 8, dataProviderClass = StaticDataProvider.class, dataProvider = "d_role", retryAnalyzer = Retry.class)
		public void DeleteRole(String RoleData[]) throws Exception {
			Reports.test = Reports.extent.createTest("Delete Role");
			try {
				role.RoleDelete(RoleData);
			} catch (Exception e) {
				Reports.failTest("Error in the Role creation" + e.getMessage());
			}
		}
		
		@Test(priority = 9, dataProviderClass = StaticDataProvider.class, dataProvider = "d_role", retryAnalyzer = Retry.class)
		public void RoleNotEmpty(String RoleData[]) throws Exception {
			Reports.test = Reports.extent.createTest("Role Creation - With Null Value");
			try {
				role.NotNull();
			} catch (Exception e) {
				Reports.failTest("Error in the Role creation" + e.getMessage());
			}
		}
		

}
