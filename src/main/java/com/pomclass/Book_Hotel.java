package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {

	public WebDriver driver;

	@FindBy(id = "first_name")
	private WebElement fs;

	@FindBy(id = "last_name")
	private WebElement ls;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(id = "cc_num")
	private WebElement ccnum;

	@FindBy(id = "cc_type")
	private WebElement cctype;

	@FindBy(id = "cc_exp_month")
	private WebElement month;

	@FindBy(id = "cc_exp_year")
	private WebElement year;

	@FindBy(name = "cc_cvv")
	private WebElement cvv;

	@FindBy(id = "book_now")
	private WebElement book_now;

	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logout;

	public Book_Hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFs() {
		return fs;
	}

	public WebElement getLs() {
		return ls;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcnum() {
		return ccnum;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getcvv() {
		return cvv;
	}

	public WebElement getBook_now() {
		return book_now;
	}

	public WebElement getLogout() {
		return logout;
	}

}
