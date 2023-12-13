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
import org.openqa.selenium.Dimension
import io.appium.java_client.TouchAction
import io.appium.java_client.android.AndroidDriver
import org.openqa.selenium.Dimension

import static ScrollHeightWidth.customScroll
import static ScrollDropdown.scrollDown

Mobile.tap(findTestObject('Object Repository/Calender Meet/tap_meetMgnt'), 10)

//Melakukan type at posision
int x = 538 + 28 / 2
int y = 541 + 28 / 2

Mobile.tapAtPosition(x, y)

Mobile.tap(findTestObject('Object Repository/Calender Meet/tap_tglMeet',
	[('pilih_tgl'):pilih_tgl]), 0)

// driver dari MobileDriverFactory
AndroidDriver<?> driver = MobileDriverFactory.getDriver()
device_Height = Mobile.getDeviceHeight()
device_Width = Mobile.getDeviceWidth()

int startX = device_Width / 2
int endX = startX
int startY = device_Height * 0.30
int endY = device_Height * 0.70
 
'Swipe Vertical from top to bottom'
Mobile.swipe(startX, endY, endX, startY)

Mobile.tap(findTestObject('Object Repository/Calender Meet/tap_viewMeet',
	[('judulMeet'):judulMeet]), 0)

Mobile.tap(findTestObject('Object Repository/Calender Meet/tap_editMeet'), 0)

Mobile.tap(findTestObject('Object Repository/Calender Meet/tap_editSub'), 0)

Mobile.setText(findTestObject('Object Repository/Calender Meet/tap_editSub'), editSubject, 0)

driver.pressKey(new KeyEvent(AndroidKey.BACK))

Mobile.tap(findTestObject('Object Repository/Create Activity/tap_save'), 0)



