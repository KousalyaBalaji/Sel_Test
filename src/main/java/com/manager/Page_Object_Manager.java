package com.manager;

import org.openqa.selenium.WebDriver;

import com.pomclass.Book_Hotel;
import com.pomclass.Login_page;
import com.pomclass.Search_Hotel;
import com.pomclass.Select_hotel;

public class Page_Object_Manager {

	public WebDriver driver;// null

	private Login_page lp;
	private Book_Hotel bh;
	private Search_Hotel search;
	private Select_hotel select;

	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
	}

	public Login_page getlp() {
		if (lp == null) {
			lp = new Login_page(driver);
		}
		return lp;
	}

	public Book_Hotel getbh() {

		if (bh == null) {
			bh = new Book_Hotel(driver);
		}
		return bh;
	}

	public Search_Hotel getsearch() {
		if (search == null) {
			search = new Search_Hotel(driver);
		}
		return search;
	}

	public Select_hotel getselect() {
		if (select == null) {
			select = new Select_hotel(driver);
		}
		return select;

	}

}
