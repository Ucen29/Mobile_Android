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

Mobile.startApplication('D:\\Data Pribadi\\app-release 1.apk', false)

Mobile.tap(findTestObject('Object Repository/My Task/Klik_myTask'), 30)

Mobile.delay(3)

// driver dari MobileDriverFactory
AndroidDriver<?> driver = MobileDriverFactory.getDriver()

// Koodinat Filter Task
int x = 559
int y = 472
int width = 53
int height = 53

// Menghitung koordinat Filter Task
int centerX = x + (width / 2)
int centerY = y + (height / 2)

// Membuat TouchAction Filter Task
TouchAction touchAction = new TouchAction(driver)
touchAction.tap(PointOption.point(centerX, centerY)).perform()

Mobile.tap(findTestObject('Object Repository/My Task/Tap_filter',
	[('pilih_filter'):pilih_filter]), 30)

Mobile.tap(findTestObject('Object Repository/My Task/Tap_apply'), 10)

Mobile.delay(4)

// Koodinat Sort Task
int x1 = 640
int y1 = 472
int width1 = 52
int height1 = 53

// Menghitung koordinat Sort Task
int centerX1 = x1 + (width1 / 2)
int centerY1 = y1 + (height1 / 2)

// Membuat TouchAction Sort Task 
TouchAction touchAction1 = new TouchAction(driver)
touchAction1.tap(PointOption.point(centerX1, centerY1)).perform()

Mobile.tap(findTestObject('Object Repository/My Task/Tap_sort',
	[('pilih_sort'):pilih_sort]), 10)

Mobile.tap(findTestObject('Object Repository/My Task/Tap_apply'), 10)