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


suiteProperties.put('id', 'Test Suites/Edit_Product_Suite')

suiteProperties.put('name', 'Edit_Product_Suite')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\New-Bugzilla-Application\\New_Bugzilla-UI-V2\\Reports\\Edit_Product_Suite\\20190503_115649\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Edit_Product_Suite', suiteProperties, [new TestCaseBinding('Test Cases/Edit_Product/Edit_product_fields', 'Test Cases/Edit_Product/Edit_product_fields',  null), new TestCaseBinding('Test Cases/Edit_Product/verify_values_prepopulated', 'Test Cases/Edit_Product/verify_values_prepopulated',  null), new TestCaseBinding('Test Cases/Edit_Product/default_UnknownComponent', 'Test Cases/Edit_Product/default_UnknownComponent',  null), new TestCaseBinding('Test Cases/Edit_Product/component_section', 'Test Cases/Edit_Product/component_section',  null), new TestCaseBinding('Test Cases/Edit_Product/version_section', 'Test Cases/Edit_Product/version_section',  null), new TestCaseBinding('Test Cases/Edit_Product/closedForBugEntery_UpdateProduct', 'Test Cases/Edit_Product/closedForBugEntery_UpdateProduct',  null)])
