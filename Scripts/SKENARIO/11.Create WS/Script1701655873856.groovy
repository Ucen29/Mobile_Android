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
def pass = '@$%^&**^123'
def cat_ws1 = 'RDG Mingguan (RDGM)'
def cat_ws2 = 'RDG Bulanan (RDGB)'
def cat_ws3 = 'Workspace Level Satker'
def type_ws = 'Custom Workspace (RDGM Topical Laporan/Persetujuan)'
def pimpinan = 'ENDANG TRIANTI'
def nama_ws = 'Test Automate Mobile'
def desc_ws = 'Semoga berjalan lancar'
def tgl_awal = '4'
def tgl_akhir = '31'

Mobile.callTestCase(findTestCase('PAGE/Login'), 
	[('username'):name,
		('password'):pass], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('PAGE/Create WS'), 
	[('pilih_cat'):cat_ws1,
		('pilih_type'):type_ws,
		('input_nama_ws'):nama_ws,
		('input_desc_ws'):desc_ws,
		('pilih_pimpinan'):pimpinan,
		('pilih_tgl_awal'):tgl_awal,
		('pilih_tgl_akhir'):tgl_akhir], FailureHandling.STOP_ON_FAILURE)

//Mobile.closeApplication()

