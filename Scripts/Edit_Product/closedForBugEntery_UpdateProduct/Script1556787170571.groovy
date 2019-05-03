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

WebUI.scrollToElement(findTestObject('Page_BugsUI Edit Product/input_newName'), 2)

//update product description

WebUI.clearText(findTestObject('Page_BugsUI Edit Product/textarea_description'))

WebUI.setText(findTestObject('Page_BugsUI Edit Product/textarea_description'), "Editing Description")

WebUI.delay(2)

if(WebUI.verifyElementClickable(findTestObject('Page_BugsUI Edit Product/button_update_product'))){
	
	WebUI.click(findTestObject('Page_BugsUI Edit Product/button_update_product'))
}

WebUI.delay(2)

CustomKeywords.'reusable.editPage.selectProduct'()

productDesc = WebUI.getAttribute(findTestObject('Page_BugsUI Edit Product/textarea_description'),'value')

if(productDesc.equals("Editing Description")){
	
	assert true
}
else{
	assert false
}

WebUI.clearText(findTestObject('Page_BugsUI Edit Product/textarea_description'))

WebUI.setText(findTestObject('Page_BugsUI Edit Product/textarea_description'), "Product for Automation")

WebUI.delay(2)

if(WebUI.verifyElementClickable(findTestObject('Page_BugsUI Edit Product/button_update_product'))){
	
	WebUI.click(findTestObject('Page_BugsUI Edit Product/button_update_product'))
}

WebUI.delay(2)

WebUI.closeBrowser()
