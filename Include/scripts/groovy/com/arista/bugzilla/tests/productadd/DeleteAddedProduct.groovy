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


class DeleteAddedProduct {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("user present in product edit page")
	def user_present_in_product_edit_page() {
		
		if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI Dashboard/button_Product'), 10)){
			
			WebUI.click(findTestObject('Page_BugsUI Dashboard/button_Product'))
			
			WebUI.delay(2)
			
			if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI Dashboard/a_Edit'), 5)){
				
				WebUI.click(findTestObject('Page_BugsUI Dashboard/a_Edit'))
			}
		}
		
		WebUI.delay(4)
		
		if(WebUI.verifyAlertPresent(7)){
			
			WebUI.acceptAlert()
		}
		
		WebUI.delay(4)
		
		WebUI.verifyElementPresent(findTestObject("Page_BugsUI Edit Product/span_Edit Product"), 0)
		
		WebUI.setText(findTestObject("Page_BugsUI Edit Product/div_Choose Classification"), "Software")
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Page_BugsUI Edit Product/span_Software'))
		
		WebUI.setText(findTestObject("Page_BugsUI Edit Product/div_Choose Product"), "1-Automation-testing")
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Page_BugsUI Edit Product/span_1-Automation-testing'))
		
		WebUI.delay(2)
		
		WebUI.scrollToElement(findTestObject("Page_BugsUI Edit Product/button_Delete Product"), 1)
		
		WebUI.delay(2)
	}

	@When("click delete product button")
	def click_delete_product_button() {
		
		if(WebUI.verifyElementPresent(findTestObject("Page_BugsUI Edit Product/button_Delete Product"), 0)){
			
			WebUI.delay(5)
			
			if(WebUI.verifyElementClickable(findTestObject("Page_BugsUI Edit Product/button_Delete Product"))){
				
				WebUI.click(findTestObject('Page_BugsUI Edit Product/button_Delete Product'))
			}
		}
		WebUI.delay(3)
		
		if(WebUI.verifyElementPresent(findTestObject("Page_BugsUI Edit Product/confirmDeleteProduct_popup"), 0)){
			
			if(WebUI.verifyElementPresent(findTestObject("Page_BugsUI Edit Product/button_No"), 0)){
				
				WebUI.click(findTestObject('Page_BugsUI Edit Product/button_No'))
			}
		}
		WebUI.delay(3)
		
		WebUI.verifyElementPresent(findTestObject("Page_BugsUI Edit Product/button_Delete Product"), 0)
		
		WebUI.click(findTestObject('Page_BugsUI Edit Product/button_Delete Product'))
		
		WebUI.delay(3)
		
		if(WebUI.verifyElementPresent(findTestObject("Page_BugsUI Edit Product/confirmDeleteProduct_popup"), 0)){
			
			if(WebUI.verifyElementPresent(findTestObject("Page_BugsUI Edit Product/button_deleteProduct_Yes"), 0)){
				
				WebUI.click(findTestObject('Page_BugsUI Edit Product/button_deleteProduct_Yes'))
			}
		}
		
		WebUI.delay(3)
	}

	@Then("product is deleted")
	def product_is_deleted() {
		
		if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI Edit Product/div_Product has been deleted'), 0)){
			
			String text = WebUI.getText(findTestObject('Page_BugsUI Edit Product/div_Product has been deleted'))
			
			if(text.equals("Product has been deleted successfully.")){
				 assert true
			}
			else{
				assert false
			}
		}
		
		WebUI.closeBrowser()
	}
}