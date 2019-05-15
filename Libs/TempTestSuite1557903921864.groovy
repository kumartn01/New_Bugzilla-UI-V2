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


suiteProperties.put('id', 'Test Suites/Cucumber_Login_Suite')

suiteProperties.put('name', 'Cucumber_Login_Suite')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\New-Bugzilla-Application\\Automation\\New_Bugzilla-UI-V2\\Reports\\Cucumber_Login_Suite\\20190515_123521\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Cucumber_Login_Suite', suiteProperties, [new TestCaseBinding('Test Cases/BDD Cucumber TestCases/CaptureVersionOfApplication', 'Test Cases/BDD Cucumber TestCases/CaptureVersionOfApplication',  null), new TestCaseBinding('Test Cases/BDD Cucumber TestCases/BugzillaApplicationLoads', 'Test Cases/BDD Cucumber TestCases/BugzillaApplicationLoads',  null), new TestCaseBinding('Test Cases/BDD Cucumber TestCases/ValidLogin', 'Test Cases/BDD Cucumber TestCases/ValidLogin',  null)])
