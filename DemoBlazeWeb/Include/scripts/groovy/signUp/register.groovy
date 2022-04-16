package signUp
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



class register {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User navigates to sign up page")
	def I_want_to_write_a_step_with_name(String name) {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://www.demoblaze.com/')
		WebUI.click(findTestObject('Object Repository/sign up/Page_STORE/a_Sign up'))
	}

	@When("User enters")
	def I_check_for_the_value_in_step(int value) {
		WebUI.setText(findTestObject('Object Repository/sign up/Page_STORE/input_Username_sign-username'), 'fatimah')
		WebUI.setEncryptedText(findTestObject('Object Repository/sign up/Page_STORE/input_Password_sign-password'), 'RAIVpflpDOg=')
	}
	
	@And("Click on sign up button")
	def ClickLogin() {
		WebUI.click(findTestObject('Object Repository/login-logout/Page_STORE/button_Log in'))
		
	}

	@Then("User is navigate to homepage")
	def I_verify_the_status_in_step(String status) {
		WebUI.takeScreenshot()
		WebUI.closeBrowser()
	}
}