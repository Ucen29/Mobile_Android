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

//'Get Device Height and Store in device_height variable'
//device_Height = Mobile.getDeviceHeight()
//
//'Get Device Width and Store in device_Width variable'
//device_Width = Mobile.getDeviceWidth()
//
//'Storing the startX,endX values by dividing device height by 2 Because Y coordinates are constant'
//int startY = device_Height / 2
//
//'Here endY and startY values are equal for vertical Swiping for that assigning startY value to endY'
//int endY = startY
//
//'Storing the startX value'
//int startX = device_Width * 0.30
//
//'Storing the endX value'
//int endX = device_Width * 0.70
//
//'Here Y constant for Swipe Vertical Left to Right'
//Mobile.swipe(startX, startY, endX, endY)

// driver dari MobileDriverFactory
AndroidDriver<?> driver = MobileDriverFactory.getDriver()

// Koodinat Edit Desc
int startX = 147
int startY = 1012
int endX = startX - 150 // Menggunakan width untuk menentukan akhir X
int endY = startY  // Tetap sama dengan koordinat awal Y untuk swipe horizontal

// Melakukan swipe horizontal
Mobile.swipe(startX, startY, endX, endY)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/Approve Workspace/tap_my_approval'), 10)

Mobile.tap(findTestObject('Object Repository/Approve Workspace/tap_list_workspace',
	[('pilih_ws_apprv'):ws_apprv]), 10)

Mobile.tap(findTestObject('Object Repository/Approve Workspace/tap_approve'), 10)

Mobile.tap(findTestObject('Object Repository/Approve Workspace/tap_close'), 10)
