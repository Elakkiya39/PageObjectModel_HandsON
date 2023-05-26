package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pageObjects.LoginPageWithFindByAnnotation;

public class LoginTestCasewithAnnotation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\praga\\Downloads\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		PageFactory.initElements(driver, LoginPageWithFindByAnnotation.class);
		LoginPageWithFindByAnnotation.userName.sendKeys("Admin");
		LoginPageWithFindByAnnotation.passWord.sendKeys("admin123");
		LoginPageWithFindByAnnotation.loginBtn.click();
		

		//quit browser
		driver.quit();

	}
}
