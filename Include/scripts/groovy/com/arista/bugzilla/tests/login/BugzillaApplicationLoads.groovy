package com.arista.bugzilla.tests.login
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


class BugzillaApplicationLoads {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User enters application url")
	def User_enters_application_url() {

		WebUI.openBrowser('')

		WebUI.navigateToUrl(GlobalVariable.applicationUrl)

		WebUI.delay(4)

		WebUI.maximizeWindow()

		WebUI.delay(2)
	}

	@And("verify Application loads and its fields")
	def verify_Application_loads_and_its_fields() {

		WebUI.verifyElementPresent(findTestObject("Page_BugsUI/input_username"), 0)

		WebUI.verifyElementPresent(findTestObject("Page_BugsUI/input_password"), 0)

		WebUI.verifyElementPresent(findTestObject("Page_BugsUI/checkbox_RememberMe"), 0)


		if(WebUI.getText(findTestObject("Page_BugsUI/label_rememberMe")).equals("Remember me")){

			assert true
		}
		else{
			assert false
		}
	}

	@Then("verify the login button is disabled")
	def verify_the_login_button_is_disabled() {

		if(WebUI.verifyElementNotClickable(findTestObject('Page_BugsUI/button_Login'))){

			assert true
		}
		else{
			assert false
		}

		WebUI.closeBrowser()
	}
}