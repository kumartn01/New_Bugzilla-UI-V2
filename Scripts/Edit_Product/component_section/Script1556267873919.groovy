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

if(WebUI.verifyElementPresent(findTestObject("Page_BugsUI Edit Product/button_AddNewRow_Component"), 0)){
	
	WebUI.click(findTestObject("Page_BugsUI Edit Product/button_AddNewRow_Component"))
	
}

WebUI.setText(findTestObject("Page_BugsUI Edit Product/unkown_description"), "C1 description")

if(WebUI.verifyElementPresent(findTestObject("Page_BugsUI Edit Product/button_Add_component"), 0)){
	
	WebUI.click(findTestObject("Page_BugsUI Edit Product/button_Add_component"))
	
}

if(WebUI.verifyElementPresent(findTestObject("Page_BugsUI Edit Product/div_Name_Email_required"), 0)){
	
	componentNameEmailReqMsg = WebUI.getText(findTestObject("Page_BugsUI Edit Product/div_Name_Email_required"))
	
	if(componentNameEmailReqMsg.equals("Name is required, Email is required")){
		assert true
	}
	else{
		assert false
	}	
}

WebUI.delay(2)

WebUI.setText(findTestObject("Page_BugsUI Edit Product/unknown_Component"), "C1")

WebUI.setText(findTestObject("Page_BugsUI Edit Product/unkown_defaultAssignee"), "kumar.nagendra@happiestminds.com")

if(WebUI.verifyElementPresent(findTestObject("Page_BugsUI Edit Product/button_Add_component"), 0)){
	
	WebUI.click(findTestObject("Page_BugsUI Edit Product/button_Add_component"))
	
}

if(WebUI.verifyElementPresent(findTestObject("Page_BugsUI Edit Product/div_Component_added"), 0)){
	
	componentAddedSuccessMsg = WebUI.getText(findTestObject("Page_BugsUI Edit Product/div_Component_added"))
	
	if(componentAddedSuccessMsg.equals("Component has been added successfully.")){
		assert true
	}
	else{
		assert false
	}	
}

WebUI.delay(3)

//After adding component verify if that component is added.

compName = WebUI.getAttribute(findTestObject('Page_BugsUI Edit Product/unknown_Component'),'value')

if(compName.equals("C1")){
	assert true
}
else{
	assert false
}

WebUI.delay(3)
//Delete the newly added component

if(WebUI.verifyElementPresent(findTestObject("Page_BugsUI Edit Product/delete_icon_unknownCompnent"), 0)){
	
	WebUI.click(findTestObject("Page_BugsUI Edit Product/delete_icon_unknownCompnent"))
}

CustomKeywords.'reusable.editPage.deleteComponent'()

if(WebUI.verifyElementPresent(findTestObject("Page_BugsUI Edit Product/div_Component_deleted"), 0)){
	
	componentDeletedSuccessMsg = WebUI.getText(findTestObject("Page_BugsUI Edit Product/div_Component_deleted"))
	
	if(componentDeletedSuccessMsg.equals("Component has been deleted successfully.")){
		assert true
	}
	else{
		assert false
	}
}

WebUI.delay(2)

if(!WebUI.getAttribute(findTestObject('Page_BugsUI Edit Product/unknown_Component'),'value').equals("C1")){
	
	assert true
}
else{
	assert false
}

WebUI.delay(3)




