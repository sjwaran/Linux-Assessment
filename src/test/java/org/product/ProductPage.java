package org.product;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends LibGlobal {
	public ProductPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@data-target='#add-to-cart']")
	private WebElement clkCloseButton;

	@FindBy(xpath = "//div[@class='thumb']")
	private WebElement clkProduct;

	@FindBy(xpath = "//h1[@itemprop='name']")
	private WebElement prtProduct;

	@FindBy(xpath = "//p[@class='sku']")
	private WebElement prtCat;

	@FindBy(xpath = "//strong[contains(text(),'Yo')]")
	private WebElement prtYourPrice;

	@FindBy(xpath = "//label[@for='dm-ship-A300']")
	private WebElement prtStandard;

	@FindBy(xpath = "//div[@class='availability-info-ot']")
	private WebElement prtScenario2;

	@FindBy(xpath = "//label[@for='dm-pickup']")
	private WebElement prtProductPick;

	@FindBy(xpath = "//button[@id='product-button-10T46']")
	private WebElement clkProductAddToCart;

	public WebElement getClkCloseButton() {
		return clkCloseButton;
	}

	public WebElement getClkProduct() {
		return clkProduct;
	}

	public WebElement getPrtProduct() {
		return prtProduct;
	}

	public WebElement getPrtCat() {
		return prtCat;
	}

	public WebElement getPrtYourPrice() {
		return prtYourPrice;
	}

	public WebElement getPrtStandard() {
		return prtStandard;
	}

	public WebElement getPrtScenario2() {
		return prtScenario2;
	}

	public WebElement getPrtProductPick() {
		return prtProductPick;
	}

	public WebElement getClkProductAddToCart() {
		return clkProductAddToCart;
	}

}
