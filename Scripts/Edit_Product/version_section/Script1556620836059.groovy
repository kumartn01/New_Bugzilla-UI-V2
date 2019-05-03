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

//verify user cannot delete  only version present in product

if(WebUI.verifyElementPresent(findTestObject("Page_BugsUI Edit Product/delete_icon_version"), 0)){
	
	WebUI.click(findTestObject("Page_BugsUI Edit Product/delete_icon_version"))
}

WebUI.delay(2)

CustomKeywords.'reusable.editPage.deleteVersion'()

WebUI.delay(2)

if(WebUI.verifyElementPresent(findTestObject("Page_BugsUI Edit Product/div_Product_atleast_1_version"), 0)){
	
	warningMessage = WebUI.getText(findTestObject("Page_BugsUI Edit Product/div_Product_atleast_1_version"))
	
	if(warningMessage.equals("Product must have atleast 1 version.")){
		
		assert true
	}
	else{
		assert false
	}
}
WebUI.delay(3)

//verify updating the version when nothing is updated

if(WebUI.verifyElementPresent(findTestObject("Page_BugsUI Edit Product/update_icon_version"), 0)){
	
	WebUI.click(findTestObject("Page_BugsUI Edit Product/update_icon_version"))
	
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



//Add new row of version

if(WebUI.verifyElementPresent(findTestObject("Page_BugsUI Edit Product/button_AddNewRow_version"), 0)){
	
	WebUI.click(findTestObject("Page_BugsUI Edit Product/button_AddNewRow_version"))
	
}

WebUI.setText(findTestObject("Page_BugsUI Edit Product/input_versionName"), "V7")


if(WebUI.verifyElementPresent(findTestObject("Page_BugsUI Edit Product/button_Add_version"), 0)){
	
	WebUI.click(findTestObject("Page_BugsUI Edit Product/button_Add_version"))
	
}

if(WebUI.verifyElementPresent(findTestObject("Page_BugsUI Edit Product/div_Version_added"), 0)){
	
	versionAddedSuccessMsg = WebUI.getText(findTestObject("Page_BugsUI Edit Product/div_Version_added"))
	
	if(versionAddedSuccessMsg.equals("Version has been added successfully.")){
		assert true
	}
	else{
		assert false
	}
}

WebUI.delay(3)

//Now update the version

WebUI.clearText(findTestObject("Page_BugsUI Edit Product/input_versionName"))

WebUI.setText(findTestObject("Page_BugsUI Edit Product/input_versionName"), "V5")

WebUI.click(findTestObject("Page_BugsUI Edit Product/update_icon_version"))

WebUI.delay(3)

if(WebUI.verifyElementPresent(findTestObject("Page_BugsUI Edit Product/div_Version_updated"), 0)){
	
	versionUpdatedMsg = WebUI.getText(findTestObject("Page_BugsUI Edit Product/div_Version_updated"))
	
	if(versionUpdatedMsg.equals("Version has been updated successfully.")){
		
		assert true
	}
	else{
		assert false
	}
}
WebUI.delay(2)

versionName = WebUI.getAttribute(findTestObject('Page_BugsUI Edit Product/input_versionName'),'value')

if(versionName.equals("V5")){
	assert true
}
else{
	assert false
}

if(WebUI.verifyElementPresent(findTestObject("Page_BugsUI Edit Product/delete_icon_version"), 0)){
	
	WebUI.click(findTestObject("Page_BugsUI Edit Product/delete_icon_version"))
}

WebUI.delay(3)

CustomKeywords.'reusable.editPage.deleteVersion'()

if(WebUI.verifyElementPresent(findTestObject("Page_BugsUI Edit Product/div_Version_deleted"), 0)){
	
	versionDeletedSuccessMsg = WebUI.getText(findTestObject("Page_BugsUI Edit Product/div_Version_deleted"))
	
	if(versionDeletedSuccessMsg.equals("Version has been deleted successfully.")){
		assert true
	}
	else{
		assert false
	}
}

WebUI.delay(3)

WebUI.clearText(findTestObject("Page_BugsUI Edit Product/input_versionName"))

WebUI.setText(findTestObject("Page_BugsUI Edit Product/input_versionName"), "1")

WebUI.click(findTestObject("Page_BugsUI Edit Product/update_icon_version"))

WebUI.delay(4)