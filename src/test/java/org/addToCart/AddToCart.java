package org.addToCart;

import java.util.List;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart extends LibGlobal {
	public AddToCart() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h2[text()='Bristol H29A423DBL, Reciprocating Compressor, 42,800 Btuh, 200/230V, R-22, 3 Phase']")
	private WebElement prtProductDetails;

	@FindBy(xpath = "//p[@class='your-price']")
	private List<WebElement> prtPrice;

	@FindBy(xpath = "//p[@class='list-price']")
	private WebElement prtListPrice;

	@FindBy(xpath = "//label[@for='shipping-method-10T46']")
	private WebElement prtShippingMethod;

	@FindBy(xpath = "//div[@id='ship-to-10T46']//div[@class='ship-to-availability availability']")
	private WebElement prtInStock;

	@FindBy(xpath = "//label[@for='pickup-method-10T46']")
	private WebElement prtPickUpStock;

	@FindBy(xpath = "//div[@id='pickup-10T46']//span[text()='36105-6205']")
	private WebElement prtMiles;

	@FindBy(xpath = "//div[@id='pickup-10T46']//div[@class='local-availability availability']")
	private WebElement prtScenarioStock;

	@FindBy(xpath = "//li[@data-product-id='10T46']//span[text()='Add To Cart']")
	private WebElement clkAddToCard;

	public WebElement getPrtProductDetails() {
		return prtProductDetails;
	}

	public List<WebElement> getPrtPrice() {
		return prtPrice;
	}

	public WebElement getPrtListPrice() {
		return prtListPrice;
	}

	public WebElement getPrtShippingMethod() {
		return prtShippingMethod;
	}

	public WebElement getPrtInStock() {
		return prtInStock;
	}

	public WebElement getPrtPickUpStock() {
		return prtPickUpStock;
	}

	public WebElement getPrtMiles() {
		return prtMiles;
	}

	public WebElement getPrtScenarioStock() {
		return prtScenarioStock;
	}

	public WebElement getClkAddToCard() {
		return clkAddToCard;
	}

}
