package org.pojoClass;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LibGlobal {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Sign In']")
	private WebElement clkSignIn;

	@FindBy(xpath = "//button[@class='button button-default button-large']")
	private WebElement clkSignBtn;

	@FindBy(xpath = "//input[@id='j_username']")
	private WebElement txtUserName;

	@FindBy(xpath = "//input[@id='j_password']")
	private WebElement txtPassword;

	public WebElement getClkSignIn() {
		return clkSignIn;
	}

	public WebElement getClkSignBtn() {
		return clkSignBtn;
	}

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

}
