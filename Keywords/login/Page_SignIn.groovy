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
public class Page_Login {

	//***********************This class consist of all the methods associated to Login Page*****************************************************************************

	private TestObject textbox_Username= findTestObject('Object Repository/LoginPage/textbox_Username')


	private TestObject textbox_Password= findTestObject('Object Repository/LoginPage/textbox_Password')


	private TestObject button_Next= findTestObject('Object Repository/LoginPage/button_Next')


	private TestObject link_Forgot_Your_Password= findTestObject('Object Repository/LoginPage/link_Forgot_Your_Password')

	private TestObject link_Create_An_Account= findTestObject('Object Repository/LoginPage/link_Create_An_Account')

	private TestObject link_Contact_Us= findTestObject('Object Repository/LoginPage/link_Contact_Us')

	Date today = new Date()
	String todaysDate = today.format('ddMMyyyyHH:mm')

	//****************************************************************************************************************************************************


	@Keyword
	def openCombyneLoginPage(String stg_URL)

	{
		WebUI.openBrowser('')

		WebUI.maximizeWindow()

		WebUI.navigateToUrl(stg_URL)

	}
	//***********************In this method user perform login functionality*****************************************************************************

	@Keyword
	def login (String UserName, String Password){




		WebUI.comment('Entering Username: ' + UserName)

		enterUserName(UserName)

		WebUI.comment('Entering Password: ' + Password)

		enterPassword(Password)

		WebUI.takeScreenshot(System.getProperty('user.dir')+'/Screenshots/LoginPage/LoginPage' + todaysDate + '.jpg')

		System.out.println(System.getProperty('user.dir')+'/Screenshots/LoginPage/LoginPage' + todaysDate )

		WebUI.comment('Clicking on the Sign in button')

		clickOnNextButton()
	}

	//****************************************************************************************************************************************************



	//***********************In this method user enters Username*****************************************************************************

	def enterUserName (String UserName){



		WebUI.waitForElementVisible(textbox_Username, 30)

		WebUI.setText(textbox_Username, UserName)
	}

	//****************************************************************************************************************************************************


	//***********************In this method user enters Password*****************************************************************************

	def enterPassword (String Password){


		WebUI.waitForElementVisible(textbox_Password, 10)

		WebUI.setText(textbox_Password, Password)
	}
	//****************************************************************************************************************************************************


	//***********************In this method user click on Next Button*****************************************************************************
	@Keyword
	def clickOnNextButton (){


		WebUI.waitForElementVisible(button_Next, 10)

		WebUI.click(button_Next)
	}

	//****************************************************************************************************************************************************


	//***********************In this method user click on Forgot Your Password Link*****************************************************************************

	@Keyword
	def clickOnForgotYourPasswordLink(){


		WebUI.comment('Click on Forgot Your Password Link')

		WebUI.waitForElementVisible(link_Forgot_Your_Password, 10)

		WebUI.click(link_Forgot_Your_Password)
	}


	//****************************************************************************************************************************************************


	//***********************In this method user click on Create An Account  Link*****************************************************************************

	@Keyword
	def clickOnCreateAnAccountLink (){


		WebUI.waitForElementVisible(link_Create_An_Account, 10)

		WebUI.click(link_Create_An_Account)
	}

	//****************************************************************************************************************************************************

	//***********************In this method user click on Contact Us Link*****************************************************************************

	@Keyword
	def clickOnContactUsLink (){


		WebUI.waitForElementVisible(link_Contact_Us, 10)

		String url = WebUI.getAttribute(link_Contact_Us, "href");


		WebUI.verifyMatch(url, "mailto:help@combyne.ag",true)

	}

	//****************************************************************************************************************************************************

}
