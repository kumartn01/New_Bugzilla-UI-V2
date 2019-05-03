import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.junit.After

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

//verify user can delete unknown and only component

if(WebUI.verifyElementPresent(findTestObject("Page_BugsUI Edit Product/delete_icon_unknownCompnent"), 0)){
	
	WebUI.click(findTestObject("Page_BugsUI Edit Product/delete_icon_unknownCompnent"))
}

WebUI.delay(2)

if(WebUI.verifyElementPresent(findTestObject("Page_BugsUI Edit Product/confirmDeleteProduct_popup"), 0)){
	
	if(WebUI.verifyElementPresent(findTestObject("Page_BugsUI Edit Product/button_component_Yes"), 0)){
		
		WebUI.click(findTestObject('Page_BugsUI Edit Product/button_component_Yes'))
	}
}

WebUI.delay(2)

if(WebUI.verifyElementPresent(findTestObject("Page_BugsUI Edit Product/div_Product_atleast_1_component"), 0)){
	
	warningMessage = WebUI.getText(findTestObject("Page_BugsUI Edit Product/div_Product_atleast_1_component"))
	
	if(warningMessage.equals("Product must have at least 1 component.")){
		
		assert true
	}
	else{
		assert false
	}
}
WebUI.delay(3)
//verify updating the unknown component when nothing is updated

if(WebUI.verifyElementPresent(findTestObject("Page_BugsUI Edit Product/update_icon_unknownComponent"), 0)){
	
	WebUI.click(findTestObject("Page_BugsUI Edit Product/update_icon_unknownComponent"))
	
	if(WebUI.verifyElementPresent(findTestObject("Page_BugsUI Edit Product/div_Nothing to update"), 0)){
		
		nothingToUpdate = WebUI.getText(findTestObject("Page_BugsUI Edit Product/div_Nothing to update"))
		
		if(nothingToUpdate.equals("Nothing to update.")){
			
			assert true
		}
		else{
			assert false
		}
	}
}

//Now update the unknown component

WebUI.clearText(findTestObject("Page_BugsUI Edit Product/unkown_description"))

WebUI.setText(findTestObject("Page_BugsUI Edit Product/unkown_description"), "unknown1234")

WebUI.clearText(findTestObject("Page_BugsUI Edit Product/unkown_defaultAssignee"))

WebUI.setText(findTestObject("Page_BugsUI Edit Product/unkown_defaultAssignee"), "divya.r@happiestminds.com")

WebUI.click(findTestObject("Page_BugsUI Edit Product/update_icon_unknownComponent"))

if(WebUI.verifyElementPresent(findTestObject("Page_BugsUI Edit Product/div_Component has been updated"), 0)){
	
	componentUpdatedMsg = WebUI.getText(findTestObject("Page_BugsUI Edit Product/div_Component has been updated"))
	
	if(componentUpdatedMsg.equals("Component has been updated successfully.")){
		
		assert true
	}
	else{
		assert false
	}
}
WebUI.delay(4)

CustomKeywords.'reusable.editPage.resetUnkownComponent'()

WebUI.delay(3)


