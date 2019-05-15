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


suiteProperties.put('id', 'Test Suites/CucumberSmoke')

suiteProperties.put('name', 'CucumberSmoke')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\New-Bugzilla-Application\\Automation\\New_Bugzilla-UI-V2\\Reports\\CucumberSmoke\\20190515_144551\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/CucumberSmoke', suiteProperties, [new TestCaseBinding('Test Cases/BDD Cucumber TestCases/CaptureVersionOfApplication', 'Test Cases/BDD Cucumber TestCases/CaptureVersionOfApplication',  null), new TestCaseBinding('Test Cases/BDD Cucumber TestCases/BugzillaApplicationLoads', 'Test Cases/BDD Cucumber TestCases/BugzillaApplicationLoads',  null), new TestCaseBinding('Test Cases/BDD Cucumber TestCases/ValidLogin', 'Test Cases/BDD Cucumber TestCases/ValidLogin',  null), new TestCaseBinding('Test Cases/BDD Cucumber TestCases/NewProductAdd', 'Test Cases/BDD Cucumber TestCases/NewProductAdd',  null), new TestCaseBinding('Test Cases/BDD Cucumber TestCases/AvailabilityOfAddedProduct', 'Test Cases/BDD Cucumber TestCases/AvailabilityOfAddedProduct',  null), new TestCaseBinding('Test Cases/BDD Cucumber TestCases/DeleteAddedProduct', 'Test Cases/BDD Cucumber TestCases/DeleteAddedProduct',  null), new TestCaseBinding('Test Cases/BDD Cucumber TestCases/EditProductFields', 'Test Cases/BDD Cucumber TestCases/EditProductFields',  null), new TestCaseBinding('Test Cases/BDD Cucumber TestCases/UpdateProduct', 'Test Cases/BDD Cucumber TestCases/UpdateProduct',  null), new TestCaseBinding('Test Cases/BDD Cucumber TestCases/NewBugCreation', 'Test Cases/BDD Cucumber TestCases/NewBugCreation',  null), new TestCaseBinding('Test Cases/BDD Cucumber TestCases/VerifyCommitForBugPage', 'Test Cases/BDD Cucumber TestCases/VerifyCommitForBugPage',  null), new TestCaseBinding('Test Cases/BDD Cucumber TestCases/VerifyAddingComments', 'Test Cases/BDD Cucumber TestCases/VerifyAddingComments',  null), new TestCaseBinding('Test Cases/BDD Cucumber TestCases/BasicSearch', 'Test Cases/BDD Cucumber TestCases/BasicSearch',  null)])
