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

//add activity
def name = 'indra_adhiw'
def pass = 'jh@#$%HJG'
def namaWs = 'Test Automate Mobile Android 1'
def activity = 'Rekomendasi'
def tabActivity = 'Rekomendasi'
def NamaTask = 'Task Rekomendasi Mobile'
def DescTask = 'Lancar lacar yaa'
def typeTask = 'Komite'
def komite = 'Komite Inovasi Bisnis Digital'
def week = 'M5'
def month = 'Agustus'
def year = '2030'
def startDate = '13'
def endDate = '25'
def inputTime = '120'
def penyetuju = 'MUSTHOFA KAMAL'

Mobile.callTestCase(findTestCase('PAGE/Login'),
	[('username'):name,
		('password'):pass], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(15)

Mobile.callTestCase(findTestCase('PAGE/Approve Task'),
	[('list'):namaWs,
		('pilih_act'):activity,
		('tabActivity'):tabActivity,
		('NamaTask'):NamaTask,
		('DescTask'):DescTask,
		('task'):typeTask,
		('komite'):komite,
		('week'):week,
		('month'):month,
		('year'):year,
		('startDate'):startDate,
		('endDate'):endDate,
		('inputTime'):inputTime,
		('penyetuju'):penyetuju], FailureHandling.STOP_ON_FAILURE)