package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LibGlobal {
	public static WebDriver driver;

	public static void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	public static void launchUrl(String url) {
		driver.get(url);

	}

	public void implicitWait(int secs) {
		driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS);

	}

	public static void AssertEquals(String url, String actual) {
		Assert.assertEquals(url, actual);

	}

	public boolean isSelected(WebElement element) {
		return element.isSelected();

	}

	public static boolean isDisplayed(WebElement element) {
		return element.isDisplayed();

	}

	public static boolean isEnabled(WebElement element) {
		return element.isEnabled();

	}

	public void currentUrl(WebElement element) {
		((WebDriver) element).getCurrentUrl();

	}

	public void title() {
		driver.getTitle();
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public void enterText(WebElement element, String value) {
		element.sendKeys(value);
	}

	public String getDataFromExcel(String pathName, String sheetName, int rowNo, int cellNo) throws IOException {

		File file = new File(pathName);
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		int cellType = cell.getCellType();
		String value = " ";
		if (cellType == 1) {
			value = cell.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
			value = dateFormat.format(dateCellValue);
		} else {
			double numericCellValue = cell.getNumericCellValue();
			long l = (long) numericCellValue;
			value = String.valueOf(l);
		}
		return value;
	}

	public static void btnClick(WebElement element) {
		if (isDisplayed(element) && isEnabled(element))
			element.click();
	}

	public void quitWindow() {
		driver.quit();

	}

	public void closeWindow() {
		driver.close();

	}

	public void printText(WebElement element) {
		String text = element.getText();
		System.out.println(text);

	}

	public void getAttribute(WebElement element) {

		element.getAttribute("value");
		System.out.println(element);

	}

	public void getListAttribute(List<WebElement> element) {

		((WebElement) element).getAttribute("value");
		System.out.println(element);

	}

	public void moveToElement(WebElement target) {
		Actions action = new Actions(driver);
		action.moveToElement(target).perform();

	}

	public void dragAndDrop(WebElement source, WebElement target) {
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).perform();
	}

	public void rightClick(WebElement target) {
		Actions action = new Actions(driver);
		action.contextClick(target).perform();

	}

	public void doubleClick(WebElement target) {
		Actions action = new Actions(driver);
		action.doubleClick(target).perform();

	}

	public void acceptAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}

	public void cancelAlert() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public void Screenshot(String data) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenShotAs = ts.getScreenshotAs(OutputType.FILE);
		File file = new File("C:\\Users\\user\\eclipse-workspace\\Lunix\\target\\Assessmemt"+data+".png");
		FileUtils.copyFile(screenShotAs, file);
	}

	public void scrollDown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);

	}

	public void scrollUp(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);

	}

	public void enterTextJavaScript(String value, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(value, element);
	}

	public void returnPrintJavaScript(String value, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(value, element);

	}

	public void jsClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);

	}

	public void selectByValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);

	}

	public void selectByIndex(WebElement element, Integer index) {
		new Select(element).selectByIndex(index);
	}

	public void selectByVisibleText(WebElement element, String value) {
		new Select(element).selectByVisibleText(value);
	}

	public void deselectByValue(WebElement element, String value) {
		new Select(element).deselectByValue(value);

	}

	public void deselectByVisibleText(WebElement element, String value) {
		new Select(element).deselectByVisibleText(value);
	}

	public void deselectByIndex(WebElement element, Integer index) {
		new Select(element).deselectByIndex(index);
	}

	public void getOptions(WebElement element) {
		new Select(element).getOptions();
	}

	public void isMultiple(WebElement element) {
		new Select(element).isMultiple();

	}

	public void createSheet(String pathname, String sheetname, int sheetrow, int sheetcell, String element)
			throws IOException {

		File file = new File(pathname);

		FileInputStream stream = new FileInputStream(file);

		Workbook b = new XSSFWorkbook(stream);

		Sheet sheet = b.createSheet(sheetname);

		Row createRow = sheet.createRow(sheetrow);

		Cell createCell = createRow.createCell(sheetcell);

		createCell.setCellValue(element);
		FileOutputStream stream2 = new FileOutputStream(file);
		b.write(stream2);

	}

	public void frameIndex(Integer index) {
		driver.switchTo().frame(index);

	}

	public void frameString(String value) {
		driver.switchTo().frame(value);

	}

	public void frameXpath(String value) {
		driver.switchTo().frame(value);

	}

	public void thread(int mills) throws InterruptedException {
		Thread.sleep(mills);

	}

	public void backword() {
		driver.navigate().back();

	}

	public void forword() {
		driver.navigate().forward();

	}

	public void refresh() {
		driver.navigate().refresh();

	}

	public void getNavigate(String url) {
		driver.navigate().to(url);

	}

	public void dynamicTable() {
		List<WebElement> price = driver.findElements(By.xpath("//table//tbody//tr//td[6]"));
		ArrayList<Float> a = new ArrayList<Float>();
		for (int i = 0; i < price.size(); i++) {
			a.add(Float.parseFloat(price.get(i).getText()));

		}
		Float max = Collections.min(a);
		List<WebElement> row = driver.findElements(By.xpath("//table//tbody//tr"));
		for (int j = 0; j < row.size(); j++) {
			String test = row.get(j).getText();
			if (test.contains(String.valueOf(max))) {
				int k = j + 1;
				WebElement text = driver.findElement(By.xpath("(//table//tbody//tr//td[1])[" + k + "]"));
				text.click();

			}

		}

	}

}
