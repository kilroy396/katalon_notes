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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_Claim'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_From Date_oxd-input oxd-input--focus'), '2021/1/1')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_From DateApril2025SMTWTFS12345678910111_ab968a'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_From Date_oxd-input oxd-input--focus'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/claimsSection/datePickerYearLabel'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/i_From Date_oxd-icon bi-caret-down-fill oxd_b77a06'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/li_2021'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_April'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/li_January'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_1'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Search'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/div_202307180000002'), '202307180000002')

WebUI.closeBrowser()

