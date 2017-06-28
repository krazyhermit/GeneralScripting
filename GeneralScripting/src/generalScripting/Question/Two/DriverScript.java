package generalScripting.Question.Two;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DriverScript {
	WebDriver driver;
	private static final String URL = "file:///D:/Software-Testing-Training/Git-Repo/Job-Repo/GeneralScripting/GeneralScripting/problem-1.html";

	@BeforeMethod
	public void beforeMethod() {
		driver = new FirefoxDriver();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public PageController foodTest() {
		return new PageController(driver);
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}