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
import org.openqa.selenium.Keys as Keys


if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI Dashboard/button_Product'), 10)){
	
	WebUI.click(findTestObject('Page_BugsUI Dashboard/button_Product'))
	
	WebUI.delay(2)
	
	if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI Dashboard/a_Edit'), 5)){
		
		WebUI.click(findTestObject('Page_BugsUI Dashboard/a_Edit'))
	}
}

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject("Page_BugsUI Edit Product/span_Edit Product"), 0)

WebUI.setText(findTestObject("Page_BugsUI Edit Product/div_Choose Classification"), "Software")

WebUI.delay(2)

WebUI.click(findTestObject('Page_BugsUI Edit Product/span_Software'))

WebUI.setText(findTestObject("Page_BugsUI Edit Product/div_Choose Product"), "1-Automation-testing")

WebUI.delay(2)

WebUI.click(findTestObject('Page_BugsUI Edit Product/span_1-Automation-testing'))

WebUI.scrollToElement(findTestObject("Page_BugsUI Edit Product/button_Delete Product"), 1)

if(WebUI.verifyElementPresent(findTestObject("Page_BugsUI Edit Product/button_Delete Product"), 0)){
	
	WebUI.delay(5)
	
	if(WebUI.verifyElementClickable(findTestObject("Page_BugsUI Edit Product/button_Delete Product"))){
		
		WebUI.click(findTestObject('Page_BugsUI Edit Product/button_Delete Product'))
	}
}
WebUI.delay(3)

if(WebUI.verifyElementPresent(findTestObject("Page_BugsUI Edit Product/confirmDeleteProduct_popup"), 0)){
	
	if(WebUI.verifyElementPresent(findTestObject("Page_BugsUI Edit Product/button_No"), 0)){
		
		WebUI.click(findTestObject('Page_BugsUI Edit Product/button_No'))
	}
}
WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject("Page_BugsUI Edit Product/button_Delete Product"), 0)

WebUI.click(findTestObject('Page_BugsUI Edit Product/button_Delete Product'))

WebUI.delay(3)

if(WebUI.verifyElementPresent(findTestObject("Page_BugsUI Edit Product/confirmDeleteProduct_popup"), 0)){
	
	if(WebUI.verifyElementPresent(findTestObject("Page_BugsUI Edit Product/button_deleteProduct_Yes"), 0)){
		
		WebUI.click(findTestObject('Page_BugsUI Edit Product/button_deleteProduct_Yes'))
	}
}

WebUI.delay(3)

if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI Edit Product/div_Product has been deleted'), 0)){
	
	String text = WebUI.getText(findTestObject('Page_BugsUI Edit Product/div_Product has been deleted'))
	
	if(text.equals("Product has been deleted successfully.")){
		 assert true
	}
	else{
		assert false
	}
}

WebUI.closeBrowser()

