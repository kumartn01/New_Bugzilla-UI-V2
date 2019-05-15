package com.arista.bugzilla.tests.search
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
import reusable.loginBugZillaUI
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


class BasicSearch {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("user is present in Search page")
	def user_is_present_in_Search_page() {
		
		WebUI.openBrowser('')
		
		WebUI.navigateToUrl(GlobalVariable.applicationUrl)
		
		WebUI.delay(3)
		
		def loginBugZillaUI = new loginBugZillaUI()

		loginBugZillaUI.login()
		
		WebUI.delay(4)
		
		if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI Dashboard/span_Dashboard'), 0)){
			
			if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI Dashboard/a_Search'), 3)){
				
				WebUI.click(findTestObject('Page_BugsUI Dashboard/a_Search'))
				
			}
		}
		
		WebUI.delay(3)
	}

	@When("User searches for bugs with specific package")
	def User_searches_for_bugs_with_specific_package() {
		
		WebUI.setText(findTestObject("Page_Search/div_Package_search"), "BugsUITest")
		
		WebUI.delay(4)
		
		WebUI.click(findTestObject('Page_Search/div_BugsUITest'))
		
		WebUI.delay(3)
		
		
		if(WebUI.verifyElementPresent(findTestObject('Page_Search/button_Search'), 0)){
			
			WebUI.click(findTestObject('Page_Search/button_Search'))
			
		}
		
		WebUI.delay(3)
	}

	@Then("User is shown correct search result")
	def User_is_shown_correct_search_result() {
		
		if(WebUI.verifyElementPresent(findTestObject('Page_Search/span_SearchResultBugsFound'), 0)){
			
			if(WebUI.verifyElementPresent(findTestObject('Page_Search/searchResultTable'), 0)){
				
				assert true
			}
			else{
				assert false
			}
		}
		
		WebUI.closeBrowser()
	}
}