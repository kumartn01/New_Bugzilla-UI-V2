import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/Product_Add_Suite')

suiteProperties.put('name', 'Product_Add_Suite')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\New-Bugzilla-Application\\New_Bugzilla-UI-V2\\Reports\\Product_Add_Suite\\20190503_120851\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Product_Add_Suite', suiteProperties, [new TestCaseBinding('Test Cases/Add_Product/AddProductFields_verification', 'Test Cases/Add_Product/AddProductFields_verification',  null), new TestCaseBinding('Test Cases/Add_Product/AddedProductAvailability', 'Test Cases/Add_Product/AddedProductAvailability',  null), new TestCaseBinding('Test Cases/Add_Product/Delete_added_product', 'Test Cases/Add_Product/Delete_added_product',  null)])
