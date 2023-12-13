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

Mobile.tap(findTestObject('Object Repository/Approve Task/tap_addActivity'), 10)

Mobile.waitForElementPresent(findTestObject('Object Repository/Create Activity/tap_activityName'), 10)

Mobile.tap(findTestObject('Object Repository/Create Activity/tap_activityName'), 10)

Mobile.tap(findTestObject('Object Repository/Create Activity/pilih_activity',
	[('pilih_act'):pilih_act]), 10)

Mobile.tap(findTestObject('Object Repository/Create Activity/tap_save'), 10)

Mobile.waitForElementPresent(findTestObject('Object Repository/Approve Workspace/tap_close'), 10)

Mobile.tap(findTestObject('Object Repository/Approve Workspace/tap_close'), 10)

Mobile.tap(findTestObject('Object Repository/Approve Task/tap_tabActivity',
	[('tabActivity'):tabActivity]), 10)

Mobile.tap(findTestObject('Object Repository/Create Task/tap_addTask'), 10)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/Create Task/input_taskName'), 0)

Mobile.setText(findTestObject('Object Repository/Create Task/input_taskName'), NamaTask, 0)

Mobile.tap(findTestObject('Object Repository/Create Task/input_taskDesc'), 0)

Mobile.setText(findTestObject('Object Repository/Create Task/input_taskDesc'), DescTask, 0)

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

Mobile.tap(findTestObject('Object Repository/Approve Task/tap_komite'), 0)

Mobile.tap(findTestObject('Object Repository/Approve Task/pilih_komite',
	[('pilih_komite'):komite]), 10)

device_Height = Mobile.getDeviceHeight()
device_Width = Mobile.getDeviceWidth()

int startX2 = device_Width / 2
int endX2 = startX2
int startY2 = device_Height * 0.30
int endY2 = device_Height * 0.70
 
'Swipe Vertical from top to bottom'
Mobile.swipe(startX2, endY2, endX2, startY2)

Mobile.tap(findTestObject('Object Repository/Approve Task/tap_week'), 0)

Mobile.tap(findTestObject('Object Repository/Approve Task/pilih_week',
	[('pilih_week'):week]), 0)

Mobile.tap(findTestObject('Object Repository/Approve Task/tap_month'), 0)

Mobile.tap(findTestObject('Object Repository/Approve Task/pilih_month',
	[('pilih_month'):month]), 0)

Mobile.tap(findTestObject('Object Repository/Approve Task/tap_year'), 0)

Mobile.tap(findTestObject('Object Repository/Approve Task/pilih_year',
	[('pilih_year'):year]), 0)

Mobile.tap(findTestObject('Object Repository/Approve Task/tap_startDate'), 0)

Mobile.tap(findTestObject('Object Repository/Create Task/pilih_startDate',
	[('pilih_startDate'):startDate]), 0)

Mobile.tap(findTestObject('Object Repository/My Task/Tap_oke'), 0)

Mobile.tap(findTestObject('Object Repository/Approve Task/tap_endDate'), 0)

Mobile.tap(findTestObject('Object Repository/Create Task/pilih_endDate',
	[('pilih_endDate'):endDate]), 0)

Mobile.tap(findTestObject('Object Repository/My Task/Tap_oke'), 0)

Mobile.tap(findTestObject('Object Repository/Approve Task/tap_startTime'), 0)

Mobile.delay (10) //lakukan pilih time manual karena object tidak ada

Mobile.tap(findTestObject('Object Repository/Approve Task/tap_okTime'), 10)

Mobile.tap(findTestObject('Object Repository/Approve Task/tap_endTime'), 0)

Mobile.delay (10) //lakukan pilih time manual karena object tidak ada

Mobile.tap(findTestObject('Object Repository/Approve Task/tap_okTime'), 10)

//Mobile.setText(findTestObject('Object Repository/Approve Task/tap_durasiWaktu'), inputTime,0)

//driver.pressKey(new KeyEvent(AndroidKey.BACK))

Mobile.tap(findTestObject('Object Repository/Approve Task/tap_penyetuju'), 0)

Mobile.tap(findTestObject('Object Repository/Approve Task/pilih_penyetuju',
	[('pilih_penyetuju'):penyetuju]), 0)

Mobile.tap(findTestObject('Object Repository/Approve Task/tap_submit'), 10)

Mobile.waitForElementPresent(findTestObject('Object Repository/Workspace/tap_close'), 10)

Mobile.tap(findTestObject('Object Repository/Workspace/tap_close'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Approve Task/tap_profile'), 10)

Mobile.tap(findTestObject('Object Repository/Approve Task/tap_profile'), 0)

device_Height = Mobile.getDeviceHeight()
device_Width = Mobile.getDeviceWidth()

int startX3 = device_Width / 2
int endX3 = startX3
int startY3 = device_Height * 0.30
int endY3 = device_Height * 0.70
 
'Swipe Vertical from top to bottom'
Mobile.swipe(startX3, endY3, endX3, startY3)

Mobile.tap(findTestObject('Object Repository/Approve Task/tap_logOut'), 10)

Mobile.tap(findTestObject('Object Repository/LOGIN/android.widget.EditText - Enter Username'), 0)

Mobile.setText(findTestObject('Object Repository/LOGIN/android.widget.EditText - Enter Username (1)'), usernameApprv, 0)

Mobile.tap(findTestObject('Object Repository/LOGIN/android.widget.EditText - Password'), 0)

Mobile.setText(findTestObject('Object Repository/LOGIN/android.widget.EditText - Password (1)'), passwordApprv, 0)

Mobile.tap(findTestObject('Object Repository/LOGIN/android.widget.Button'), 0)

Mobile.delay (5)

// Koodinat Edit Desc
int startX4 = 147
int startY4 = 1012
int endX4 = startX4 - 150 // Menggunakan width untuk menentukan akhir X
int endY4 = startY4  // Tetap sama dengan koordinat awal Y untuk swipe horizontal

// Melakukan swipe horizontal
Mobile.swipe(startX4, startY4, endX4, endY4)

Mobile.tap(findTestObject('Object Repository/Approve Workspace/tap_my_approval'), 0)

Mobile.tap(findTestObject('Object Repository/Approve Task/tap_tabTask'), 0)

Mobile.tap(findTestObject('Object Repository/Approve Task/tap_listTask',
	[('listTask'):listTask]), 0)

Mobile.tap(findTestObject('Object Repository/Approve Workspace/tap_approve'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Approve Workspace/tap_close'), 0)

Mobile.tap(findTestObject('Object Repository/Approve Workspace/tap_close'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/My Task/Klik_myTask'), 0)

Mobile.tap(findTestObject('Object Repository/My Task/Klik_myTask'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Approve Task/tap_listTask',
	[('listTask'):listTask]), 0)






