package org.brand;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrandSection extends LibGlobal {
	public BrandSection() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[contains(text(),'Replace')]")
	private WebElement prtBrandSection;

	@FindBy(xpath = "//a[contains(text(),'Bristol Corp')]")
	private WebElement clkBristol;

	public WebElement getPrtBrandSection() {
		return prtBrandSection;
	}

	public WebElement getClkBristol() {
		return clkBristol;
	}

}
