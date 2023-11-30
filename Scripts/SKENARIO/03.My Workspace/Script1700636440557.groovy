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

def name = 'indra_adhiw'
def pass = '123'
def workspace = 'RDG Bulanan November 2028'
def activity = 'Asesmen'
def task ='Pembahasan terkait asesmen dari sektor ekonomi-moneter'
def detail ='See Detail '

Mobile.callTestCase(findTestCase('PAGE/Login'), 
	[('username'):name,
		('password'):pass], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('PAGE/My Workspace'), 
	[('namaWS'):workspace,
		('jenisActivity'):activity,
		('namaTask'):task], FailureHandling.STOP_ON_FAILURE)

