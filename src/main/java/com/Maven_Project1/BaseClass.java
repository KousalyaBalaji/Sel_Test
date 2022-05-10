package com.Maven_Project1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;
	public static Actions ac;
	public static Robot r;
	public static Select s;

	// browser launch
	public static WebDriver browserLaunch(String browsername) {

		if (browsername.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();

			driver.manage().window().maximize();
		}
		return driver;
	}

	// get
	public static void urlLaunch(String url) {

		driver.get(url);
	}

	// fullscreen
	public static void fullscreen() {
		driver.manage().window().fullscreen();
	}

	// close
	public static void closeBrowser() {
		driver.close();
	}

	// quit
	public static void quitBrowser() {
		driver.quit();
	}

	// sendkeys
	public static void passInput(WebElement element, String input) {
		element.sendKeys(input);
	}

	// click
	public static void clickOnElement(WebElement element) {
		element.click();
	}

	// Navigate to
	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	// Navigate back
	public static void navigateBack() {
		driver.navigate().back();
	}

	// Navigate forward
	public static void navigateForward() {
		driver.navigate().forward();
	}

	// Navigate refresh
	public static void navigateRefresh() {
		driver.navigate().refresh();
	}

	// alert accept
	public static void alertAccept() {
		driver.switchTo().alert().accept();
	}

	// alert dismiss
	public static void alertDismiss() {
		driver.switchTo().alert().dismiss();
	}

	// Actions
	public static void actionClick(WebElement element) {
		ac = new Actions(driver);
		ac.click(element).build().perform();
	}

	// doubleclick
	public static void doubleClick(WebElement element) {
		ac = new Actions(driver);
		ac.doubleClick(element).build().perform();
	}

	// contextclick
	public static void contextClick(WebElement element) {
		ac = new Actions(driver);
		ac.contextClick(element).build().perform();
	}

	// drag and drop
	public static void dragDrop(WebElement drag, WebElement drop) {
		ac = new Actions(driver);
		ac.dragAndDrop(drag, drop);

	}

	// Frames
	public static void framesIndex(int index) {
		driver.switchTo().frame(index);
	}

	public static void framesElement(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void parentFrame() {
		driver.switchTo().parentFrame();
	}

	public static void defaultContent() {
		driver.switchTo().defaultContent();
	}

	// robot down
	public static void robotDown() throws Throwable {
		r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	// robot enter
	public static void robotEnter() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	// windowHandles
	public static void windowHandles(String a) {

		Set<String> windowHandles = driver.getWindowHandles();
		for (String id : windowHandles) {
			String title = driver.switchTo().window(id).getTitle();
			System.out.println(title);

		}
		String myTitle = "a";
		for (String title : windowHandles) {
			if (driver.switchTo().window(title).getTitle().equals(myTitle)) {
				break;

			}
		}

	}

	// dropdown
		// selectbyvalue
	public static void selectByValue(WebElement element, String value) {
		s = new Select(element);
		s.selectByValue(value);
	}
	
	// selectByvisibleText
	public static void visibleText(WebElement element,String text) {
		s = new Select(element);
		s.selectByVisibleText(text);
	}

	// selectByIndex
	public static void byIndex(WebElement element,int index) {
		s = new Select(element);
		s.selectByIndex(index);
	}

	// isMultiple
	public static void isMultiple(WebElement element) {
		s = new Select(element);
		s.isMultiple(); // give all code with return type
		System.out.println(s);
	}

	// getOptions
	public static void getOptions(WebElement element) {
		s = new Select(element);
		s.getOptions();
		System.out.println(s);
	}

	// getFirstSelectedOption
	public static void getFirstSelectedOption(WebElement element) {
		s = new Select(element);
		s.getFirstSelectedOption();
		System.out.println(s);
	}

	// getAllSelectedOptions
	public static void getAllSelectedOptions(WebElement element) {
		s = new Select(element);
		s.getAllSelectedOptions();
		System.out.println(s);
	}

	// checkbox
	public static void checkBox(WebElement element) {
		element.click();
	}

	// radiobutton
	public static void radioButton(WebElement element) {
		element.click();
	}

	// isSelected
	public static void selected(WebElement ele) {
		System.out.println(ele.isSelected());
	}

	// isEnabled
	public static void enabled(WebElement ele) {
		System.out.println(ele.isEnabled());
	}

	// isDisplayed
	public static void displayed(WebElement ele) {
 		System.out.println(ele.isDisplayed());
	}

	// Screenshot
	public static void takeScreenshot(String loc) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(loc); 
		FileUtils.copyFile(src, dest);
	}

	// implicitwait
	public static void implicitWait(int timeout) {
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
	}

	// explicitwait
	public static void explicitWait(int timeout, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOf(element));
 
	}

}