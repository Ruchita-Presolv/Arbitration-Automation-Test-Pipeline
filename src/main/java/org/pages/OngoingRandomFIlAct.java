package org.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.ElementUtil;

public class OngoingRandomFIlAct {
	private WebDriver driver;


	public OngoingRandomFIlAct(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this );
	}

	// Bulk close 
	
	@FindBy(css="input[id='for_random']")
	private WebElement RanFilBtn;

	@FindBy(css="textarea[class='select2-search__field'][type='search']")
	private WebElement RanInputField;

	@FindBy(css="ul[class='select2-results__options'] li:nth-child(1)")
	private WebElement FirstCase;

	@FindBy(css="ul[class='select2-results__options'] li:nth-child(50)")
	private WebElement No50Case;

	@FindBy(css="ul[class='select2-results__options'] li:nth-child(100)")
	private WebElement No100Case;

	@FindBy(css="button[class='btn btn-secondary py-2 px-3 dropdown-toggle']")
	private WebElement BulkActionBtn;


	@FindBy(css="button[id='blkarbclose']")
	private WebElement BulkClose;

	@FindBy(css="textarea[class='swal2-textarea']")
	private WebElement CloseReasonField;

	@FindBy(css="button[class='swal2-confirm swal2-styled']")
	private WebElement ApplyCloseBtn;

	@FindBy(css="i[class='fa fa-check']")
	private WebElement MassageDisplay ;

	@FindBy(css="a[class='btn btn-danger btn-lg mt-5']")
	private WebElement CloseBClose ;
	//a[class='btn btn-danger btn-lg mt-5']
	//a[class='btn btn-danger btn-lg']

	//	@FindBy(css="")
	//	private WebElement ;

	public void randomFilSelect() throws InterruptedException {
		ElementUtil.eu.scrollByJS(driver, RanFilBtn);
		RanFilBtn.click();	
		Thread.sleep(4000);
	}
	public void clickInputFieldRan() throws InterruptedException {
		RanInputField.click();
		ElementUtil.eu.scrollByJS(driver, RanFilBtn);
		Thread.sleep(3000);

	}
	public void sendCases() throws InterruptedException {
		//Thread.sleep(2000);
		String case1 = FirstCase.getText();
		ElementUtil.eu.waitForPageLoad(driver);
		String case50 = No50Case.getText();
		String case100= No100Case.getText();
		System.out.println("case ids getting close : "+case1 +","+case50+","+ case100);
		
		insertCaseId(case1, 3000);
		insertCaseId(case50, 3000);
		insertCaseId(case100, 3000);
	
	}
	public void insertCaseId(String caseNo,int sec) throws InterruptedException {
		Thread.sleep(sec);
		RanInputField.sendKeys(caseNo);
		Thread.sleep(sec);
		ElementUtil.eu.pressEnter(driver, 2);
		Thread.sleep(sec);
		
	}
	
	public void bulkCloseClick() {
		BulkActionBtn.click();
		BulkClose.click();
	}
	public void addReason(String reason) {
		CloseReasonField.sendKeys(reason);
		ApplyCloseBtn.click();
	}
	public void successStatus() {
		if(MassageDisplay.isDisplayed()) {
			System.out.println("Successfully completed the action taken by user ");
			CloseBClose.click();
		}else {
			System.out.println("Fails to completed the action taken by user ");
		}
	}
	
	// Bulk Withdraw 
	@FindBy(css="button[id='blkarbwdr']")
	private WebElement BulkWithdraw;

	public void bulkWithdraw() {
		BulkActionBtn.click();
		BulkWithdraw.click();	
	}
	
	// Download Award Sheet
	
	@FindBy(css="li[id^='select2-random-result-y']")
	private List<WebElement> CaseSel18Total;
	
	@FindBy(css="button[id='awrdsheet']")
	private WebElement DownloadAwardSheet;
	 
	public void noOfCases() throws InterruptedException {
		RanInputField.click();
		Thread.sleep(2000);
		 for (int i = 0; i < (CaseSel18Total.size()-60); i++) {
		        WebElement caseid = CaseSel18Total.get(i);
		        System.out.println(caseid.getText());
		        
		        caseid.click();
		        Thread.sleep(2000);
		        
		        ElementUtil.eu.pressEnter(driver, 2);
		    }
		
//		for(WebElement caseid:CaseSel18Total) {
//			System.out.println(caseid.getText());
//			caseid.click();
//			
//		Thread.sleep(2000);
//		ElementUtil.eu.pressEnter(driver, 2);
//		}
	}
	
	public void bulkAction() throws InterruptedException {
		//ElementUtil.eu.clickByOffset(driver, BulkActionBtn);
		ElementUtil.eu.waitForElementToBeClickable(driver, BulkActionBtn, 600);
		//BulkActionBtn.click();
		Thread.sleep(2000);
		
	}
	
	public void downloadAward() {
		if(DownloadAwardSheet.isEnabled()) {
			System.out.println("user successfully download Award sheet");
			
		}else {
			System.out.println("Fails to download Award sheet");
		}
	}
	
	// Download Documents
	
	@FindBy(css="button[id='download_Docs']")
	private WebElement DownloadDocumentsBtn;
	
	@FindBy(css="div[class='modal-footer']>button:nth-child(1)")
	private WebElement DownloadAllBtn;
	
	@FindBy(css="div[class='modal-footer']>button:nth-child(2)")
	private WebElement DownloadSelectedBtn;
	
	@FindBy(css="div[class='modal-footer']>button:nth-child(3)")
	private WebElement CloseBtn;
	
	@FindBy(css="form[id='download_Docs_form']>input")
	private List <WebElement> DocumentList;
	
	public void downloadDoc() {
		ElementUtil.eu.waitForElementToBeClickable(driver, DownloadDocumentsBtn, 2000);
		//DownloadDocuments.click();
		if(DownloadAllBtn.isEnabled()) {
			System.out.println("Successfully download all documents");
		}else {
			System.out.println("Fails to download All documents");
		}
	}
	
//	@FindBy(css="form[id='download_Docs_form']>input")
//	private WebElement DocumentList;
//	
	
	// Download Documents Selected 
	public void downloadSelectedDoc() {
		DownloadDocumentsBtn.click();
		for(WebElement noOfDoc :DocumentList) {
			if(noOfDoc.isEnabled()) {
				System.out.println(" user able to select multiple documents ");
				//System.out.println(DownloadSelectedBtn.isEnabled());
				//System.out.println(" Successfully download multiple documents ");
			}else {
				System.out.println(" user fails to select multiple documents ");
			}
			
		}
		System.out.println(DownloadSelectedBtn.isEnabled());
        System.out.println(" Successfully download multiple documents ");
	}
	
	// Download All Documents
	public void downloadAllDoc() {
		if(DownloadAllBtn.isEnabled()) {
			System.out.println("Able to download all documents ");
			System.out.println("close btn enable : "+CloseBtn.isEnabled());
		}else {
			System.out.println("Fails to download all documents ");
		}
	}
}
