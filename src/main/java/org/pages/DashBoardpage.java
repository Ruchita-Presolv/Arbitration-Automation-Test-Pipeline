package org.pages;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.ElementUtil;






/**
 * @author HP01
 *
 */
public class DashBoardpage {
	
	private WebDriver driver;
//	AdminReviewBulkUp obj=new AdminReviewBulkUp(driver);
//	obj.uploadCases();

	// WebElement

	@FindBy(xpath="//span[text()='Resolve']")
	private WebElement ResolveBtn;

	@FindBy(xpath="//span[text()='Arbitration360']")
	private WebElement Arbitration360Btn;

	@FindBy(xpath="//span[text()='For admin review']")
	private WebElement ForadminreviewBtn;

	@FindBy(xpath="//span[@class='nav-link-in']")
	private WebElement pageName;

	@FindBy(xpath="//section[@class='action-btn btn-sucess']") // //b[text()='ACTION']
	private WebElement ActBtn;

	@FindBy(xpath="//input[@id='selectcnf'][@type='checkbox']") 
	private WebElement ChekBoxCon_Rejec;       ////input[@id='selectcnf']//input[@id='selectcnf']

	@FindBy(xpath="//button[@id='blkcnfbtn'][@class='btn btn-success blkbtn']")
	private WebElement ConfirmBtn;



	@FindBy(xpath="//button[@id='blkrejectbtn']")
	private WebElement RejectBtn;

	// no of cases per page and checkbox dependant on each other 
	@FindBy(xpath="//select[@name='adminreview_length']")
	private WebElement DropDCaseEntries;

	@FindBy(xpath="//input[@data-searchvalue='undefined']")
	private WebElement CheckedBox;


	@FindBy(xpath="//span[text()='Logout']")
	private WebElement Logoutbtn;

	@FindBy(xpath="//input [@id='swal-input1'][@type='date']")
	private WebElement  dateEntry;

	@FindBy(xpath="//button[text()='Confirm'][@class='swal2-confirm swal2-styled']")
	private WebElement FinalConfirmBtn;

	@FindBy(xpath="//a[text()='Close'][@class='btn btn-danger btn-lg']")
	private WebElement CloseBtn;

	@FindBy(xpath="//button[text()='OK'][@class='swal2-confirm swal2-styled']")
	private WebElement okNoCaseSel;


	// constructor 
	public DashBoardpage(WebDriver driver)	
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
		//PageFactory.initElements(driver,DashBoardpage.class);
	}


	// pageAction method

	public void dashBoardPage() {
		String expTitle= "Presolv360 Admin";
		String actTitle= driver.getPageSource();
		if(expTitle.contains(actTitle)) {
			System.out.println("Dashboard title is match");
		}else {
			System.out.println("Dashboard title is Not match");
		}
	}
	public void clickonResolv () {
		WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(5));
		wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[@class='lbl'][text()='Resolve']")))).click();
		//ResolveBtn.click();
	}
	public void clickOnArb() {
		Arbitration360Btn.click();
	}
	public void verifyPageTitle(String title) {
		String Exptitle=title;
		String Acttitle= driver.getTitle();
		if(Exptitle.equals(Acttitle)){
			System.out.println("title is matched ");

		}else {
			System.out.println("title is not matched ");
		}
	}

	public void actionClick() {
		ActBtn.click();
	}
	public void checkCheckBox() {
		
		
		ChekBoxCon_Rejec.click();
	}
	public void clickOnConf() {

		WebElement check = driver.findElement(By.xpath("//input[@class='blkcnfcs blkchk check_mark']"));
		//WebElement checkBox= driver.findElement(By.xpath("//input[@type='checkbox']"));
		//if(checkBox.isEnabled()&& checkBox.isSelected()) {

		if(check.isSelected()&& check.isEnabled() ) {
			ConfirmBtn.click();

		}else {
			System.out.println("No case available to confirm4");
		}
	}
	public void filterConfirm() {
		ConfirmBtn.click();
	}
	public void uncheckedChechBox() {
		ChekBoxCon_Rejec.click();
		ChekBoxCon_Rejec.clear();
	}


	public void logoutbtn() {
	 try {
		 ElementUtil.eu.scrollByJS(driver, Logoutbtn);
			Logoutbtn.click();
	} catch (Exception e) {
		System.out.println("Unable to logIn due to fail credentials");
	} 
	}

	public void clickOnForAddREview() {
		ForadminreviewBtn.click();
	}
	public void setDate() {
		dateEntry.sendKeys("02-05-2023");
	}
	public void confirmAndClose() {
		FinalConfirmBtn.click();
		//ElementUtil.eu.waitForElementToBeClickable(driver, CloseBtn, 10);
		CloseBtn.click();
		System.out.println("Cases Confirm Successfully");
	}

	/*
	 * *****************show no of cases per page method
	 *************/
	@FindBy(xpath="//Select[@class='form-control form-control-sm']")
	public WebElement ShowNoEntryPerP;

	public void showNoCasePerPage() {
		ElementUtil.eu.selectDropDownValue(driver, ShowNoEntryPerP, "25");
	}
	/*
	 * *****************Select Random no of cases per page method
	 *************/
	//	@FindBy(xpath="//input[@class='blkcnfcs blkchk check_mark']")
	//	private WebElement CheckBox;
	//	
	//	public void randomCaseSelCon() {
	//		ElementUtil.eu.pageRefresh(driver, 1);
	//		List<WebElement> ele= driver.findElements(By.xpath("//input[@class='blkcnfcs blkchk check_mark']"));
	//		for(WebElement caseid : ele) {
	//			String str=caseid.getText();
	//			System.out.println(str);
	//		}


	//		System.out.println("size="+ele.size());
	//		
	//		CheckedBox.isEnabled();
	//		//CheckedBox.click();
	//		
	//			if (ele.iterator() != null) {
	//				CheckedBox.click();}
	//}






	/*
	 * *****************Confirm by using From to Filter Except as blank 
	 **Locaters and Methods ***********/	
	@FindBy(xpath="//span[@id='select2-blkaction-container']")
	private WebElement ClickActF;

	@FindBy(xpath="//li[text()='Confirm']")
	private WebElement SelConf;

	@FindBy(xpath="//span[@title='From']")
	private WebElement FormClick;

	@FindBy(xpath="//li[@class='select2-results__option select2-results__option--selectable'][@role='option']")
	private WebElement SelAnyCase_From;

	@FindBy(xpath="//span[@title='To']")
	private WebElement ToClick;

	@FindBy(xpath="//li[@class='select2-results__option select2-results__option--selectable'][@role='option'][7]")
	private WebElement SelCase_To;

	@FindBy(xpath="//textarea[@class='select2-search__field']")
	private WebElement ExceptClick;
