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


class EditProductFields {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Product edit page loads")
	def Product_edit_page_loads() {

		WebUI.openBrowser('')

		WebUI.navigateToUrl(GlobalVariable.applicationUrl)

		WebUI.delay(3)

		WebUI.maximizeWindow()

		WebUI.delay(2)

		WebUI.setText(findTestObject('Page_BugsUI/input_username'), 'knagendra-ext')

		WebUI.setText(findTestObject('Page_BugsUI/input_password'), 'Kum1!@#$%^&*()ar')

		if(WebUI.verifyElementClickable(findTestObject("Page_BugsUI/button_Login"))){

			WebUI.click(findTestObject('Page_BugsUI/button_Login'))
		}

		WebUI.delay(4)

		if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI Dashboard/span_Dashboard'), 0)){

			if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI Dashboard/button_Product'), 10)){

				WebUI.click(findTestObject('Page_BugsUI Dashboard/button_Product'))

				WebUI.delay(2)

				if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI Dashboard/a_Edit'), 5)){

					WebUI.click(findTestObject('Page_BugsUI Dashboard/a_Edit'))
				}
			}
		}

		WebUI.verifyElementPresent(findTestObject("Page_BugsUI Edit Product/span_Edit Product"), 0)

		def editPage = new editPage()

		editPage.selectProduct()
	}

	@When("verify product update button")
	def verify_product_update_button() {

		WebUI.verifyElementPresent(findTestObject('Page_BugsUI Edit Product/input_newName'), 0)

		WebUI.verifyElementPresent(findTestObject('Page_BugsUI Edit Product/textarea_description'), 0)

		WebUI.verifyElementPresent(findTestObject('Page_BugsUI Edit Product/div_closed_for_bug_entry'), 0)
	}

	@Then("product update button should be disabled")
	def product_update_button_should_be_disabled() {

		if(WebUI.verifyElementNotClickable(findTestObject('Page_BugsUI Edit Product/button_update_product'))){

			assert true
		}
		else{
			assert false
		}
	}

	@And("verify the fields of this edit page")
	def verify_the_fields_of_this_edit_page() {

		WebUI.scrollToElement(findTestObject("Page_BugsUI Edit Product/button_Delete Product"), 2)

		WebUI.verifyElementPresent(findTestObject('Page_BugsUI Edit Product/div_Component Information'), 0)

		WebUI.verifyElementPresent(findTestObject('Page_BugsUI Edit Product/button_Refresh components'), 0)

		WebUI.verifyElementPresent(findTestObject('Page_BugsUI Edit Product/button_AddNewRow_Component'), 0)

		WebUI.verifyElementPresent(findTestObject('Page_BugsUI Edit Product/span_Version Information'), 0)

		WebUI.verifyElementPresent(findTestObject('Page_BugsUI Edit Product/button_Refresh versions'), 0)

		WebUI.verifyElementPresent(findTestObject('Page_BugsUI Edit Product/button_AddNewRow_version'), 0)

		WebUI.delay(2)
	}
}