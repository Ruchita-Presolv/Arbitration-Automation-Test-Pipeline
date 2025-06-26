package org.factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();
	
	public WebDriver initdriver(String Browser) {
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--headless=new");
		
		System.out.println("Browser value is: " + Browser);
	
		  if(Browser.equalsIgnoreCase("chrome")||Browser.contains("ch")){
		  
		// System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//  System.out.println("Browser value is: inside chrome");///
		
			  // WebDriverManager.chromedriver().setup(); 
			  //==================================================
			  //
			  
			  //    tlDriver.set(new ChromeDriver(Options));
			  tlDriver.set(new ChromeDriver());
			  
			  
			  //===================================================
		  //upcast
		  
		  }else if (Browser.equalsIgnoreCase("Edge")|| Browser.contains("Edge")){
		  //System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		  
			  //WebDriverManager.edgedriver().setup();
		  tlDriver.set(new EdgeDriver());
		  
		  }else if (Browser.equalsIgnoreCase("ff")) {
			 // System.setProperty("webdriver.edge.driver","./drivers/geckodriver.exe");
		
			  //WebDriverManager.firefoxdriver().setup(); 
		  tlDriver.set(new FirefoxDriver());
		  
		  }else{ 
			  System.out.println("Invalid Browser");
			  }
		 
		//tlDriver.get().manage().window().maximize();
		getDriver().manage().window().maximize();
		//getDriver().manage().window().minimize();
		getDriver().manage().timeouts().implicitlyWait (Duration.ofSeconds(30));
		return getDriver();
	}
	// user defined method 
	public static synchronized WebDriver getDriver(){
		return tlDriver.get();
	}
}




