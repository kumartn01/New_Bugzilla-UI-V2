import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/SmokeSuite')

suiteProperties.put('name', 'SmokeSuite')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\New-Bugzilla-Application\\Automation\\New_Bugzilla-UI-V2\\Reports\\SmokeSuite\\20190507_163854\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/SmokeSuite', suiteProperties, [new TestCaseBinding('Test Cases/Login/Bugzilla-LoginPage-Loads', 'Test Cases/Login/Bugzilla-LoginPage-Loads',  null), new TestCaseBinding('Test Cases/Login/Valid_Login', 'Test Cases/Login/Valid_Login',  null), new TestCaseBinding('Test Cases/Add_Product/AddProductFields_verification', 'Test Cases/Add_Product/AddProductFields_verification',  null), new TestCaseBinding('Test Cases/Add_Product/AddedProductAvailability', 'Test Cases/Add_Product/AddedProductAvailability',  null), new TestCaseBinding('Test Cases/Add_Product/Delete_added_product', 'Test Cases/Add_Product/Delete_added_product',  null), new TestCaseBinding('Test Cases/Edit_Product/Edit_product_fields', 'Test Cases/Edit_Product/Edit_product_fields',  null), new TestCaseBinding('Test Cases/Edit_Product/closedForBugEntery_UpdateProduct', 'Test Cases/Edit_Product/closedForBugEntery_UpdateProduct',  null), new TestCaseBinding('Test Cases/NewBugCreation/Creating_bug', 'Test Cases/NewBugCreation/Creating_bug',  null), new TestCaseBinding('Test Cases/BugPage/verify_commit_for_bugPage', 'Test Cases/BugPage/verify_commit_for_bugPage',  null), new TestCaseBinding('Test Cases/BugPage/verify_addingComments', 'Test Cases/BugPage/verify_addingComments',  null), new TestCaseBinding('Test Cases/SearchPage/verify_user_able_to_search_basicflow', 'Test Cases/SearchPage/verify_user_able_to_search_basicflow',  null)])
