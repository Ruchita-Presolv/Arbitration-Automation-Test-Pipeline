package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.ElementUtil;

public class UserLogin {
	private WebDriver  driver;

	public UserLogin(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);

	}

	/*************************
	 * user login
	 * 
	 */	



	@FindBy(xpath="//span[@class='lbl'][text()='Home']")
	private WebElement PageTitle;

	@FindBy(xpath="//a[@href='https://staging.presolv360.com/user/notification_center']")
	private WebElement UserDashboard;

	@FindBy(xpath="//button[@id='dd-user-menu']")
	private WebElement PresolvUserBtn ;

	@FindBy(css="input[id='exampleInputPassword1']")
	private WebElement Pass;

	@FindBy(css="input[id='check_privacypolicy']")
	private WebElement InstructionCheckField;

	@FindBy(css="button[class='btn btn-warning btn-lg btnmobile mt-2 dwidth'][type='submit']")
	private WebElement SubmitBtn;

	@FindBy(xpath="//button[@class='swal2-confirm swal2-styled']")
	private WebElement OkBtnSuccess;
	
	@FindBy(xpath="//button[@class='dropdown-toggle']")
	private WebElement ProfileBtn;

	@FindBy(xpath="(//a[@class='dropdown-item'])[3]")
	private WebElement UserLogout;

	public void enterPass(String pass) {
		Pass.sendKeys(pass);
		InstructionCheckField.click();
		SubmitBtn.click();
	}
	public void userPageTitle(String title) throws InterruptedException {
		Thread.sleep(2000);
		OkBtnSuccess.click();
		PresolvUserBtn.click();
		UserDashboard.click();
		if (PageTitle.getText().contains(title)) {
			System.out.println("User successfully logged on the platform");
		} else {
			System.out.println("User fails to login ");
		}

	}
	public void userLogoutbtn() throws InterruptedException {
		ProfileBtn.click();
		Thread.sleep(3000);
		UserLogout.click();
		//ElementUtil.eu.clickByJS(driver, UserLogout);
	}


}
