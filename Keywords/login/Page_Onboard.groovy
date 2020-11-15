package login

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testobject.ConditionType

import internal.GlobalVariable
import internal.GlobalVariable as GlobalVariable
public class Page_Onboard {

	//***********************This class consist of all the methods associated to Onboard Page*****************************************************************************

	private TestObject text_Lets_Get_Started= findTestObject('Object Repository/OnboardPage/text_Lets_Get_Started')


	//****************************************************************************************************************************************************


	//***********************In this method user verifies Let's Get Started text*****************************************************************************

	@Keyword
	def verifyLets_Get_Started_Text (){


		WebUI.waitForElementVisible(text_Lets_Get_Started, 10)

		WebUI.verifyElementText(text_Lets_Get_Started, "Let's Get Started!")
	}

	//****************************************************************************************************************************************************

}