// //textarea[@class='select2-search__field'][@type='search']
	@FindBy(xpath="//li[@class='select2-results__option select2-results__option--selectable'][@role='option'][2]")
	private WebElement SelCase_Except;
	//*******************************
	@FindBy(xpath="//span[@title='From']")
	private WebElement seleForm;
	@FindBy(xpath="//button[text()='Confirm']")
	private WebElement ConfirmFilter;

	@FindBy(xpath="//input[@id='swal-input1'][@placeholder='Enter request letter date']")
	private WebElement selDateAs;

	//	@FindBy(xpath="")
	//   private WebElement 	
	public void confirmDropAct() {
		ElementUtil.eu.pageRefresh(driver, 1);
		ClickActF.click();
		SelConf.click();
	}
	public void selFromToCase_ExpBlank() throws InterruptedException {
		seleForm.click();
		Thread.sleep(2000);
		WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(5));
		wt.until(ExpectedConditions.elementToBeClickable(SelAnyCase_From)).click();
		ToClick.click();
		wt.until(ExpectedConditions.elementToBeClickable(SelCase_To)).click();

		Thread.sleep(2000);
		wt.until(ExpectedConditions.elementToBeClickable(ConfirmFilter)).click();
	}

	/*
	 * *****************Confirm by using From to Filter 
	 **Locaters and Methods *****Add cases to Except******/
	
	
	
	
	/*
	 * *****************Approve by using From to Filter Except as blank 
	 **Locaters and Methods ***********/
	@FindBy(xpath="//li[text()='Approve']")
	private WebElement SelApprove;
	@FindBy(xpath="//button[text()='Approve']")
	private WebElement ApproveFilter;

	public void approveDropAct() {
		ElementUtil.eu.pageRefresh(driver, 1);
		ClickActF.click();
		SelApprove.click();
	}

	public void SelAppCasesFromToFil() throws InterruptedException {
		seleForm.click();
		Thread.sleep(2000);
		WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(300));
		wt.until(ExpectedConditions.elementToBeClickable(SelAnyCase_From)).click();
		ToClick.click();
		wt.until(ExpectedConditions.elementToBeClickable(SelCase_To)).click();



	}
	public void fArbitrator() {
		WebElement dd1 = driver.findElement(By.xpath("//select[@class='form-control blkarbitratorselect']"));
		Select sel = new Select(dd1);
		sel.selectByVisibleText("Test Arbitrator");
		//		ElementUtil.eu.waitForElementToBeClickable(driver, SelArbNameDrop, 10);
		//		ElementUtil.eu.selectDropDown(driver, SelArbNameDrop, "Test Arbitrator");

	}
	public void FilApproveClick() throws InterruptedException {
		Thread.sleep(3000);
		ElementUtil.eu.waitForElementToBeClickable(driver, ApproveFilter, 100);  
		//wt.until(ExpectedConditions.elementToBeClickable(ApproveFilter)).click();
	}
	public void closeFilter() {
		ElementUtil.eu.waitForVisibilityByWebElement(driver, 160, closeclick);
		System.out.println("Cases Approved SuccessFully");
	}

	public void addCasesExcept() {
		ExceptClick.click();
		ElementUtil.eu.waitForElementToBeClickable(driver, SelCase_Except,30);
	}

	/*
	 * *****************Download by using From to Filter Except as blank 
	 **Locaters and Methods ***********/

	@FindBy(xpath="//li[text()='Download']")
	private WebElement SelDownload;
	@FindBy(xpath="//button[text()='Download']")
	private WebElement DownloadFilter;

	public void downloadDropAct() {
		ElementUtil.eu.pageRefresh(driver, 1);
		ClickActF.click();
		SelDownload.click();
	}
	public void downloadBtn() throws InterruptedException {
		seleForm.click();
		Thread.sleep(2000);
		ElementUtil.eu.waitForElementToBeClickable(driver, SelAnyCase_From, 10);
		//WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(10));
		//wt.until(ExpectedConditions.elementToBeClickable(SelAnyCase_From)).click();
		ToClick.click();
		ElementUtil.eu.waitForElementToBeClickable(driver, SelCase_To, 10);
		//wt.until(ExpectedConditions.elementToBeClickable(SelCase_To)).click();
		Thread.sleep(2000);
		DownloadFilter.click();
	}



	/*
	 * *******the locaters and methods used to perform Approve action page method
	 ********/

	@FindBy(xpath="//input[@id='selectapr']")
	private WebElement checkAllToApprove;

	@FindBy(xpath="//select[@class='form-control blkarbitratorselect']")
	private WebElement SelArbNameDrop;

	@FindBy(xpath="//button[@class='btn btn-primary blkbtn'][@id='blkaprbtn']")
	private WebElement ApproveBtnclick;

	@FindBy(xpath="//button[@class='swal2-confirm swal2-styled']")
	private WebElement PreviewClick;

	@FindBy(xpath="//button[@id='sendApplication']")
	private WebElement  ApproveClick;

	@FindBy(xpath="//a[text()='Close'][@class='btn btn-danger btn-lg']")//a[text()='Close'][@class='btn btn-danger btn-lg']
	private WebElement closeclick;//a[text()='Close']

	public void ApproveSelAll() {
		checkAllToApprove.click();
	}
	public void ArbriDropSel() {
		WebElement dd1 = driver.findElement(By.xpath("//select[@class='form-control blkarbitratorselect'][@name='arbitrator']"));
		Select sel = new Select(dd1);
		sel.selectByVisibleText("Arbitrator One ");

	}
                          
	public void ApproveClick()  {

		ApproveBtnclick.click();

	}
	public void preview() {
		PreviewClick.click();
	}
	public void FinalApprove() {
		ElementUtil.eu.scrollByPageDown(driver, 10);
		ApproveClick.click();
	}
	public void closeApp() throws InterruptedException {
		//ElementUtil.eu.scrollByJS(driver, closeclick);
		//ElementUtil.eu.waitForVisibilityByWebElement(driver, 20, closeclick);
		//Thread.sleep(2000);
		ElementUtil.eu.waitForElementToBeClickable(driver, closeclick, 100);
		//closeclick.click();
	}
	public void withoutArbSelclick() {
		try {
			ApproveBtnclick.click();
			if(driver.findElement(By.xpath("//h2[text()='Select Arbitrators']")).isDisplayed()) {
				System.out.println("Arbitrator not selected ");

			}
		}finally {
			System.out.println("please select Arbitrator name from dropdown ");
			driver.close();
		}
	}


	/*
	 *  *******locaters for Download Action
	 ***************/
	@FindBy(xpath="//input[@id='selectdownload']")
	private WebElement   DownloadSElAll;

	@FindBy(xpath="//button[@id='blkdownloadbtn']")
	private WebElement ClickDownloadBtn;

	/*
	 * @FindBy(xpath="") private WebElement;
	 */
	public void selAllDownload() {
		DownloadSElAll.click();
	}
	public void clickOnDownload() {
		ElementUtil.eu.waitForElementToBeClickable(driver, ClickDownloadBtn, 5);
		//wt.until(ExpectedConditions.elementToBeClickable(ClickDownloadBtn)).click();
		//ClickDownloadBtn.click();
	}
	public void GenericCall() throws InterruptedException {//ClickDownloadBtn
		filterGenericIncludeExcept(driver, SelDownload, 10, DownloadFilter);

	}


	/********
	 * Methods to perform RejectAction
	 *******/
	@FindBy(xpath="//textarea[@class='swal2-textarea']")
	private WebElement  ReasonToReject;

	@FindBy(xpath="//button[@class='swal2-confirm swal2-styled']")
	private WebElement ApplyBtn;

	@FindBy(xpath="//a[@class='btn btn-danger btn-lg']")
	private WebElement RejectClose;

	public void clickOnReject() {
		ElementUtil.eu.waitForVisibilityByWebElement(driver, 200, RejectBtn);
		RejectBtn.click();
	}
	public void inputReason() {
		ReasonToReject.sendKeys("Case Doc N0T Sumitted");
	}
	public void clickOnApply() {
		ApplyBtn.click();
		ElementUtil.eu.waitForElementToBeClickable(driver, RejectClose, 80);
		//RejectClose.click();
		ElementUtil.eu.clickByJS(driver, Logoutbtn);
	}
	
	
	
	
	
	//@RejectAll
	
	@FindBy(xpath="//select[@class='form-control form-control-sm']//option[7]")
	private WebElement NoOFCases1000;
	
	public void rejectAll() throws InterruptedException {
		NoOFCases1000.click();
		//ElementUtil.eu.selectDropDownValue(driver, NoOFCases1000, "1000");
		Thread.sleep(2000);
		checkCheckBox();
		
	}
	
	
	
	/*****************%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	 * @AddCaseCsvToReject
	 */
	@FindBy(xpath="//input[@id='fileInput'][@name='csv']")
	private WebElement ClickCsvFile;
	public void addCsvFile() {
		String path= System.getProperty("user.dir");

		ClickCsvFile.sendKeys(path+"\\documents\\NOA_10csv_testing_U.csv");
		
	}

	

	
