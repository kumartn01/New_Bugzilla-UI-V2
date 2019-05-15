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

WebUI.verifyElementPresent(findTestObject('Page_BugsUI Dashboard/span_Dashboard'), 0)

if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI Dashboard/input_Edit_search'), 0)){
	
	WebUI.setText(findTestObject('Page_BugsUI Dashboard/input_Edit_search'), "255666")
	
	WebUI.delay(1)
	
	WebUI.click(findTestObject('Page_BugsUI Dashboard/span_search_buttonIcon'))
	
}

WebUI.delay(20)

if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI New Bug/label_Bug 255666'), 0)){
	
	bugNo = WebUI.getText(findTestObject('Page_BugsUI New Bug/label_Bug 255666'))
	
	if(bugNo.contains("255666")){
		
		assert true
	}
	else{
		
		assert false
	}
}

//Edit Alias name and check commit is working fine

WebUI.verifyElementPresent(findTestObject('Page_BugsUI New Bug/bugInfo_accordion'), 0)

isBugInfoAccordionExpanded = WebUI.getAttribute(findTestObject('Page_BugsUI New Bug/bugInfo_accordion'), 'aria-expanded')

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

if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI New Bug/div_Bugdetails_updated_success'), 2)){
	
	bugNo = WebUI.getText(findTestObject('Page_BugsUI New Bug/div_Bugdetails_updated_success'))
	
	if(bugNo.equals("Bug details updated successfully.")){
		
		assert true
	}
	else{
		
		assert false
	}
}

WebUI.delay(3)

aliasName = WebUI.getAttribute(findTestObject('Page_BugsUI New Bug/input_BugAlias'), 'value')

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





