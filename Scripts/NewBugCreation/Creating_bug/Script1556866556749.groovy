import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.applicationUrl)

WebUI.delay(3)

CustomKeywords.'reusable.loginBugZillaUI.login'()

WebUI.delay(4)

if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI Dashboard/span_Dashboard'), 0)){
	
	if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI Dashboard/a_New Bug'), 3)){
		
		WebUI.click(findTestObject('Page_BugsUI Dashboard/a_New Bug'))
		
	}
}

WebUI.delay(3)	

WebUI.verifyElementPresent(findTestObject("Page_BugsUI New Bug/span_Raise New Bug"), 0)

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

WebUI.scrollToElement(findTestObject("Page_BugsUI New Bug/button_Raise New Bug"), 1)

WebUI.verifyElementNotClickable(findTestObject("Page_BugsUI New Bug/input_reporter"))

defaultReporterName = WebUI.getAttribute(findTestObject('Page_BugsUI New Bug/input_reporter'),'value')

if(defaultReporterName.equals("kumar Nagendra1 (kumar.nagendra@happiestminds.com)")){
	
	assert true
}
else{
	
	assert false
}


if(WebUI.verifyElementPresent(findTestObject("Page_BugsUI New Bug/button_Raise New Bug"), 0)){
	
	WebUI.click(findTestObject("Page_BugsUI New Bug/button_Raise New Bug"))
}

WebUI.delay(4)


