//	@FindBy(css="")
//	private WebElement 
//	
//	@FindBy(css="")
//	private WebElement 
//	@FindBy(css="")
//	private WebElement 



	//----------FILTER with cases in Except----------
	public void filterGenericIncludeExcept(WebDriver driver,WebElement SelAct, int timeInSec,WebElement SubConDown) throws InterruptedException {
		//+++++Select Action 
		ClickActF.click();
		SelAct.click();

		//******************Apply filter
		//@from
		seleForm.click();
		Thread.sleep(2000);
		ElementUtil.eu.waitForElementToBeClickable(driver, SelAnyCase_From, timeInSec);
		//@to
		ToClick.click();
		ElementUtil.eu.waitForElementToBeClickable(driver, SelCase_To, timeInSec);

		//@except
		Thread.sleep(2000);
		//WebElement ele=driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--multiple'][@role='combobox'][@tabindex='-1']"));
		ElementUtil.eu.waitForElementToBeClickable(driver, ExceptClick, timeInSec);

		//ExceptClick.click();
		ElementUtil.eu.waitForElementToBeClickable(driver, SelCase_Except, timeInSec);

		Thread.sleep(2000);
		SubConDown.click();
	}
	public void addExceptConfirm() throws InterruptedException {
		filterGenericIncludeExcept(driver, SelConf, 20, ConfirmFilter);
	}
	public void addExceptApprove() throws InterruptedException {

		//@except
		Thread.sleep(2000);
		//WebElement ele=driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--multiple'][@role='combobox'][@tabindex='-1']"));
		ElementUtil.eu.waitForElementToBeClickable(driver, ExceptClick, 20);

		//ExceptClick.click();
		ElementUtil.eu.waitForElementToBeClickable(driver, SelCase_Except, 60);
	}
	
	// method for uploading Case.Csv
	public void casecsvUpload() {
		
	}
	
	// End to End Actions 

	
	public void newWindow(String url ) {
		 ChromeOptions options = new ChromeOptions();
	        options.addArguments("--incognito");

	        WebDriver driver = new ChromeDriver(options);
	        driver.get(url);

	        // Keep the browser open for a while to observe the result
	        try {
	            Thread.sleep(30000); // Keep the browser open for 10 seconds
	            arbaccept("arbone", "User@1234");
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        driver.quit();
	    }
	
	@FindBy(css="input[id='email1']") 
	private WebElement UName;

	@FindBy(css="input[id='exampleInputPassword1']")
	private WebElement Pass;

	@FindBy(css="input[id='check_privacypolicy']")
	private WebElement InstructionCheckField;

	@FindBy(xpath="//button[@id='presolv_visit_cookieset']")
	private WebElement AcceptCookiesBtn;
	
	@FindBy(css="button[class='btn btn-warning btn-lg btnmobile mt-2 dwidth'][type='submit']")
	private WebElement SubmitBtn;
	
	public void arbaccept(String uname, String pass) throws InterruptedException {
		Thread.sleep(2000);
		UName.sendKeys(uname);
		Pass.sendKeys(pass);
		InstructionCheckField.click();
		AcceptCookiesBtn.click();
		
		SubmitBtn.click();
	}
	
	
	
}
