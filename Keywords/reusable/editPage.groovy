package reusable

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class editPage {
	
	@Keyword
	def selectProduct(){
		
		WebUI.setText(findTestObject("Page_BugsUI Edit Product/div_Choose Classification"), "Software")
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Page_BugsUI Edit Product/span_Software'))
		
		WebUI.setText(findTestObject("Page_BugsUI Edit Product/div_Choose Product"), "1-Auto-edit")
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Page_BugsUI Edit Product/span_1-Auto-edit'))
		
		WebUI.delay(2)
		
	}
	
	@Keyword
	def resetUnkownComponent(){
		
		WebUI.clearText(findTestObject("Page_BugsUI Edit Product/unkown_description"))
		
		WebUI.setText(findTestObject("Page_BugsUI Edit Product/unkown_description"), "unknown")
		
		WebUI.clearText(findTestObject("Page_BugsUI Edit Product/unkown_defaultAssignee"))
		
		WebUI.setText(findTestObject("Page_BugsUI Edit Product/unkown_defaultAssignee"), "kumar.nagendra@happiestminds.com")
		
		WebUI.click(findTestObject("Page_BugsUI Edit Product/update_icon_unknownComponent"))
		
		WebUI.delay(2)
		
	}
	
	@Keyword
	def deleteComponent(){
		
		if(WebUI.verifyElementPresent(findTestObject("Page_BugsUI Edit Product/confirmDeleteProduct_popup"), 0)){
			
			if(WebUI.verifyElementPresent(findTestObject("Page_BugsUI Edit Product/button_component_Yes"), 0)){
				
				WebUI.click(findTestObject('Page_BugsUI Edit Product/button_component_Yes'))
			}
		}
	}
	
	@Keyword
	def deleteVersion(){
		
		if(WebUI.verifyElementPresent(findTestObject("Page_BugsUI Edit Product/confirmDeleteProduct_popup"), 0)){
	
			if(WebUI.verifyElementPresent(findTestObject("Page_BugsUI Edit Product/button_version_Yes"), 0)){
				
				WebUI.click(findTestObject('Page_BugsUI Edit Product/button_version_Yes'))
			}
		}
	}

}
