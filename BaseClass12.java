package org.junit.testing;
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

	public class BaseClass12 {

		public static WebDriver driver;
		

		public static void launchBrowser() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		public static void WindowMaximize() {
			driver.manage().window().maximize();
		}

		public static void LaunchUrl(String url) {
			driver.get(url);
		}

		public static String PageTitle() {
			String title = driver.getTitle();
			//System.out.println(title);
			return title;
		}

		public static String PageUrl() {
			String currentUrl = driver.getCurrentUrl();
			//System.out.println(currentUrl);
			return currentUrl;
		}

		public static void PassText(String txt, WebElement ele) {
			ele.sendKeys(txt);
		}

		public static void CloseEntireBrowser() {
			CloseEntireBrowser();
		}

		public static void ClickBtn(WebElement ele) {
			ele.click();
		}

		public static void ScreenShot(String imgName) throws IOException {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File img = ts.getScreenshotAs(OutputType.FILE);
			File f = new File("Location+imageName.png");
			FileUtils.copyFile(img, f);
		}

		public static Actions a;

		public static void moveTheCursor(WebElement target) {
			a = new Actions(driver);
			a.moveToElement(target);
		}

		public static void dragandDrop(WebElement dragElement, WebElement dropElement) {
			a = new Actions(driver);
			a.dragAndDrop(dragElement, dropElement);
		}

		public static JavascriptExecutor js;

		public static void scrollThePage(WebElement TarWebEle) {
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].ScrollIntoView(true)", TarWebEle);
		}

		public static void Scroll(WebElement element) {
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].ScrollIntoView(false)", element);
		}

		public static void excelRead(String sheetName, int rowNm, int cellNm) throws IOException {
			File fp = new File("excellocation.xlsx");
			FileInputStream fis = new FileInputStream(fp);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet(sheetName);
			Row r = sheet.getRow(rowNm);
			Cell c = r.getCell(cellNm);
			int cellType = c.getCellType();
			String value = "";
			if (cellType == 1) {
				String value2 = c.getStringCellValue();
				System.out.println(value2);
			} else if (DateUtil.isCellDateFormatted(c)) {
				Date dd = c.getDateCellValue();
				SimpleDateFormat s = new SimpleDateFormat(value);
				String value1 = s.format(dd);
				System.out.println(value1);
			} else {
				double d = c.getNumericCellValue();
				long l = (long) d;
				String valueOf = String.valueOf(l);
				System.out.println(valueOf);
			}
		}

		public static void createNewExcelFile(int rowNum, int cellNum, String writeData) throws IOException {
			File f = new File("C:\\Users\\User\\eclipse-workspace\\DataDriven1\\Excel");
			Workbook w = new XSSFWorkbook();
			Sheet newSheet = w.createSheet("software");
			Row nr = newSheet.createRow(rowNum);
			Cell nc = nr.createCell(cellNum);
			nc.setCellValue(writeData);
			FileOutputStream fos = new FileOutputStream(f);
			w.write(fos);
		}

		public static void creatCell(int creatRow, int creatCell, String newData) throws IOException {
			File f = new File("excellocation.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("sheetname");
			Row r = sheet.getRow(creatRow);
			Cell c = r.getCell(creatCell);
			c.setCellValue(newData);
			FileOutputStream fos = new FileOutputStream(f);
			wb.write(fos);
		}

		public static void createRow (int creatRow, int creatCell, String newData) throws IOException {
			File f = new File("excellocation.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("sheetname");
			Row r = sheet.getRow(creatRow);
			Cell c = r.getCell(creatCell);
			c.setCellValue(newData);
			FileOutputStream fos = new FileOutputStream(f);
			wb.write(fos);
		}

		public static void updateDataToParticularCell(int gettheRow, int gettheCell, String existingData,
				String WriteNewData) throws IOException {
			File f = new File("excellocation.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("sheetname");
			Row r = sheet.getRow(gettheRow);
			Cell c = r.getCell(gettheCell);
			String str = c.getStringCellValue();
			if (str.equals(existingData)) {
				c.setCellValue(WriteNewData);
			}
			FileOutputStream fos = new FileOutputStream(f);
			wb.write(fos);
		}
	}



