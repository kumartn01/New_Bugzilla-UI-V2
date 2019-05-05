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

CustomKeywords.'reusable.editPage.selectProduct'()

//Verify all fields

WebUI.verifyElementPresent(findTestObject('Page_BugsUI Edit Product/input_newName'), 0)

WebUI.verifyElementPresent(findTestObject('Page_BugsUI Edit Product/textarea_description'), 0)

WebUI.verifyElementPresent(findTestObject('Page_BugsUI Edit Product/div_closed_for_bug_entry'), 0)

if(WebUI.verifyElementNotClickable(findTestObject('Page_BugsUI Edit Product/button_update_product'))){
	
	assert true
}
else{
	assert false
}

WebUI.scrollToElement(findTestObject("Page_BugsUI Edit Product/button_Delete Product"), 2)

WebUI.verifyElementPresent(findTestObject('Page_BugsUI Edit Product/div_Component Information'), 0)

WebUI.verifyElementPresent(findTestObject('Page_BugsUI Edit Product/button_Refresh components'), 0)

WebUI.verifyElementPresent(findTestObject('Page_BugsUI Edit Product/button_AddNewRow_Component'), 0)

WebUI.verifyElementPresent(findTestObject('Page_BugsUI Edit Product/span_Version Information'), 0)

WebUI.verifyElementPresent(findTestObject('Page_BugsUI Edit Product/button_Refresh versions'), 0)

WebUI.verifyElementPresent(findTestObject('Page_BugsUI Edit Product/button_AddNewRow_version'), 0)


WebUI.delay(2)

