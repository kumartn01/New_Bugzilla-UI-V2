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


class VerifyCommitForBugPage {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User present in bug page")
	def User_present_in_bug_page() {

		WebUI.openBrowser('')

		WebUI.navigateToUrl(GlobalVariable.applicationUrl)

		WebUI.delay(3)

		def loginBugZillaUI = new loginBugZillaUI()

		loginBugZillaUI.login()

		WebUI.delay(4)

		WebUI.verifyElementPresent(findTestObject('Page_BugsUI Dashboard/span_Dashboard'), 0)

		if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI Dashboard/input_Edit_search'), 0)){

			WebUI.setText(findTestObject('Page_BugsUI Dashboard/input_Edit_search'), "255666")

			WebUI.delay(1)

			WebUI.click(findTestObject('Page_BugsUI Dashboard/span_search_buttonIcon'))
		}

		WebUI.delay(20)

		if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI New Bug/label_Bug 255666'), 0)){

			String bugNo = WebUI.getText(findTestObject('Page_BugsUI New Bug/label_Bug 255666'))

			if(bugNo.contains("255666")){

				assert true
			}
			else{

				assert false
			}
		}
	}

	@When("Modify the bug page field and commit")
	def Modify_the_bug_page_field_and_commit() {

		WebUI.verifyElementPresent(findTestObject('Page_BugsUI New Bug/bugInfo_accordion'), 0)

		String isBugInfoAccordionExpanded = WebUI.getAttribute(findTestObject('Page_BugsUI New Bug/bugInfo_accordion'), 'aria-expanded')

		if(isBugInfoAccordionExpanded.equals("false")){

			WebUI.click(findTestObject('Page_BugsUI New Bug/bugInfo_accordion'))

			WebUI.delay(2)

			if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI New Bug/input_BugAlias'), 0)){

				WebUI.setText(findTestObject('Page_BugsUI New Bug/input_BugAlias'), "123Test")

				WebUI.delay(1)

				if(WebUI.verifyElementClickable(findTestObject('Page_BugsUI New Bug/topButton_Commit'))){

					WebUI.click(findTestObject('Page_BugsUI New Bug/topButton_Commit'))
				}
			}
		}
		else if(isBugInfoAccordionExpanded.equals("true")){

			if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI New Bug/input_BugAlias'), 0)){

				WebUI.setText(findTestObject('Page_BugsUI New Bug/input_BugAlias'), "123Test")

				WebUI.delay(1)

				if(WebUI.verifyElementClickable(findTestObject('Page_BugsUI New Bug/topButton_Commit'))){

					WebUI.click(findTestObject('Page_BugsUI New Bug/topButton_Commit'))
				}
			}
		}

		WebUI.delay(2)
	}

	@Then("verify changes are commited successfully")
	def verify_changes_are_commited_successfully() {

		if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI New Bug/div_Bugdetails_updated_success'), 2)){

			String bugNo = WebUI.getText(findTestObject('Page_BugsUI New Bug/div_Bugdetails_updated_success'))

			if(bugNo.equals("Bug details updated successfully.")){

				assert true
			}
			else{

				assert false
			}
		}

		WebUI.delay(3)

		String aliasName = WebUI.getAttribute(findTestObject('Page_BugsUI New Bug/input_BugAlias'), 'value')

		if(aliasName.equals("123Test")){

			assert true
		}
		else{

			assert false
		}

		WebUI.delay(3)

		WebUI.clearText(findTestObject('Page_BugsUI New Bug/input_BugAlias'))

		WebUI.setText(findTestObject('Page_BugsUI New Bug/input_BugAlias'), "test987")

		WebUI.delay(3)

		if(WebUI.verifyElementClickable(findTestObject('Page_BugsUI New Bug/topButton_Commit'))){

			WebUI.click(findTestObject('Page_BugsUI New Bug/topButton_Commit'))
		}

		WebUI.delay(3)
	}
}