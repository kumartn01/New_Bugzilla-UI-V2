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

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Page_BugsUI New Bug/select_commentOrder_dropdown'), 0)

WebUI.delay(2)

WebUI.setText(findTestObject('Page_BugsUI New Bug/textarea_Add Comment'), "Testing comment for Automation")

WebUI.delay(3)

if(WebUI.verifyElementClickable(findTestObject('Page_BugsUI New Bug/bottom_button_Commit'))){
			
	WebUI.click(findTestObject('Page_BugsUI New Bug/bottom_button_Commit'))
}

WebUI.delay(2)

if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI New Bug/div_Bugdetails_updated_success'), 0)){
	
	bugNo = WebUI.getText(findTestObject('Page_BugsUI New Bug/div_Bugdetails_updated_success'))
	
	if(bugNo.equals("Bug details updated successfully.")){
		
		assert true
	}
	else{
		
		assert false
	}
}

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Page_BugsUI New Bug/logs_accordion'), 0)

WebUI.delay(2)

if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI New Bug/select_commentOrder_dropdown'), 0)){
	
	WebUI.selectOptionByValue(findTestObject('Page_BugsUI New Bug/select_commentOrder_dropdown'), 'desc', false)
}

WebUI.delay(3)

if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI New Bug/latestComment'), 0)){
	
	latestComment = WebUI.getText(findTestObject('Page_BugsUI New Bug/latestComment'))
	
	if(latestComment.equals("Testing comment for Automation")){
		
		assert true
	}
	else{
		assert false
	}
}
WebUI.delay(2)
WebUI.closeBrowser()