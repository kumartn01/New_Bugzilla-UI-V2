package com.arista.bugzilla.tests.productedit
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
import reusable.editPage
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


class UpdateProduct {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("user in edit page")
	def user_in_edit_page() {
		
		WebUI.scrollToElement(findTestObject('Page_BugsUI Edit Product/input_newName'), 2)
	}

	@When("user modifies the product description and updates")
	def user_modifies_the_product_description_and_updates() {
		
		WebUI.clearText(findTestObject('Page_BugsUI Edit Product/textarea_description'))
		
		WebUI.setText(findTestObject('Page_BugsUI Edit Product/textarea_description'), "Editing Description")
		
		WebUI.delay(2)
		
		if(WebUI.verifyElementClickable(findTestObject('Page_BugsUI Edit Product/button_update_product'))){
			
			WebUI.click(findTestObject('Page_BugsUI Edit Product/button_update_product'))
		}
		
		WebUI.delay(2)
	}

	@Then("product should be update successfully")
	def product_should_be_update_successfully() {
		
		def editPage = new editPage()

		editPage.selectProduct()
		
		String productDesc = WebUI.getAttribute(findTestObject('Page_BugsUI Edit Product/textarea_description'),'value')
		
		if(productDesc.equals("Editing Description")){
			
			assert true
		}
		else{
			assert false
		}
		
		WebUI.clearText(findTestObject('Page_BugsUI Edit Product/textarea_description'))
		
		WebUI.setText(findTestObject('Page_BugsUI Edit Product/textarea_description'), "Product for Automation")
		
		WebUI.delay(2)
		
		if(WebUI.verifyElementClickable(findTestObject('Page_BugsUI Edit Product/button_update_product'))){
			
			WebUI.click(findTestObject('Page_BugsUI Edit Product/button_update_product'))
		}
		
		WebUI.delay(2)
		
		WebUI.closeBrowser()
	}
}