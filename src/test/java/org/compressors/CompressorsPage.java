package org.compressors;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompressorsPage extends LibGlobal {

	public CompressorsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='login-div']//following-sibling::button[@type='button']")
	private WebElement prtWelcome;

	@FindBy(xpath = "//i[@class='far fa-bars v2-hamburger-menu']")
	private WebElement clkOption;

	@FindBy(xpath = "//div[@class='v2-hamburger-menu-flyout toggle-open']//following-sibling::a[text()='Parts and Supplies']")
	private WebElement clkParts;

	@FindBy(xpath = "//div[@class='v2-hamburger-menu-flyout toggle-open']//following-sibling::a[text()='Compressors']")
	private WebElement clkCompressors;

	@FindBy(xpath = "//ol[@class='breadcrumbs']")
	private WebElement prtSecondPage;

	@FindBy(xpath = "(//a[text()='Compressors'])[3]")
	private WebElement clkCompressorSecond;
	
	@FindBy(xpath="//button[text()='Accept All Cookies']")
	private WebElement clkCookies;

	public WebElement getClkCookies() {
		return clkCookies;
	}

	public WebElement getPrtSecondPage() {
		return prtSecondPage;
	}

	public WebElement getClkCompressorSecond() {
		return clkCompressorSecond;
	}

	public WebElement getPrtWelcome() {
		return prtWelcome;
	}

	public WebElement getClkOption() {
		return clkOption;
	}

	public WebElement getClkParts() {
		return clkParts;
	}

	public WebElement getClkCompressors() {
		return clkCompressors;
	}

}
