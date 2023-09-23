package org.fbstepdefinitionclass;

	import java.io.File; 
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.text.SimpleDateFormat;
	import java.util.Date;

	import org.apache.commons.io.FileUtils;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.DateUtil;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Baseclass {
		public static WebDriver driver;

		public static void launchbrowser() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		public static void WindowMaximize() {
			driver.manage().window().maximize();
		}

		public static void launchUrl(String url) {
			driver.get(url);
		}

		public static void pageTitle() {
			String title = driver.getTitle();
			System.out.println(title);
		}

		public static void pageurl() {
			String url = driver.getCurrentUrl();
			System.out.println(url);
		}

		public static void passText(String txt, WebElement ele) {
			ele.sendKeys(txt);
		}

		public static void closeEntireBrowser() {
			driver.quit();
		}

		public static void clickBtn(WebElement ele) {
			ele.click();
		}

		public static void ScreenShot(String imgName) throws IOException {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File image = ts.getScreenshotAs(OutputType.FILE);
			File f = new File("C:\\MavenInstallation\\ScreenshotFiles\\imgName.png");
			FileUtils.copyFile(image, f);
		}

		public static Actions a;

		public static void moveTheCursor(WebElement targetWebElement) {
			a = new Actions(driver);
			a.moveToElement(targetWebElement).perform();
		}

		public static void dragDrop(WebElement dragWebElement, WebElement dropElement) {
			a = new Actions(driver);
			a.dragAndDrop(dragWebElement, dropElement).perform();
		}

		public static JavascriptExecutor js;

		public static void scrollThePage(WebElement tarWebElement) {
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true)", tarWebElement);
		}

		public static void scroll(WebElement element) {
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(false)", element);
		}

		public static void excelRead(String sheetName, int rowNum, int cellNum) throws IOException {
			File f = new File("C:\\MavenInstallation\\ExcelFolder\\Excellocation.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook web = new XSSFWorkbook();
			Sheet mySheet = web.getSheet("datas");
			Row r = mySheet.getRow(rowNum);
			Cell c = r.getCell(cellNum);
			int cellType = c.getCellType();

			if (cellType == 1) {
				String value = c.getStringCellValue();
			} else if (DateUtil.isCellDateFormatted(c)) {
				Date dd = c.getDateCellValue();
				SimpleDateFormat s = new SimpleDateFormat();
				String value1 = s.format(dd);
			} else {
				double d = c.getNumericCellValue();
				long l = (long) d;
				String valueOf = String.valueOf(l);
			}
		}

		public static void CreateNewExcel(int rowNum, int cellNum, String writeData) throws IOException {
			File f = new File("C:\\MavenInstallation\\ExcelFolder\\Excellocation.xlsx");
			Workbook w = new XSSFWorkbook();
			Sheet newSheet = w.createSheet("Datas");
			Row newRow = newSheet.createRow(rowNum);
			Cell newCell = newRow.createCell(cellNum);
			newCell.setCellValue(writeData);
			FileOutputStream fos = new FileOutputStream(f);
			w.write(fos);
		}

		public static void createCell(int getRow, int creCell, String newData) throws IOException {
			File f = new File("C:\\MavenInstallation\\ExcelFolder\\Excellocation.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet s = wb.getSheet("Datas");
			Row r = s.getRow(getRow);
			Cell c = r.createCell(creCell);
			c.setCellValue(newData);
			FileOutputStream fos = new FileOutputStream(f);
			wb.write(fos);
		}

		public static void createRow(int creRow, int crecell, String newData) throws IOException {
			File f = new File("C:\\MavenInstallation\\ExcelFolder\\Excellocation.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet s = wb.getSheet("Datas");
			Row r = s.createRow(creRow);
			Cell c = r.createCell(crecell);
			c.setCellValue(newData);
			FileOutputStream fos = new FileOutputStream(f);
			wb.write(fos);
		}

		public static void updateDataToParticularCell(int getTheRow, int getTheCell, String existingData,
				String writeNewData) throws IOException {

			File f = new File("C:\\MavenInstallation\\ExcelFolder\\ExcelLocation.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet s = wb.getSheet("Datas");
			Row r = s.getRow(getTheRow);
			Cell c = r.getCell(getTheCell);
			String str = c.getStringCellValue();
			if (str.equals(existingData)) {
				c.setCellValue(writeNewData);
			}
			FileOutputStream fos = new FileOutputStream(f);
			wb.write(fos);
		}
	}
	
