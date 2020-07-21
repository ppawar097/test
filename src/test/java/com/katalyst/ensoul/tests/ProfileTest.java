package com.katalyst.ensoul.tests;

import org.testng.annotations.Test;

import com.katalyst.base.TestBase;
import com.katalyst.ensoul.dataProvider.StaticDataProvider;
import com.katalyst.ensoul.testHarness.ProfileSrc;
import com.katalyst.util.Reports;
import com.katalyst.util.Retry;

public class ProfileTest extends TestBase {

	// Class objects
	ProfileSrc prof = new ProfileSrc();

		@Test(priority = 1, dataProviderClass = StaticDataProvider.class, dataProvider = "d_profile", retryAnalyzer = Retry.class)
		public void PasswordReset() throws Exception {
			Reports.test = Reports.extent.createTest("Password Updation - White Space");
			try {
				prof.WhiteSpace();
			} catch (Exception e) {
				Reports.failTest("Error occurrs at the time of updating the Profile" + e.getMessage());
			}
		}
		
		
		@Test(priority = 2, dataProviderClass = StaticDataProvider.class, dataProvider = "d_profile", retryAnalyzer = Retry.class)
		public void NullPassword() throws Exception {
			Reports.test = Reports.extent.createTest("Profile Updation - Null Values");
			try {
				prof.PasswordNull();
			} catch (Exception e) {
				Reports.failTest("Error occurrs at the time of updating the Profile" + e.getMessage());
			}
		}

		@Test(priority = 3, dataProviderClass = StaticDataProvider.class, dataProvider = "d_profile", retryAnalyzer = Retry.class)
		public void OnlyChar(String ProfileData[]) throws Exception {
			Reports.test = Reports.extent.createTest("Password Updation - Only Characters");
			try {
				prof.CharOnly(ProfileData);
			} catch (Exception e) {
				Reports.failTest("Error occurrs at the time of updating the Profile" + e.getMessage());
			}
		}

		@Test(priority = 4, dataProviderClass = StaticDataProvider.class, dataProvider = "d_profile", retryAnalyzer = Retry.class)
		public void NumericAplha(String ProfileData[]) throws Exception {
			Reports.test = Reports.extent.createTest("Password Updation - Aplha Numeric Characters");
			try {
				prof.AplhaNumeric(ProfileData);
			} catch (Exception e) {
				Reports.failTest("Error occurrs at the time of updating the Profile" + e.getMessage());
			}
		}
		
		@Test(priority = 5, dataProviderClass = StaticDataProvider.class, dataProvider = "d_profile", retryAnalyzer = Retry.class)
		public void CharSpecial(String ProfileData[]) throws Exception {
			Reports.test = Reports.extent.createTest("Password Updation - Only Special Characters");
			try {
				prof.SpecialChar(ProfileData);
			} catch (Exception e) {
				Reports.failTest("Error occurrs at the time of updating the Profile" + e.getMessage());
			}
		}
		
		@Test(priority = 6, dataProviderClass = StaticDataProvider.class, dataProvider = "d_profile", retryAnalyzer = Retry.class)
		public void OnlyNumbers(String ProfileData[]) throws Exception {
			Reports.test = Reports.extent.createTest("Password Updation - Only Special Characters");
			try {
				prof.NumbersOnly(ProfileData);
			} catch (Exception e) {
				Reports.failTest("Error occurrs at the time of updating the Profile" + e.getMessage());
			}
		}
		

		@Test(priority = 7, dataProviderClass = StaticDataProvider.class, dataProvider = "d_profile", retryAnalyzer = Retry.class)
		public void Combine(String ProfileData[]) throws Exception {
			Reports.test = Reports.extent.createTest("Password Updation - Combination of all and 8 char min");
			try {
				prof.Combination(ProfileData);
			} catch (Exception e) {
				Reports.failTest("Error occurrs at the time of updating the Profile" + e.getMessage());
			}
		}

		
		@Test(priority = 8, dataProviderClass = StaticDataProvider.class, dataProvider = "d_profile", retryAnalyzer = Retry.class)
		public void JPGImgUpload(String ProfileData[]) throws Exception {
			Reports.test = Reports.extent.createTest("Profile Image Updation - Uploading JPEG File");
			try {
				prof.ImgUploadJPG(ProfileData);
			} catch (Exception e) {
				Reports.failTest("Error occurrs at the time of updating the Profile" + e.getMessage());
			}
		}

		@Test(priority = 9, dataProviderClass = StaticDataProvider.class, dataProvider = "d_profile", retryAnalyzer = Retry.class)
		public void PNGImgUpload(String ProfileData[]) throws Exception {
			Reports.test = Reports.extent.createTest("Profile Image Updation - Uploading PNG File");
			try {
				prof.ImgUploadPNG(ProfileData);
			} catch (Exception e) {
				Reports.failTest("Error occurrs at the time of updating the Profile" + e.getMessage());
			}
		}
		
		@Test(priority = 10, dataProviderClass = StaticDataProvider.class, dataProvider = "d_profile", retryAnalyzer = Retry.class)
		public void GIFImgUpload(String ProfileData[]) throws Exception {
			Reports.test = Reports.extent.createTest("Profile Image Updation - Uploading GIF File");
			try {
				prof.ImgUploadGIF(ProfileData);
			} catch (Exception e) {
				Reports.failTest("Error occurrs at the time of updating the Profile" + e.getMessage());
			}
		}
		
		@Test(priority = 11, dataProviderClass = StaticDataProvider.class, dataProvider = "d_profile", retryAnalyzer = Retry.class)
		public void BMPImgUpload(String ProfileData[]) throws Exception {
			Reports.test = Reports.extent.createTest("Profile Image Updation - Uploading BMP File");
			try {
				prof.ImgUploadBMP(ProfileData);
			} catch (Exception e) {
				Reports.failTest("Error occurrs at the time of updating the Profile" + e.getMessage());
			}
		}
		
		
		@Test(priority = 12, dataProviderClass = StaticDataProvider.class, dataProvider = "d_profile", retryAnalyzer = Retry.class)
		public void TXTImgUpload(String ProfileData[]) throws Exception {
			Reports.test = Reports.extent.createTest("Profile Image Updation - Uploading TXT File");
			try {
				prof.ImgUploadTXT(ProfileData);
			} catch (Exception e) {
				Reports.failTest("Error occurrs at the time of updating the Profile" + e.getMessage());
			}
		}


		@Test(priority = 13, dataProviderClass = StaticDataProvider.class, dataProvider = "d_profile", retryAnalyzer = Retry.class)
		public void ChkEmailUname() throws Exception {
			Reports.test = Reports.extent.createTest("User name & Email are same");
			try {
				prof.ChkUnameEmail();
			} catch (Exception e) {
				Reports.failTest("Error occurrs at the time of updating the Profile" + e.getMessage());
			}
		}




}
