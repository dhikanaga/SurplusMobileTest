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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

Mobile.startExistingApplication(GlobalVariable.appId)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'surplus.surplus.LoginKeyword.successLogin'(GlobalVariable.email, GlobalVariable.password)

Mobile.tap(findTestObject('Logout/menu_Profile'), 3)

Mobile.tap(findTestObject('Logout/button_Setting'), 3)

Mobile.tap(findTestObject('Logout/menu_Account_Settings'), 3)

Mobile.tap(findTestObject('Logout/button_Logout'), 3)

Mobile.tap(findTestObject('Logout/button_Logout_Confirm'), 3)

Mobile.verifyElementExist(findTestObject('Login/button_Masuk_To_Login'), 0)

Mobile.closeApplication()

