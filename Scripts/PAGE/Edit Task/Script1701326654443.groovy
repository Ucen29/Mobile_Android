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

Mobile.tap(findTestObject('Object Repository/My Task/Klik_listTask', [('listTask') : listTask]), 30)

Mobile.waitForElementPresent(findTestObject('Object Repository/My Task/Klik_listTask', [('listTask') : listTask]), 30)

// driver dari MobileDriverFactory
AndroidDriver<?> driver = MobileDriverFactory.getDriver()

// Koodinat Edit Desc
int x = 335
int y = 514
int width = 56
int height = 56

// Menghitung koordinat Edit Desc
int centerX = x + (width / 2)
int centerY = y + (height / 2)

// Membuat TouchAction edit Desc
TouchAction touchAction1 = new TouchAction(driver)
touchAction1.tap(PointOption.point(centerX, centerY)).perform()

Mobile.waitForElementPresent(findTestObject('Object Repository/My Task/Edit_description'), 30)

Mobile.tap(findTestObject('Object Repository/My Task/Edit_description'), 30)

Mobile.setText(findTestObject('Object Repository/My Task/Edit_description'), edit_desc, 30)

driver.pressKey(new KeyEvent(AndroidKey.BACK))

//Scroll top to buttom
device_Height = Mobile.getDeviceHeight()
device_Width = Mobile.getDeviceWidth()
 
int startX = device_Width / 2
int endX = startX
int startY = device_Height * 0.30
int endY = device_Height * 0.70
 
'Swipe Vertical from top to bottom'
Mobile.swipe(startX, endY, endX, startY)

Mobile.tap(findTestObject('Object Repository/My Task/Tap_startDate',
	[('start_date'):start_date]), 10)

Mobile.tap(findTestObject('Object Repository/My Task/Tap_pilihTahun'), 10)

Mobile.tap(findTestObject('Object Repository/My Task/Tap_tahun',
	[('pilih_tahun'):pilih_tahun]), 10)

for (int i = 0; i < 5; i++) {
	Mobile.tap(findTestObject('Object Repository/My Task/Tap_prev'), 10)
}

Mobile.tap(findTestObject('Object Repository/My Task/Tap_tanggal',
	[('tanggal'):tanggal1]), 10)

Mobile.tap(findTestObject('Object Repository/My Task/Tap_oke'), 10)

Mobile.tap(findTestObject('Object Repository/My Task/Tap_endDate',
	[('end_date'):end_date]), 10)

Mobile.tap(findTestObject('Object Repository/My Task/Tap_tanggal',
	[('tanggal'):tanggal2]), 10)

Mobile.tap(findTestObject('Object Repository/My Task/Tap_oke'), 10)
