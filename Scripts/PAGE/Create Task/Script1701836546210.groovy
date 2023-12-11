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

import static ScrollHeightWidth.customScroll
import static ScrollDropdown.scrollDown



Mobile.tap(findTestObject('Object Repository/Create Activity/tap_my_workspace'), 10)

Mobile.delay(6)

Mobile.tap(findTestObject('Object Repository/Create Activity/tap_list_ws',
	[('list_ws'):list]), 10)

Mobile.tap(findTestObject('Object Repository/My Workspace/Klik_goToWs'), 10)

Mobile.tap(findTestObject('Object Repository/Create Task/tap_addTask'), 30)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Create Task/input_taskName'), 30)

Mobile.setText(findTestObject('Object Repository/Create Task/input_taskName'), input_taskName, 30)

//driver.pressKey(new KeyEvent(AndroidKey.BACK))

Mobile.tap(findTestObject('Object Repository/Create Task/input_taskDesc'), 30)

Mobile.setText(findTestObject('Object Repository/Create Task/input_taskDesc'), input_taskDesc, 30)

// driver dari MobileDriverFactory
AndroidDriver<?> driver = MobileDriverFactory.getDriver()
driver.pressKey(new KeyEvent(AndroidKey.BACK))

// Koodinat Edit Desc
int x = 28
int y = 745
int width = 664
int height = 199

// Menghitung koordinat Edit Desc
int centerX = x + (width / 2)
int centerY = y + (height / 2)

// Membuat TouchAction edit Desc
TouchAction touchAction = new TouchAction(driver)
touchAction.tap(PointOption.point(centerX, centerY)).perform()

Mobile.tap(findTestObject('Object Repository/Create Task/tap_taskType'), 10)

Mobile.tap(findTestObject('Object Repository/Create Task/pilih_taskType',
	[('pilih_type'):task]), 10)


device_Height = Mobile.getDeviceHeight()
device_Width = Mobile.getDeviceWidth()

int startX2 = device_Width / 2
int endX2 = startX2
int startY2 = device_Height * 0.30
int endY2 = device_Height * 0.70
 
'Swipe Vertical from top to bottom'
Mobile.swipe(startX2, endY2, endX2, startY2)

Mobile.delay (15)

Mobile.tap(findTestObject('Object Repository/Create Task/tap_satker'), 20)

// Koodinat Edit Desc
int startX1 = 28
int startY1 = 1086
int height1 = 279
int width1 = 664
int endX1 = startX1 + width1
int endY1 = startY1 + height1

int maxSwipes = 2
int swipeCount = 0
boolean isElementFound = false

while (swipeCount < maxSwipes && !isElementFound) {
	// Cari elemen yang diinginkan
	if (Mobile.waitForElementPresent(findTestObject('Object Repository/Create Task/pilih_satker'), 10)){
        isElementFound = true
        Mobile.tap(findTestObject('Object Repository/Create Task/pilih_satker'),10)
		
	} else {
		ScrollDropdown.scrollDown(1)
		swipeCount++
		
	}
}

Mobile.tap(findTestObject('Object Repository/Create Task/tap_startDate'), 10)

Mobile.tap(findTestObject('Object Repository/Create Task/pilih_startDate',
	[('pilih_startDate'):startDate]),10)

Mobile.tap(findTestObject('Object Repository/My Task/Tap_oke'), 10)

Mobile.tap(findTestObject('Object Repository/Create Task/tap_endDate'), 10)

Mobile.tap(findTestObject('Object Repository/Create Task/pilih_endDate',
	[('pilih_endDate'):endDate]),10)

Mobile.tap(findTestObject('Object Repository/My Task/Tap_oke'), 10)

Mobile.tap(findTestObject('Object Repository/Workspace/tap_create'), 10)

Mobile.waitForElementPresent(findTestObject('Object Repository/Workspace/tap_close'), 10)

Mobile.tap(findTestObject('Object Repository/Workspace/tap_close'), 10)

