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
int x1 = 335
int y2 = 514
int width1 = 56
int height2 = 56

// Koordinat Edit PS
int x = 360
int y = 745
int width = 166
int height = 66

// Menghitung koordinat Edit Desc
int centerX1 = x1 + (width1 / 2)
int centerY2 = y2 + (height2 / 2)

// Menghitung koordinat Edit PS
int centerX = x + (width / 2)
int centerY = y + (height / 2)

// Membuat TouchAction Edit PS
TouchAction touchAction = new TouchAction(driver)
println('berhasil tap')
touchAction.tap(PointOption.point(centerX, centerY)).perform()
println('sukses tap')

// Membuat TouchAction edit Desc
TouchAction touchAction1 = new TouchAction(driver)
touchAction1.tap(PointOption.point(centerX1, centerY2)).perform()

Mobile.waitForElementPresent(findTestObject('Object Repository/My Task/Edit_description'), 30)

Mobile.tap(findTestObject('Object Repository/My Task/Edit_description'), 30)

Mobile.setText(findTestObject('Object Repository/My Task/Edit_description'), edit_desc, 30)

driver.pressKey(new KeyEvent(AndroidKey.BACK))
println('sukses')


