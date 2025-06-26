package org.pages;

import java.util.List;

import org.apache.velocity.runtime.directive.Foreach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.ElementUtil;

public class ClosePage {
	private WebDriver driver;

	public ClosePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}


	/******************
	 * @AwardClose
	 */

	@FindBy(xpath="//span[text()='Closed']")
	public WebElement CloseBtn;

	@FindBy(css="span[class='nav-link-in']")
	private WebElement PageTitle;

	@FindBy(css="div[class='col-md-12']>div[class='form-check-inline']")
	private List<WebElement> FilterOption;

	@FindBy(css="div[class='form-check-inline'] label>input[id='for_random']")
	private WebElement  RandomFilBtn;
//div[class='form-check-inline'] label>input[id='for_random']
	//div[class='form-check-inline']
	
	@FindBy(css="button[class='btn btn-secondary py-2 px-3 dropdown-toggle']")
	private WebElement BulkUploadBtn;

	@FindBy(css="button[class='dropdown-item']")
	private WebElement AwardBtn;

	@FindBy(css="h5[id='exampleModalLabel']")
	private WebElement PopUpTitle;

	@FindBy(css="input[id='FileInput']")
	private WebElement SelectFile;

	@FindBy(css="button[id='UpDocsSubmit']")
	private WebElement UploadBtn;

	@FindBy(css="i[class='fa fa-check text-success']")
	private WebElement SuccessMass;
	
	@FindBy(css="a[class='btn btn-danger btn-lg']")
	private WebElement ClosePopBtn;
	
	//
	public void closeBtn() {
		CloseBtn.click();
	}
	public void pageTitle(String title) {
		if (title.equals(PageTitle.getText())) {
			System.out.println("Title is matched");
		} else {
			System.out.println("Fails to load page");
		}

	}
	public void filterWorking() {
		for(WebElement ele:FilterOption) {
			if(ele.isEnabled()) {

			}else {
				System.out.println("Both filter are not working");
			}
		}
		System.out.println("Both filter btn are working");
	}

	public void ranSelect() {
		RandomFilBtn.click();
		ElementUtil.eu.waitForPageLoad(driver);
		BulkUploadBtn.click();
		AwardBtn.click();
	}

	public void uploadAward(String Popt) throws InterruptedException {
		if(Popt.contains(PopUpTitle.getText())) {
			SelectFile.sendKeys(System.getProperty("user.dir")+"\\documents\\Award_A015616.zip");
			Thread.sleep(2000);
			UploadBtn.click();
			if(SuccessMass.isDisplayed()) {
				ClosePopBtn.click();
				System.out.println("Successfully uploaded Award ");
			}else {
				System.out.println("Fails to upload Award");
			}
		}else {
			System.out.println("fails to load pop up to upload");
		}
	}

}
