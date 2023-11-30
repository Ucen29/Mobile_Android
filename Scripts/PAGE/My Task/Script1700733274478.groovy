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
import io.appium.java_client.touch.offset.PointOption as PointOption
import io.appium.java_client.touch.WaitOptions as WaitOptions
import static io.appium.java_client.touch.WaitOptions.waitOptions
import static io.appium.java_client.touch.offset.PointOption.point
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver
import io.appium.java_client.TouchAction as TouchAction
import io.appium.java_client.MobileElement as MobileElement

import io.appium.java_client.android.nativekey.AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.AndroidKeyCode

Mobile.startApplication('D:\\Data Pribadi\\app-release 1.apk', false)

Mobile.tap(findTestObject('Object Repository/My Task/Klik_myTask'), 30)

Mobile.tap(findTestObject('Object Repository/My Task/Klik_listTask', [('listTask') : listTask]), 30)

Mobile.waitForElementPresent(findTestObject('Object Repository/My Task/Klik_listTask', [('listTask') : listTask]), 30)

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

Mobile.waitForElementPresent(findTestObject('Object Repository/My Task/Klik_editPart'), 30)

Mobile.tap(findTestObject('Object Repository/My Task/Klik_editPart'), 30)

Mobile.tap(findTestObject('Object Repository/My Task/Input_nama'), 30)

Mobile.setText(findTestObject('Object Repository/My Task/Input_nama'), nama_participant, 30)

Mobile.waitForElementPresent(findTestObject('Object Repository/My Task/Klik_nama', [('list_nama') : list_nama]), 30)

//AndroidDriver<?> driver = MobileDriverFactory.getDriver()
//driver.pressKeyCode(AndroidKeyCode.BACK)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()
driver.pressKey(new KeyEvent(AndroidKey.ENTER))

Mobile.tap(findTestObject('Object Repository/My Task/Klik_nama', [('list_nama') : list_nama]), 30)

Mobile.tapAtPosition(594, 467)




