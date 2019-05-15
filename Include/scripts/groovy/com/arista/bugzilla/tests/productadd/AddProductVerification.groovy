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


class AddProductVerification {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("navigate_to_application_url")
	def navigate_to_application_url(){
		WebUI.openBrowser('')

		WebUI.navigateToUrl(GlobalVariable.applicationUrl)

		WebUI.delay(3)

		WebUI.maximizeWindow()

		WebUI.delay(2)
	}
	@When("login_to_application_with_valid_credentials")
	def login_to_application_with_valid_credentials(){

		WebUI.setText(findTestObject('Page_BugsUI/input_username'), 'knagendra-ext')

		WebUI.setText(findTestObject('Page_BugsUI/input_password'), 'Kum1!@#$%^&*()ar')

		if(WebUI.verifyElementClickable(findTestObject("Page_BugsUI/button_Login"))){

			WebUI.click(findTestObject('Page_BugsUI/button_Login'))
		}

		WebUI.delay(6)
	}

	@Then("click_on_ProductAdd_Button")
	def click_on_ProductAdd_Button(){
		if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI Dashboard/span_Dashboard'), 0)){

			if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI Dashboard/button_Product'), 10)){

				WebUI.click(findTestObject('Page_BugsUI Dashboard/button_Product'))

				WebUI.delay(2)

				if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI Dashboard/a_Add'), 5)){

					WebUI.click(findTestObject('Page_BugsUI Dashboard/a_Add'))
				}
			}
		}

		WebUI.delay(3)


		if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI Add Product/span_Add Product'), 0)){

			assert true
		}
		else{
			assert false
		}
	}

	@And("verify the product add fields")
	def verify_the_product_add_fields(){

		WebUI.verifyElementPresent(findTestObject('Page_BugsUI Add Product/div_Choose Classification'), 1)

		WebUI.verifyElementPresent(findTestObject('Page_BugsUI Add Product/input_name'), 1)

		WebUI.verifyElementPresent(findTestObject('Page_BugsUI Add Product/textarea_description'), 1)

		WebUI.verifyElementPresent(findTestObject('Page_BugsUI Add Product/checkbox_closedForBugEntry'), 1)

		WebUI.verifyElementPresent(findTestObject('Page_BugsUI Add Product/input_version'), 1)

		WebUI.verifyElementPresent(findTestObject('Page_BugsUI Add Product/input_component'), 1)

		WebUI.verifyElementPresent(findTestObject('Page_BugsUI Add Product/div_Choose Assignee'), 1)

		//Verify if Add product button is disabled when none of the mandatory values are entered
		WebUI.scrollToElement(findTestObject('Page_BugsUI Add Product/AddProduct_button'), 0)

		WebUI.delay(1)
	}

	@And("verify if ProductAdd button is disabled")
	def verify_the_productAddButton_disabled(){

		if(WebUI.verifyElementNotClickable(findTestObject('Page_BugsUI Add Product/AddProduct_button'))){
			assert true
		}
		else{
			assert false
		}
	}

	@And("input all mandatory fields")
	def input_all_mandatory_fields(){

		WebUI.scrollToElement(findTestObject('Page_BugsUI Add Product/div_Choose Classification'), 0)

		WebUI.delay(1)

		WebUI.click(findTestObject('Page_BugsUI Add Product/div_Choose Classification'))

		WebUI.delay(2)

		WebUI.click(findTestObject('Page_BugsUI Add Product/span_Software'))

		WebUI.setText(findTestObject('Page_BugsUI Add Product/input_name'), "1-Automation-testing")

		WebUI.setText(findTestObject('Page_BugsUI Add Product/textarea_description'), "1-Automation-testing Description")

		WebUI.setText(findTestObject('Page_BugsUI Add Product/input_version'), "1")

		WebUI.scrollToElement(findTestObject('Page_BugsUI Add Product/AddProduct_button'), 0)

		WebUI.delay(1)

		if(WebUI.verifyElementNotClickable(findTestObject('Page_BugsUI Add Product/AddProduct_button'))){
			assert true
		}
		else{
			assert false
		}

		WebUI.setText(findTestObject('Page_BugsUI Add Product/defaultAssigne_inputbox'), "kumar nagendra")

		WebUI.click(findTestObject('Page_BugsUI Add Product/span_kumar.nagendra'))

		WebUI.delay(2)
	}

	@Then("verify Product Add button is enabled")
	def verify_ProductAdd_button_is_enabled(){

		if(WebUI.verifyElementClickable(findTestObject('Page_BugsUI Add Product/AddProduct_button'))){
			assert true
		}
		else{
			assert false
		}
		
		WebUI.setText(findTestObject('Page_BugsUI Add Product/input_component'), "Auto-1")
		
		WebUI.verifyElementPresent(findTestObject('Page_BugsUI Add Product/componentDescription'), 1)
		
		if(WebUI.verifyElementNotClickable(findTestObject('Page_BugsUI Add Product/AddProduct_button'))){
			assert true
		}
		else{
			assert false
		}
		
		WebUI.setText(findTestObject('Page_BugsUI Add Product/componentDescription'), "Auto-1 description")
		
		WebUI.scrollToElement(findTestObject('Page_BugsUI Add Product/AddProduct_button'), 1)
		
		WebUI.delay(2)
		
		if(WebUI.verifyElementClickable(findTestObject('Page_BugsUI Add Product/AddProduct_button'))){
			assert true
		}
		else{
			assert false
		}
	}
	
	@Then("verify duplicate product cannot be created")
	def verify_duplicate_product_cannot_be_created(){
		
		WebUI.clearText(findTestObject('Page_BugsUI Add Product/input_name'))
		
		WebUI.setText(findTestObject('Page_BugsUI Add Product/input_name'), "BugsUITest")
		
		WebUI.click(findTestObject('Page_BugsUI Add Product/AddProduct_button'))
		
		WebUI.delay(2)
		
		WebUI.verifyElementPresent(findTestObject('Page_BugsUI Add Product/div_Product BugsUITest already'), 1)
		
		String text = WebUI.getText(findTestObject('Page_BugsUI Add Product/div_Product BugsUITest already'))
		
		if(text.equals("Product BugsUITest already exists.")){
			
			assert true
		}
		else{
			assert false
		}
		
	}
	
	@Then("create a new valid product")
	def create_a_new_valid_product(){
		
		WebUI.clearText(findTestObject('Page_BugsUI Add Product/input_name'))
		
		WebUI.setText(findTestObject('Page_BugsUI Add Product/input_name'), "1-Automation-testing")
		
		WebUI.click(findTestObject('Page_BugsUI Add Product/AddProduct_button'))
		
		WebUI.delay(1)
		
		WebUI.verifyElementPresent(findTestObject('Page_BugsUI Add Product/div_Product_added_success'), 1)
		
			String successMsg = WebUI.getText(findTestObject('Page_BugsUI Add Product/div_Product_added_success'))
			
			if(successMsg.equals("Product has been added successfully.")){
				
				assert true
			}
			else{
				assert false
			}
		
		
		WebUI.delay(2)
	}
}




