package com.arista.bugzilla.tests.bugdetails
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class VerifyAddingComments {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User moves to comments section in Bug page")
	def User_moves_to_comments_section_in_Bug_page() {
		
		WebUI.delay(2)
		
		WebUI.scrollToElement(findTestObject('Page_BugsUI New Bug/select_commentOrder_dropdown'), 0)
		
		WebUI.delay(2)
	}

	@When("User enters comments")
	def User_enters_comments() {
		
		WebUI.setText(findTestObject('Page_BugsUI New Bug/textarea_Add Comment'), "Testing comment for Automation")
		
		WebUI.delay(3)
		
		if(WebUI.verifyElementClickable(findTestObject('Page_BugsUI New Bug/bottom_button_Commit'))){
					
			WebUI.click(findTestObject('Page_BugsUI New Bug/bottom_button_Commit'))
		}
		
		WebUI.delay(2)
	}

	@Then("Verify Comments  is added successfully")
	def Verify_Comments_is_added_successfully() {
		
		if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI New Bug/div_Bugdetails_updated_success'), 0)){
			
			String bugNo = WebUI.getText(findTestObject('Page_BugsUI New Bug/div_Bugdetails_updated_success'))
			
			if(bugNo.equals("Bug details updated successfully.")){
				
				assert true
			}
			else{
				
				assert false
			}
		}
		
		WebUI.delay(2)
		
		WebUI.scrollToElement(findTestObject('Page_BugsUI New Bug/logs_accordion'), 0)
		
		WebUI.delay(2)
		
		if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI New Bug/select_commentOrder_dropdown'), 0)){
			
			WebUI.selectOptionByValue(findTestObject('Page_BugsUI New Bug/select_commentOrder_dropdown'), 'desc', false)
		}
		
		WebUI.delay(3)
		
		if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI New Bug/latestComment'), 0)){
			
			String latestComment = WebUI.getText(findTestObject('Page_BugsUI New Bug/latestComment'))
			
			if(latestComment.equals("Testing comment for Automation")){
				
				assert true
			}
			else{
				assert false
			}
		}
		WebUI.delay(2)
		
		WebUI.closeBrowser()
	}
}