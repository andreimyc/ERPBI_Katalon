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

suiteProperties.put('id', 'Test Suites/\u0410\u0432\u0442\u043E\u0440\u0438\u0437\u0430\u0446\u0438\u044F')
suiteProperties.put('name', '\u0410\u0432\u0442\u043E\u0440\u0438\u0437\u0430\u0446\u0438\u044F')
suiteProperties.put('description', '')
suiteProperties.put('rerunTestFailImmediately', 'false')
suiteProperties.put('retryCount', '0')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\Andrei\\git\\ERPBI_Katalon\\Reports\\20230302_224120\\\u0410\u0432\u0442\u043E\u0440\u0438\u0437\u0430\u0446\u0438\u044F\\20230302_224121\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Авторизация', suiteProperties, new File("C:\\Users\\Andrei\\git\\ERPBI_Katalon\\Reports\\20230302_224120\\\u0410\u0432\u0442\u043E\u0440\u0438\u0437\u0430\u0446\u0438\u044F\\20230302_224121\\testCaseBinding"))