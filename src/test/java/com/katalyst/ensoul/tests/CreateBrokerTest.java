package com.katalyst.ensoul.tests;

import org.testng.annotations.Test;

import com.katalyst.base.TestBase;
import com.katalyst.ensoul.dataProvider.StaticDataProvider;
import com.katalyst.ensoul.testHarness.CreateBrokerSrc;
import com.katalyst.util.Reports;
import com.katalyst.util.Retry;

public class CreateBrokerTest extends TestBase {

	// Class objects
	CreateBrokerSrc crBroker = new CreateBrokerSrc();

		@Test(priority = 1, dataProviderClass = StaticDataProvider.class, dataProvider = "d_broker", retryAnalyzer = Retry.class)
		public void BrokerCreation(String BrokerData[]) throws Exception {
			Reports.test = Reports.extent.createTest("Broker Creation");
			try {
				crBroker.BrokerCreation(BrokerData);
			} catch (Exception e) {
				Reports.failTest("Error in the Broker creation" + e.getMessage());
			}
		}
}

