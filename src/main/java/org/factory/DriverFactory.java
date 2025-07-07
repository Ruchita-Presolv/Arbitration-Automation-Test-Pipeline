package org.factory;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();

	public WebDriver initdriver(String Browser) {

		System.out.println("Browser value is: " + Browser);

		if (Browser.equalsIgnoreCase("chrome") || Browser.contains("ch")) {

			// ✅ Create ChromeOptions and set headless + unique user data dir
			ChromeOptions options = new ChromeOptions();

			// Optional: run headless in Jenkins
			options.addArguments("--headless=new");

			// ✅ Fix: assign unique --user-data-dir to avoid conflict
			String uniqueUserDataDir = "/tmp/chrome-profile-" + System.currentTimeMillis();
			options.addArguments("--user-data-dir=" + uniqueUserDataDir);

			// ✅ Use ChromeDriver with options
			tlDriver.set(new ChromeDriver(options));

		} else if (Browser.equalsIgnoreCase("Edge") || Browser.contains("Edge")) {
			tlDriver.set(new EdgeDriver());

		} else if (Browser.equalsIgnoreCase("ff")) {
			tlDriver.set(new FirefoxDriver());

		} else {
			System.out.println("Invalid Browser");
		}

		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return getDriver();
	}

	// user defined method
	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
	}
}





