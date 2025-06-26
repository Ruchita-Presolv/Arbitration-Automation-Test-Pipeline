package org.stepdefinitions;

import org.applicationhooks.AppHooks;
import org.factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.pages.ArbitratorLogin;
import org.pages.UserLogin;

import io.cucumber.java.en.*;

public class UserLoginStepDef {
	private WebDriver driver;

	UserLogin user_obj= new UserLogin(DriverFactory.getDriver());
	ArbitratorLogin Arb_obj= new ArbitratorLogin(DriverFactory.getDriver());
	/*************************
	 * user login
	 * 
	 */	

	@Given("User is on user login page")
	public void user_is_on_user_login_page() {
		DriverFactory.getDriver().get(AppHooks.prop.getProperty("UrlUser")); 
	}


	@Then("User name and UserPassword field is displayed")
	public void user_name_and_user_password_field_is_displayed() throws InterruptedException {
		Arb_obj.userPassDisplay();
	}

	@When("user see the user name field then enter User name")
	public void user_see_the_user_name_field_then_enter_user_name() {
		Arb_obj.enterUName(AppHooks.prop.getProperty("UserCRName"));
	}
	@Then("user see the user password field then enter user password")
	public void user_see_the_user_password_field_then_enter_user_password() throws InterruptedException {
		Arb_obj.enterPass(AppHooks.prop.getProperty("PasswordCR"));
	}
	@Then("user verify the user dashboard page title as {string}")
	public void user_verify_the_user_dashboard_page_title_as(String string) throws InterruptedException {
		user_obj.userPageTitle(string);
	}
	@Then("user click on logout Btn")
	public void user_click_on_logout_btn() throws InterruptedException {
		user_obj.userLogoutbtn();
	}



}
