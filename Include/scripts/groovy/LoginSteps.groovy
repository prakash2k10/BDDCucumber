import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class LoginSteps 
{
	
	@Given("User navigates to login page")
	def navigatetologinpage()
	{
	  WebUI.openBrowser('')
	  WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')
	
	  println (" \n I am in Login Page")
	}
	@When("User enter (.*) and (.*)")
	def enterlogincredentials(String username ,String password)
	{
		WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_Username'))
		WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), username)		
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_txtPassword'), password)
		
		
		println (" \n I am giving credentials")
		println("Username"+username)
		println("Password"+password)
	} 
	@And("Click the login button")
	def clickloginbutton()
	{
		
		WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Password_Submit'))
		println (" \n I am clciking Login Button")
	}
		
	@And("Navigate to homepage")
	def navigatetohomepage()
	{
		WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Welcome Fortune'))
		println (" \n I am in Home Page")
	}
	@Then("User logout the application")
	def logout()
	{
		WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Logout'))
		WebUI.closeBrowser()
	}	
}

