import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.241.158.156/#/')

WebUI.click(findTestObject('Object Repository/Page_front/span_Create Reservation'))

WebUI.setText(findTestObject('Object Repository/Page_front/input_First name_input-32'), 'Bryan')

WebUI.setText(findTestObject('Object Repository/Page_front/input_E-mail_input-35'), 'bryan@bryan.cl')

WebUI.setText(findTestObject('Object Repository/Page_front/input_Contact_input-38'), '+56912345678')

WebUI.setText(findTestObject('Object Repository/Page_front/input_Passport_input-41'), 'M1223456')

WebUI.click(findTestObject('Object Repository/Page_front/i_arrow_drop_down'))

WebUI.click(findTestObject('Object Repository/Page_front/div_780'))

WebUI.click(findTestObject('Object Repository/Page_front/span_Create Reservation_1'))

