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

//check whether product name, description, component and version values are present by default
WebUI.scrollToElement(findTestObject("Page_BugsUI Edit Product/input_newName"), 1)


productName = WebUI.getAttribute(findTestObject('Page_BugsUI Edit Product/input_newName'), 'value')

productDescription = WebUI.getAttribute(findTestObject('Page_BugsUI Edit Product/textarea_description'),'value')

if(productName.equals("1-Auto-edit")){
	assert true
}
else{
	assert false
}

if(!productDescription.isEmpty()){
	assert true
}
else{
	assert false
}

WebUI.verifyElementNotClickable(findTestObject('Page_BugsUI Edit Product/unknown_Component'))

unkownComponentName = WebUI.getAttribute(findTestObject('Page_BugsUI Edit Product/unknown_Component'),'value')

if(unkownComponentName.equals("Unknown")){
	assert true
}
else{
	assert false
}

unkownComponentDesc = WebUI.getAttribute(findTestObject('Page_BugsUI Edit Product/unkown_description'),'value')
unkownComponentDefaultAsignee = WebUI.getAttribute(findTestObject('Page_BugsUI Edit Product/unkown_defaultAssignee'),'value')

if(!unkownComponentDesc.isEmpty() && !unkownComponentDefaultAsignee.isEmpty()){
	
	assert true
}
else{
	assert false
}

WebUI.delay(2)

