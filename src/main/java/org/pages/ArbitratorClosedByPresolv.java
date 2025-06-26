package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.ElementUtil;

public class ArbitratorClosedByPresolv {
	private WebDriver driver;


	public ArbitratorClosedByPresolv(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);


	}


	// Case Details Page 

	@FindBy(xpath="//span[text()='Closed By Presolv360']")
	private WebElement ClosedByPBtn;

	@FindBy(xpath="(//a[contains(@href,'/arbitrator/casedetails?')])[2]")
	private WebElement CaseId;
	
	//a[contains(@href,'/arbitrator/casedetails?')]
	@FindBy(xpath="//h5[contains(text(),'Case Details:')]  ")
	private WebElement CaseDP;




	public void closedByP() {
		ClosedByPBtn.click();

	}

	public void caseIdP() {
		if (CaseId.isDisplayed()) {
			System.out.println("successfully loaded the case table page ");
			CaseId.click();

			ElementUtil.eu.switchToNewSingleWindow(driver);


		} else {
			System.out.println("Failse to load the case table page ");
		}
	}

	public void caseDetailp() throws InterruptedException {
		Thread.sleep(2000);

		if (CaseDP.isDisplayed()) {
			System.out.println("Successfully loaded the case details page");
		} else {
			System.out.println("Fails to the case details page");
		}
	}


	// View Disclosures2

	@FindBy(xpath="//button[@id='dropdownMenuButton']")
	private WebElement ActionBtn ;

	@FindBy(xpath="//a[contains(@href,'disclosure/view?id')]")
	private WebElement ViewDisclosure2Btn ;


	@FindBy(xpath="//h4[text()='Arbitrator’s Consent and Disclosures by Arbitrator One']")
	private WebElement ViewDisclosure2Doc;

	@FindBy(xpath="//a[text()='Back']")
	private WebElement BackBtn;

	public void actionBtn() throws InterruptedException {
		Thread.sleep(2000);
		ActionBtn.click();
	}

	public void viewDisclosures2Btn() throws InterruptedException {
		ViewDisclosure2Btn.click();
		ElementUtil.eu.switchToNewSingleWindow(driver);
		Thread.sleep(2000);
		if (ViewDisclosure2Doc.isDisplayed()) {
			System.out.println("user able to see the disclosure");
			ElementUtil.eu.scrollByJS(driver, BackBtn);
			Thread.sleep(2000);
			BackBtn.click();

			if (ClosedByPBtn.isDisplayed()) {
				System.out.println("Successfully redirect on closed by presolv page");
			} else {
				System.out.println("fails redirect on closed by presolv page");
			}

		} else {
			System.out.println("fails to see the disclosure");
		}

	}


	//Upload Directions

	@FindBy(xpath="//a[contains(@href,'upload/document?id=')]")
	private WebElement UploadDirectionBtn;

	@FindBy(xpath="//h4[contains(text(),'Upload Directions Document for Case ID: ')]")
	private WebElement UploadPopUp;

	@FindBy(xpath="//input[@id='docu']")
	private WebElement UploadFile;

	@FindBy(xpath="//button[text()='Submit']")
	private WebElement SubmitBtnDir;

	public void uploadDirection() throws InterruptedException {
		UploadDirectionBtn.click();
		ElementUtil.eu.switchToNewSingleWindow(driver);
		Thread.sleep(2000);
		if (UploadPopUp.isDisplayed()) {
			UploadFile.sendKeys(System.getProperty("user.dir")+"\\documents\\Important one.pdf");
			SubmitBtnDir.click();
			System.out.println("Successfully upload the direction");
		} else {
			System.out.println("Fails to upload the direction ");
		}
	}


	// Upload Award 


	@FindBy(xpath="//button[@class='btn btn-primary' and text()='Upload Award']")
	private WebElement UploadAward;


	@FindBy(xpath="//h4[contains(text(),'Upload Award for Case ID: ')] ")
	private WebElement PTitle ;

	@FindBy(xpath="//a[@href='#' and text()='No']")
	private WebElement NoSignatureBtn ;

	@FindBy(xpath="//input[@id='award']")
	private WebElement UploadFileA;


	@FindBy(xpath="//button[@id='uploadaward']")
	private WebElement SubmitAwardBtn ;

	@FindBy(xpath="//h2[@id='swal2-title']")
	private WebElement SuccessMassDis;

	@FindBy(xpath="//button[@class='swal2-confirm swal2-styled']")
	private WebElement FInalOkBtn ;

	public void uploadAwardBtn() throws InterruptedException {
		Thread.sleep(2000);
		UploadAward.click();
		ElementUtil.eu.switchToNewSingleWindow(driver);
		Thread.sleep(2000);

	}
	public void uploadAward() {
		if (PTitle.isDisplayed()) {
			System.out.println("File Uploade page loaded Successfully");
			try {
				NoSignatureBtn.click();
				UploadFileA.sendKeys(System.getProperty("user.dir")+"//documents//AdditionalDocument_A000412.pdf");
				SubmitAwardBtn.click();
				System.out.println("file added successfully");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Fail to load file upload page ");
		}

	}

	public void successMassUpload() {
		if (SuccessMassDis.isDisplayed()) {

			FInalOkBtn.click();
			System.out.println("successfully uploaded the award");
		} else {
			System.out.println("Fails to uploade Award");
		}
	}


	//private comment

	@FindBy(xpath="//button[text()='Private']")
	private WebElement PrivateBtn ;

	@FindBy(xpath="//input[@id='arbcomm']")
	private WebElement PrivateComment ;

	@FindBy(xpath="//button[text()='save']")
	private WebElement SaveBtn ;

	@FindBy(xpath="//h2[contains(text(),'Comment')]")
	private WebElement CommentSavedDis ;


	@FindBy(xpath="//button[text()='OK']")
	private WebElement CommentSavedOkBtn ;

	public void privateComment(String comment) {
		PrivateBtn.click();
		PrivateComment.sendKeys(comment);
		SaveBtn.click();

	}

	public void commentSaved() {
		if (CommentSavedDis.isDisplayed()) {
			CommentSavedOkBtn.click();
			System.out.println("Successfully update the comment");

		} else {
			System.out.println("Fails to add the comment");
		}
	}


	//Shared
	@FindBy(xpath="//button[text()='Shared']")
	private WebElement SharedBtn ;

	@FindBy(xpath="//button[text()='send']")
	private WebElement SendBtn ;

	//	@FindBy(xpath="")
	//	private WebElement SendOkBtn ;
	//	
	public void sharedComment(String comment) {
		SharedBtn.click();
		PrivateComment.sendKeys(comment);
		SendBtn.click();

	}

	public void sharedcommentSaved() {
		if (CommentSavedDis.isDisplayed()) {
			CommentSavedOkBtn.click();
			System.out.println("Successfully update the comment");

		} else {
			System.out.println("Fails to add the comment");
		}
	}

	// Important resources 
	@FindBy(xpath="//span[text()='Important Resources']")
	private WebElement ImportantResourcesBtn ;

	@FindBy(xpath="//a[@class='navbar-brand']")
	private WebElement PageLogo ;

	public void importantResources() throws InterruptedException {
		ImportantResourcesBtn.click();
		ElementUtil.eu.switchToNewSingleWindow(driver);
		Thread.sleep(2000);

	}
	public void resourcesPage() {
		if (PageLogo.isDisplayed()) {
			System.out.println("Resources page loaded successfully");
		} else {
			System.out.println("Fails to load resources page ");
		}
	}

	// Profile form 

	@FindBy(xpath="//span[text()='Profile']")
	private WebElement ProfileBtn ;

	@FindBy(xpath="//a[@href='#tabs-4-tab-1']")
	private WebElement SettingBtn ;

	@FindBy(xpath="//label[@class='form-label semibold']")
	private WebElement FirstName ;

	@FindBy(xpath="//a[@href='#tabs-4-tab-2']")
	private WebElement PasswordBtn ;

	@FindBy(xpath="//label[@class='form-label']")
	private WebElement OldPassword ;

	public void profileBtn() {
		ProfileBtn.click();

	}
	public void profileForm() throws InterruptedException {
		SettingBtn.click();
		if (FirstName.isDisplayed()) {
			System.out.println("user able to see the profile form");
			PasswordBtn.click();
			Thread.sleep(2000);
			if (OldPassword.isDisplayed()) {
				System.out.println("user able to see password form");
			} else {
				System.out.println("Fails to see the password form");
			}
		}else {
			System.out.println("Fails to see the profile form");
		}
		//Thread.sleep(2000);
	}

}
