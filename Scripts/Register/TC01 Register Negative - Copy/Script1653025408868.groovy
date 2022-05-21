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

for (i = 1; i <= 7; i++) {
    Mobile.startApplication('C:\\Users\\xyz\\Downloads\\alta-online-shop.apk', false)

    Mobile.tap(findTestObject('Register/android.widget.Button'), 0)

    Mobile.tap(findTestObject('Register/android.widget.Button register'), 0)

    Mobile.tap(findTestObject('Register/android.widget.EditText -  Fullname'), 0)

    Mobile.setText(findTestObject('Register/android.widget.EditText -  Fullname'), findTestData('Register').getValue(1, 
            i), 0)

    Mobile.tap(findTestObject('Register/android.widget.EditText -  Email'), 0)

    Mobile.setText(findTestObject('Register/android.widget.EditText -  Email'), findTestData('Register').getValue(2, i), 
        0)

    Mobile.tap(findTestObject('Register/android.widget.EditText - Password'), 0)

    Mobile.setText(findTestObject('Register/android.widget.EditText - Password'), findTestData('Register').getValue(3, i), 
        0)

    Mobile.tap(findTestObject('Register/android.widget.Button regist fix'), 0)

    Mobile.closeApplication()
}

