import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.applicationUrl)

WebUI.delay(3)

CustomKeywords.'reusable.loginBugZillaUI.login'()

WebUI.delay(4)

if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI Dashboard/span_Dashboard'), 0)){
	
	if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI Dashboard/a_Search'), 3)){
		
		WebUI.click(findTestObject('Page_BugsUI Dashboard/a_Search'))
		
	}
}

WebUI.delay(3)

WebUI.setText(findTestObject("Page_Search/div_Package_search"), "BugsUITest")

WebUI.delay(4)

WebUI.click(findTestObject('Page_Search/div_BugsUITest'))

WebUI.delay(3)


if(WebUI.verifyElementPresent(findTestObject('Page_Search/button_Search'), 0)){
	
	WebUI.click(findTestObject('Page_Search/button_Search'))
	
}

WebUI.delay(3)

if(WebUI.verifyElementPresent(findTestObject('Page_Search/span_SearchResultBugsFound'), 0)){
	
	if(WebUI.verifyElementPresent(findTestObject('Page_Search/searchResultTable'), 0)){
		
		assert true
	}
	else{
		assert false
	}
}

WebUI.closeBrowser()