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
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import org.openqa.selenium.WebElement

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

WebUI.delay(6)

if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI Dashboard/span_Dashboard'), 0)){
	
	if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI Dashboard/button_Product'), 10)){
		
		WebUI.click(findTestObject('Page_BugsUI Dashboard/button_Product'))
		
		WebUI.delay(2)
		
		if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI Dashboard/a_Add'), 5)){
			
			WebUI.click(findTestObject('Page_BugsUI Dashboard/a_Add'))
		}
	}
}

WebUI.delay(3)

if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI Add Product/span_Add Product'), 0)){
	
	assert true
}
else{
	assert false
}

//Verify the presence of following fields

WebUI.verifyElementPresent(findTestObject('Page_BugsUI Add Product/div_Choose Classification'), 1)

WebUI.verifyElementPresent(findTestObject('Page_BugsUI Add Product/input_name'), 1)

WebUI.verifyElementPresent(findTestObject('Page_BugsUI Add Product/textarea_description'), 1)

WebUI.verifyElementPresent(findTestObject('Page_BugsUI Add Product/checkbox_closedForBugEntry'), 1)

WebUI.verifyElementPresent(findTestObject('Page_BugsUI Add Product/input_version'), 1)

WebUI.verifyElementPresent(findTestObject('Page_BugsUI Add Product/input_component'), 1)

WebUI.verifyElementPresent(findTestObject('Page_BugsUI Add Product/div_Choose Assignee'), 1)

//Verify if Add product button is disabled when none of the mandatory values are entered
WebUI.scrollToElement(findTestObject('Page_BugsUI Add Product/AddProduct_button'), 0)

WebUI.delay(1)

if(WebUI.verifyElementNotClickable(findTestObject('Page_BugsUI Add Product/AddProduct_button'))){
	assert true
}
else{
	assert false
}

//Insert all the mandatory fields

WebUI.scrollToElement(findTestObject('Page_BugsUI Add Product/div_Choose Classification'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('Page_BugsUI Add Product/div_Choose Classification'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_BugsUI Add Product/span_Software'))

WebUI.setText(findTestObject('Page_BugsUI Add Product/input_name'), "1-Automation-testing")

WebUI.setText(findTestObject('Page_BugsUI Add Product/textarea_description'), "1-Automation-testing Description")

WebUI.setText(findTestObject('Page_BugsUI Add Product/input_version'), "1")

WebUI.scrollToElement(findTestObject('Page_BugsUI Add Product/AddProduct_button'), 0)

WebUI.delay(1)

if(WebUI.verifyElementNotClickable(findTestObject('Page_BugsUI Add Product/AddProduct_button'))){
	assert true
}
else{
	assert false
}

WebUI.setText(findTestObject('Page_BugsUI Add Product/defaultAssigne_inputbox'), "kumar nagendra")

WebUI.click(findTestObject('Page_BugsUI Add Product/span_kumar.nagendra'))

WebUI.delay(2)

//Check after filling all mandatory fields Add product button is enabled and is clickable

if(WebUI.verifyElementClickable(findTestObject('Page_BugsUI Add Product/AddProduct_button'))){
	assert true
}
else{
	assert false
}

//Now enter the component field and check for the button. It should get disabled again as component description is mandatory

WebUI.setText(findTestObject('Page_BugsUI Add Product/input_component'), "Auto-1")

WebUI.verifyElementPresent(findTestObject('Page_BugsUI Add Product/componentDescription'), 1)

if(WebUI.verifyElementNotClickable(findTestObject('Page_BugsUI Add Product/AddProduct_button'))){
	assert true
}
else{
	assert false
}

WebUI.setText(findTestObject('Page_BugsUI Add Product/componentDescription'), "Auto-1 description")

WebUI.scrollToElement(findTestObject('Page_BugsUI Add Product/AddProduct_button'), 1)

WebUI.delay(2)

if(WebUI.verifyElementClickable(findTestObject('Page_BugsUI Add Product/AddProduct_button'))){
	assert true
}
else{
	assert false
}

//Before creating new product lets verify creating duplicate Product. Application should not allow

WebUI.clearText(findTestObject('Page_BugsUI Add Product/input_name'))

WebUI.setText(findTestObject('Page_BugsUI Add Product/input_name'), "BugsUITest")

WebUI.click(findTestObject('Page_BugsUI Add Product/AddProduct_button'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Page_BugsUI Add Product/div_Product BugsUITest already'), 1)

String text = WebUI.getText(findTestObject('Page_BugsUI Add Product/div_Product BugsUITest already'))

if(text.equals("Product BugsUITest already exists.")){
	
	assert true
}
else{
	assert false
}

WebUI.clearText(findTestObject('Page_BugsUI Add Product/input_name'))

WebUI.setText(findTestObject('Page_BugsUI Add Product/input_name'), "1-Automation-testing")

WebUI.click(findTestObject('Page_BugsUI Add Product/AddProduct_button'))

WebUI.delay(3)

if(WebUI.verifyElementPresent(findTestObject('Page_BugsUI Add Product/div_Product_added_success'), 3)){

	String successMsg = WebUI.getText(findTestObject('Page_BugsUI Add Product/div_Product_added_success'))
	
	if(successMsg.equals("Product has been added successfully.")){
		
		assert true
	}
	else{
		assert false
	}
}

WebUI.delay(2)



