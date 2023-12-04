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

//Mobile.startApplication('D:\\Data Pribadi\\app-release 1.apk', false)

Mobile.tap(findTestObject('Object Repository/Workspace/tap_Workspace'), 10)

// driver dari MobileDriverFactory
AndroidDriver<?> driver = MobileDriverFactory.getDriver()

// Koodinat Edit Desc
int x = 220
int y = 175
int width = 77
int height = 77

// Menghitung koordinat Edit Desc
int centerX = x + (width / 2)
int centerY = y + (height / 2)

// Membuat TouchAction edit Desc
TouchAction touchAction = new TouchAction(driver)
touchAction.tap(PointOption.point(centerX, centerY))
.perform()

Mobile.tap(findTestObject('Object Repository/Workspace/tap_category'), 10)

Mobile.tap(findTestObject('Object Repository/Workspace/pilih_category',
	[('pilih_cat'):pilih_cat]), 10)

Mobile.tap(findTestObject('Object Repository/Workspace/tap_type'), 10)

Mobile.tap(findTestObject('Object Repository/Workspace/pilih_type',
	[('pilih_type'):pilih_type]), 10)

Mobile.tap(findTestObject('Object Repository/Workspace/input_name'), 10)

Mobile.setText(findTestObject('Object Repository/Workspace/input_name'), input_nama_ws, 10)

Mobile.tap(findTestObject('Object Repository/Workspace/input_desc'), 10)

Mobile.setText(findTestObject('Object Repository/Workspace/input_desc'), input_desc_ws, 10)

driver.pressKey(new KeyEvent(AndroidKey.BACK))

Mobile.tap(findTestObject('Object Repository/Workspace/tap_pimpinan'), 10)

Mobile.tap(findTestObject('Object Repository/Workspace/pilih_pimpinan',
	[('pilih_pimpinan'):pilih_pimpinan]), 10)

Mobile.tap(findTestObject('Object Repository/Workspace/tap_stardate'), 10)

Mobile.tap(findTestObject('Object Repository/Workspace/pilih_tanggal',
	[('pilih_tgl'):pilih_tgl_awal]), 10)

Mobile.tap(findTestObject('Object Repository/My Task/Tap_oke'), 10)

Mobile.tap(findTestObject('Object Repository/Workspace/tap_enddate'), 10)

Mobile.tap(findTestObject('Object Repository/Workspace/pilih_tanggal',
	[('pilih_tgl'):pilih_tgl_akhir]), 10)

Mobile.tap(findTestObject('Object Repository/My Task/Tap_oke'), 10)

'Get Device Height and Store in device_height variable'
device_Height = Mobile.getDeviceHeight()

'Get Width Height and Store in device_Width variable'
device_Width = Mobile.getDeviceWidth()
 
'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'
int startX = device_Width / 2
 
'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'
int endX = startX

'Storing the startY value'
int startY = device_Height * 0.30

'Storing the endY value'
int endY = device_Height * 0.70
 
'Swipe Vertical from top to bottom'
Mobile.swipe(startX, endY, endX, startY)

//Mobile.tap(findTestObject('Object Repository/Workspace/android.widget.CheckBox'), 10)

Mobile.tap(findTestObject('Object Repository/Workspace/tap_create'), 10)

Mobile.tap(findTestObject('Object Repository/Workspace/tap_close'), 10)

