package org.assissment;

import java.io.IOException;
import java.util.Date;

import org.addToCart.AddToCart;
import org.base.LibGlobal;
import org.brand.BrandSection;
import org.compressors.CompressorsPage;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import org.pojoClass.LoginPage;
import org.product.ProductPage;

public class LunixAssessment extends LibGlobal {
	static LibGlobal libGlobal;

	@BeforeClass
	public static void launchBrowser() throws IOException {

		getDriver();
		launchUrl("https://www.liidaveqa.com/");
		libGlobal = new LibGlobal();
		LoginPage loginPage = new LoginPage();
		libGlobal.Screenshot("Url launch page");
		libGlobal.implicitWait(5);
		loginPage.btnClick(loginPage.getClkSignIn());
	}

	@Before
	public void beforeMethod() throws IOException {
		libGlobal = new LibGlobal();
		Date date = new Date();
		System.out.println(date);
		libGlobal.Screenshot("Before Login");

	}

	@Test
	public void tc0() throws IOException {
		LoginPage loginPage = new LoginPage();
		libGlobal.enterText(loginPage.getTxtUserName(), libGlobal.getDataFromExcel(
				"C:\\\\Users\\\\user\\\\eclipse-workspace\\\\Lunix\\\\ExcelRead\\\\Assessment.xlsx", "Sheet1", 1, 0));
		libGlobal.enterText(loginPage.getTxtPassword(), libGlobal.getDataFromExcel(
				"C:\\\\Users\\\\user\\\\eclipse-workspace\\\\Lunix\\\\ExcelRead\\\\Assessment.xlsx", "Sheet1", 1, 1));
		libGlobal.jsClick(loginPage.getClkSignBtn());
		loginPage.Screenshot("After Login");

	}

	@Test
	public void tc1() throws InterruptedException {
		CompressorsPage compressorsPage = new CompressorsPage();
		libGlobal.getAttribute(compressorsPage.getPrtWelcome());
		libGlobal.btnClick(compressorsPage.getClkOption());
		libGlobal.btnClick(compressorsPage.getClkParts());
		libGlobal.btnClick(compressorsPage.getClkCompressors());
		libGlobal.jsClick(compressorsPage.getClkCompressorSecond());
		libGlobal.getAttribute(compressorsPage.getPrtSecondPage());

	}

	@Test
	public void tc2() {
		BrandSection brandSection = new BrandSection();
		libGlobal.jsClick(brandSection.getClkBristol());
		libGlobal.getAttribute(brandSection.getPrtBrandSection());

	}

	@Test
	public void tc3() {
		AddToCart addToCart = new AddToCart();
		libGlobal.getAttribute(addToCart.getPrtProductDetails());
		libGlobal.getAttribute(addToCart.getPrtListPrice());
		libGlobal.getAttribute(addToCart.getPrtShippingMethod());
		libGlobal.getAttribute(addToCart.getPrtInStock());
		libGlobal.getAttribute(addToCart.getPrtPickUpStock());
		libGlobal.getAttribute(addToCart.getPrtScenarioStock());
		libGlobal.getAttribute(addToCart.getPrtMiles());
		libGlobal.jsClick(addToCart.getClkAddToCard());

	}

	@Test
	public void tc4() {
		ProductPage page = new ProductPage();
		libGlobal.btnClick(page.getClkCloseButton());
		libGlobal.jsClick(page.getClkProduct());
		libGlobal.getAttribute(page.getPrtProduct());
		libGlobal.getAttribute(page.getPrtCat());
		libGlobal.getAttribute(page.getPrtStandard());
		libGlobal.getAttribute(page.getPrtYourPrice());
		libGlobal.getAttribute(page.getPrtScenario2());
		libGlobal.getAttribute(page.getPrtProductPick());
		libGlobal.jsClick(page.getClkProductAddToCart());

	}

	@After
	public void after() throws IOException {

		libGlobal = new LibGlobal();
		Date date = new Date();
		System.out.println(date);
		libGlobal.Screenshot("After Close");
	}
	
	@AfterClass
	public static void afterClass() {
		libGlobal = new LibGlobal();
		libGlobal.closeWindow();
	}
}
