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

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.testobject.ConditionType
import io.appium.java_client.TouchAction
import io.appium.java_client.touch.offset.PointOption

import io.appium.java_client.android.nativekey.AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.AndroidKeyCode
import io.appium.java_client.MobileElement

Mobile.tap(findTestObject('Object Repository/Create Activity/tap_my_workspace'), 10)

Mobile.tap(findTestObject('Object Repository/Create Activity/tap_list_ws',
	[('list_ws'):list]), 10)

Mobile.tap(findTestObject('Object Repository/My Workspace/Klik_goToWs'), 10)

Mobile.tap(findTestObject('Object Repository/Create Activity/tap_addActivity'), 10)

Mobile.waitForElementPresent(findTestObject('Object Repository/Create Activity/tap_activityName'), 10)

Mobile.tap(findTestObject('Object Repository/Create Activity/tap_activityName'), 10)

Mobile.tap(findTestObject('Object Repository/Create Activity/pilih_activity',
	[('pilih_act'):Activity]), 10)

Mobile.tap(findTestObject('Object Repository/Create Activity/tap_save'), 10)

Mobile.tap(findTestObject('Object Repository/Workspace/tap_close'), 10)

