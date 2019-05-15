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

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import org.openqa.selenium.WebElement

class productAdd {
	

@Given("navigate_to_application_url")
def navigate_to_application_url(){
	WebUI.openBrowser('')
	
	WebUI.navigateToUrl(GlobalVariable.applicationUrl)
	
	WebUI.delay(3)
	
	WebUI.maximizeWindow()
	
	WebUI.delay(2)
}	
@When("login_to_application_with_valid_credentials")
def login_to_application_with_valid_credentials(){		
	
	WebUI.setText(findTestObject('Page_BugsUI/input_username'), 'knagendra-ext')
	
	WebUI.setText(findTestObject('Page_BugsUI/input_password'), 'Kum1!@#$%^&*()ar')
	
	if(WebUI.verifyElementClickable(findTestObject("Page_BugsUI/button_Login"))){
		
		WebUI.click(findTestObject('Page_BugsUI/button_Login'))
	}
	
	WebUI.delay(6)
}

@Then("click_on_ProductAdd_Button")
def click_on_ProductAdd_Button(){
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
	WebUI.closeBrowser()
}


}
