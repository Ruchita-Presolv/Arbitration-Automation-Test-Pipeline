package org.stepdefinitions;

import org.applicationhooks.AppHooks;
import org.factory.DriverFactory;
import org.junit.Assert;
import org.pages.LoginPage;
import org.testng.Reporter;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
 

	private  LoginPage lp_obj= new LoginPage(DriverFactory.getDriver());

	@Given("User is on login page")
	public void user_is_on_login_page(){
		DriverFactory.getDriver().get(AppHooks.prop.getProperty("Url")); 
		 //lp_obj=new LoginPage(DriverFactory.getDriver());
	}

	@Then("Username field is displayed")
	public void username_field_is_displayed() {
		Assert.assertTrue(lp_obj.isUseNameFieldDisplayed());
		Reporter.log("username field is displayed"); 
	}

	@Then("Password field is displayed") 
	public void password_field_is_displayed() {
		Assert.assertTrue(lp_obj.isPasswordFieldDisplayed());
		Reporter.log(" password field is displayed"); 
	}

	

	@When("User enters username")
	public void user_enters_username() {
		lp_obj.enterUserName(AppHooks.prop.getProperty("UserName"));
	}

	@When("User enters password")
	public void user_enters_password() {
		lp_obj.enterPassword(AppHooks.prop.getProperty("Password")); 
	}

	@When("Click on login button")
	public void click_on_login_button() {
		lp_obj.clickLoginButton(); 
	}



	@Then("Dashboard URL should be displayed as {string}")
	public void dashboard_url_should_be_displayed_as(String string) {
		Assert.assertTrue(lp_obj.isLoginFieldDisplayed(string));
	}

}






