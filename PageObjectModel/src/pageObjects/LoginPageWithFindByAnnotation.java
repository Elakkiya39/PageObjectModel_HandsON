package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageWithFindByAnnotation {
	
	//identify using @FindBy annotation. username, password, login button
	@FindBy(how = How.NAME, using="username")
	public static WebElement userName;
	
	@FindBy(name= "password")
	public static WebElement passWord;
	
	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement loginBtn;

}
