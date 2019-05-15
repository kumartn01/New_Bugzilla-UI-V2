package com.arista.bugzilla.tests.newbug
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


class NewBugCreation {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("user present in New bug page")
	def user_present_in_Newbugpage() {

		WebUI.openBrowser('')

		WebUI.navigateToUrl(GlobalVariable.applicationUrl)

		WebUI.delay(3)

		def loginBugZillaUI = new loginBugZillaUI()

		loginBugZillaUI.login()

		WebUI.delay(4)

		if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI Dashboard/span_Dashboard'), 0)){

			if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI Dashboard/a_New Bug'), 3)){

				WebUI.click(findTestObject('Page_BugsUI Dashboard/a_New Bug'))
			}
		}

		WebUI.delay(3)

		WebUI.verifyElementPresent(findTestObject("Page_BugsUI New Bug/span_Raise New Bug"), 0)
	}

	@When("user fills in all mandatory fields")
	def user_fills_in_all_mandatory_fields() {

		WebUI.setText(findTestObject("Page_BugsUI New Bug/div_Choose Classification"), "Software")

		WebUI.delay(2)

		WebUI.click(findTestObject('Page_BugsUI New Bug/span_Software'))

		WebUI.setText(findTestObject('Page_BugsUI New Bug/div_Choose Package'), "BugsUITest")

		WebUI.delay(2)

		WebUI.click(findTestObject('Page_BugsUI New Bug/span_BugsUITest'))


		WebUI.setText(findTestObject('Page_BugsUI New Bug/div_Choose PackageVersion'), "main12")

		WebUI.delay(3)

		WebUI.click(findTestObject('Page_BugsUI New Bug/span_main12_pckgVrsion'))

		WebUI.setText(findTestObject('Page_BugsUI New Bug/input_summary'), "Test automation bug")

		WebUI.delay(2)

		WebUI.setText(findTestObject('Page_BugsUI New Bug/textarea_description'), "This bug is created for automation purpose")

		WebUI.delay(3)
	}


	@Then("create new bug successfully")
	def create_new_bug_successfully() {

		WebUI.scrollToElement(findTestObject("Page_BugsUI New Bug/button_Raise New Bug"), 1)

		WebUI.verifyElementNotClickable(findTestObject("Page_BugsUI New Bug/input_reporter"))

		String defaultReporterName = WebUI.getAttribute(findTestObject('Page_BugsUI New Bug/input_reporter'),'value')

		if(defaultReporterName.equals("kumar Nagendra1 (kumar.nagendra@happiestminds.com)")){

			assert true
		}
		else{

			assert false
		}


		if(WebUI.verifyElementPresent(findTestObject("Page_BugsUI New Bug/button_Raise New Bug"), 0)){

			WebUI.click(findTestObject("Page_BugsUI New Bug/button_Raise New Bug"))
		}

		WebUI.delay(2)

		WebUI.closeBrowser()
	}
}