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

Mobile.startExistingApplication('id.qoin.korlantas.user.qa')

Mobile.tap(findTestObject('Object Repository/Login/Tap Textfield Phone Number'), 10)

Mobile.delay(2)

Mobile.setText(findTestObject('Object Repository/Login/Set Textfield Phone Number'), '082174620190', 10)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/Login/Tap Text Button Lanjutkan'), 10)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/Login/Tab Num 1'), 10)

Mobile.tap(findTestObject('Object Repository/Login/Tap Num 4'), 10)

Mobile.tap(findTestObject('Object Repository/Login/Tap Num 7'), 10)

Mobile.tap(findTestObject('Object Repository/Login/Tap Num 2'), 10)

Mobile.tap(findTestObject('Object Repository/Login/Tap Num 5'), 10)

Mobile.tap(findTestObject('Object Repository/Login/Tap Num 8'), 10)

Mobile.delay(2)

Mobile.verifyElementExist(findTestObject('Object Repository/Login/Homepage Menu SIM'), 10)

