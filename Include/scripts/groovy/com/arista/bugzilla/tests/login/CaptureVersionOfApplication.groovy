package com.arista.bugzilla.tests.login
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.logging.KeywordLogger
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


class CaptureVersionOfApplication {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Url of the application")
	def Url_of_the_application() {

		WebUI.openBrowser('')

		WebUI.navigateToUrl(GlobalVariable.applicationUrl)

		WebUI.delay(4)

		WebUI.maximizeWindow()

		WebUI.delay(2)
	}

	@When("Application loads")
	def Application_loads() {

		WebUI.verifyElementPresent(findTestObject("Page_BugsUI/input_username"), 0)
	}

	@Then("Capture current version of application")
	def Capture_current_version_of_application() {

		WebUI.verifyElementPresent(findTestObject("Page_BugsUI/div_version"), 0)
		String version = WebUI.getText(findTestObject("Page_BugsUI/div_version"))

		KeywordLogger log = new KeywordLogger()
		log.logInfo("Version of the application is -  "+version)

		WebUI.closeBrowser()
	}
}