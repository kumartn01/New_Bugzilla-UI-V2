package com.arista.bugzilla.tests.productadd
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


class AvailabilityOfAddedProduct {
	
	@Given("user present in new bug page")
	def user_present_in_new_bug_page() {
		
		WebUI.delay(2)
		
		if(WebUI.verifyElementPresent(findTestObject("Page_BugsUI Dashboard/a_New Bug"), 0)){
			
			WebUI.click(findTestObject("Page_BugsUI Dashboard/a_New Bug"))
		}
		WebUI.delay(3)
		
		WebUI.verifyElementPresent(findTestObject("Page_BugsUI New Bug/span_Raise New Bug"), 0)
	}

	@When("click on package dropdown")
	def click_on_package_dropdown() {
		
		WebUI.setText(findTestObject("Page_BugsUI New Bug/div_Choose Classification"), "Software")
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Page_BugsUI New Bug/span_Software'))
		
		WebUI.delay(3)
		
		WebUI.setText(findTestObject('Page_BugsUI New Bug/div_Choose Package'), "1-Automation-testing")
	}

	@Then("verify presence of newly added product")
	def verify_presence_of_newly_added_product() {
		
		if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI New Bug/span_1-Automation-testing'), 0)){
			
			WebUI.click(findTestObject('Page_BugsUI New Bug/span_1-Automation-testing'))
			
			assert true
		}
		else{
			
			assert false
		}
		
		WebUI.delay(3)
	}
}