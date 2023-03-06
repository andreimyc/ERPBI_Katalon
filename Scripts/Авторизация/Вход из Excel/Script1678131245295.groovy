import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

'Открыть браузер'
WebUI.openBrowser(GlobalVariable.url)

'Ввести логин'
WebUI.setText(findTestObject('Авторизация/Page_ERPBI/input__input-23'), login)

'Ввести пароль'
WebUI.setText(findTestObject('Авторизация/Page_ERPBI/input__input-27'), password)

'Нажать кнопку "Войти"'
WebUI.click(findTestObject('Авторизация/Page_ERPBI/button_'))

'Проверить элемент Логотип'
WebUI.verifyElementPresent(findTestObject('Авторизация/Page_ERPBI/div_'), 0)

'Закрыть браузер'
WebUI.closeBrowser()

