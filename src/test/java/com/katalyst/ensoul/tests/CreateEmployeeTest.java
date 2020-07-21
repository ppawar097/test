package com.katalyst.ensoul.tests;

import org.testng.annotations.Test;

import com.katalyst.base.TestBase;
import com.katalyst.ensoul.dataProvider.StaticDataProvider;
import com.katalyst.ensoul.testHarness.CreateEmployeeSrc;
import com.katalyst.util.Reports;
import com.katalyst.util.Retry;

public class CreateEmployeeTest extends TestBase {

	// Class objects
	CreateEmployeeSrc prof = new CreateEmployeeSrc();

		@Test(priority = 1, dataProviderClass = StaticDataProvider.class, dataProvider = "d_employee", retryAnalyzer = Retry.class)
		public void EmployeCreation(String EmployeeData[]) throws Exception {
			Reports.test = Reports.extent.createTest("Employee Creation");
			try {
				prof.CreateEmployee(EmployeeData);
			} catch (Exception e) {
				Reports.failTest("Error occurrs at the time of Employee Creation" + e.getMessage());
			}
		}
}