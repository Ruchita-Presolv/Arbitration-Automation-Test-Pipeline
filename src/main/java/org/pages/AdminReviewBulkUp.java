package org.pages;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.ElementUtil;

public class AdminReviewBulkUp {
	private WebDriver driver;
	// Web Element



	/***************
	 * Upload Csv ----- --Bulk upload
	 ***************/
	@FindBy(xpath="//button[@class='btn btn-secondary py-2 px-3 dropdown-toggle']")
	private WebElement BulkUpbtn;

	@FindBy(xpath="//button[@class='dropdown-item'][@data-target='#myModalbupldadmin']")
	private WebElement CaseCsvbtn;

	@FindBy(xpath="//input[@class='form-control'][@name='batch_name']")
	private  WebElement BatchName;

	@FindBy(xpath="//span[@class='select2-selection__rendered'][text()='--Select--']")
	private WebElement SelectClick;

	@FindBy(xpath="//li[contains(@class,'select2-results__option select2-results__option--selectable')][4]")
	private WebElement SelectClamaint;

	@FindBy(xpath="//input[@id='fileInput']")
	private WebElement ClickCsvFile;

	@FindBy(xpath="//input[@type='Submit'][@class='btn btn-primary blkupdbtnsb submitBtn p-2']")
	private WebElement  SubmitBtn;

	@FindBy(xpath="//button[text()='Confirm'][@class='swal2-confirm swal2-styled']")
	private WebElement ConfirmClick;

	@FindBy(xpath="//a[text()='Close']")
	private WebElement CloseClick;


	public AdminReviewBulkUp (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	// page action method 
	public void clickBulk() {
		BulkUpbtn.click();
	}
	public void selectCsv() {
		CaseCsvbtn.click();
	}
	public void batchName() {
		String batchName=randomName();
		BatchName.sendKeys(batchName);
	}
	public void selClaimant() {
		SelectClick.click();

		ElementUtil.eu.waitForElementToBeClickable(driver, SelectClamaint, 10);

	}
	public void addCsvFile() {
		String path= System.getProperty("user.dir");
		try {
			ClickCsvFile.sendKeys(path+"\\documents\\NOA_100csv_testing_U.csv");
		}catch(InvalidArgumentException e) {
			
			e.printStackTrace();
			
		}
		}
	public void submitAndClose() {
		SubmitBtn.click();	
	}
	public void confirmCsvClick() throws InterruptedException {
		ConfirmClick.click();

	}
	public void closeClickCsv() throws InterruptedException {
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("//div[@id='mess']")).isDisplayed()) {
			ElementUtil.eu.scrollByJS(driver, CloseClick);
			ElementUtil.eu.waitForElementToBeClickable(driver, CloseClick, 140);
			System.out.println("Cases uploaded successfully on the platform");
		}
	}

	public static  String randomName() {
		String[] firstName = {"Ajay", "Rohit","JAY","Vinay","Rakesh","Arun","Rajesh","Punit","Bali","Krishna","Akshay"};
		String[] lastName ={"Devid","Musk","Pitter","Kumar","Roy", "Ambani","Dua","Bolbachhan","Dikshit"};
		Integer[] num= {34,54,1,3,4,5,6,0,8,7,6,44,67,88,87,44,33,77,55,22,77,66,55,355,353,56,119,99,980,87,876};
		Random random = new Random();
		//System.out.println(firstName[random.nextInt(firstName.length)]+" "+lastName[random.nextInt(lastName.length)]);

		String str =(firstName[random.nextInt(firstName.length)]+"_"+lastName[random.nextInt(lastName.length)]+"_"+num[random.nextInt(num.length)]);
		for(int i=1; i<=firstName.length; i++)
		{
			// System.out.println("Name:"+str);

		} //System.out.println("Name:"+str);
		return str;        
		//System.out.println(str);
	}
	public void uploadCases() {
		BulkUpbtn.click();
		CaseCsvbtn.click();
		String batchName=randomName();
		BatchName.sendKeys(batchName);
		SelectClick.click();
		ElementUtil.eu.waitForElementToBeClickable(driver, SelectClamaint, 10);
		ClickCsvFile.sendKeys("C:\\Users\\HP01\\OneDrive\\Desktop\\Testing doc\\NOA_50csv_testing_U.csv");
		SubmitBtn.click();	
		ConfirmClick.click();
		ElementUtil.eu.scrollByJS(driver, CloseClick);
		ElementUtil.eu.waitForElementToBeClickable(driver, CloseClick, 40);

	}
	/***************
	 * Interim Order ----- --Bulk upload
	 ***************/

	@FindBy(xpath="//div[button[@class='dropdown-item']]/button[3]")
	private WebElement InterimOrdBtn;

	@FindBy(css="input[id='FileInput']")
	private WebElement UploadInterimZip;

	@FindBy(css="button[id='UpDocsSubmit']")
	private WebElement InterimUpload;

	@FindBy(css="a[class='btn btn-danger btn-lg']")
	private WebElement InterimClose;

	public void interimSel() {

		ElementUtil.eu.waitForElementToBeClickable(driver, InterimOrdBtn, 10);
		//InterimOrdBtn.click();
	}
	public void selectIntFile() {
		String path= System.getProperty("user.dir");
		UploadInterimZip.sendKeys(path+"\\documents\\Interimorder.zip");
		//robotClass(driver, UploadInterimZip, "\\documents\\Interimorder.zip");

	}

	public void uploadInt() {
		ElementUtil.eu.waitForElementToBeClickable(driver, InterimUpload, 30);
		//InterimUpload.click();
	}
	public void interimClose() {
		InterimClose.click();
	}

	/***************
	 * .ZIP SOC ----- --Bulk upload
	 ***************/

	@FindBy(xpath="//div[button[@class='dropdown-item']]/button[2]")
	private WebElement zipSocSel;

	@FindBy(css="input[id='socFileInput']")
	private WebElement ClaimInputFile;

	@FindBy(css="input[id='supportingFileInput']")
	private WebElement SupportInputFile;

	@FindBy(css="input[value='Upload'][class='btn btn-primary py-2 socZIPSubmit']")
	private WebElement UploadSocBtn;

	@FindBy(css="button[class='swal2-confirm swal2-styled']")
	private WebElement  SocConfirm;

	@FindBy(css="a[class='btn btn-danger btn-lg']")
	private WebElement SocClose;

	public void zipSocAct() {

		ElementUtil.eu.waitForElementToBeClickable(driver, zipSocSel, 20);

	}
	public void uploadClaim() {
		String path= System.getProperty("user.dir");
		ClaimInputFile.sendKeys(path+"\\documents\\claim.zip");
	}
	public void uploadSupport() {
		String path = System.getProperty("user.dir");
		SupportInputFile.sendKeys(path+"\\documents\\support.zip");
	}
	public void socUpload() {
		ElementUtil.eu.waitForElementToBeClickable(driver, UploadSocBtn, 40);  
	}
	public void socConfClose() {
		SocConfirm.click();
		if(driver.findElement(By.xpath("//div[@id='cmess']")).isDisplayed()) {
			SocClose.click();
		}
	}
}
