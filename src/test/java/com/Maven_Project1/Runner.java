 package com.Maven_Project1;

import org.openqa.selenium.WebDriver;

import com.manager.Page_Object_Manager;
import com.pomclass.Book_Hotel;
import com.pomclass.Login_page;
import com.pomclass.Search_Hotel;
import com.pomclass.Select_hotel;
import com.properties.File_Reader_Manager;

public class Runner extends BaseClass {
	
	public static WebDriver driver = browserLaunch("chrome");
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	public static void main(String[] args) throws Throwable {
		
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().geturl();
		urlLaunch(url);

		// Login
		String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUsername();
		passInput(pom.getlp().getUsername(), username);
		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();
		passInput(pom.getlp().getPassword(), password);
		clickOnElement(pom.getlp().getLogin());
		
		// Search hotel
		selectByValue(pom.getsearch().getLocation(), "New York");
		byIndex(pom.getsearch().getHotels(), 3);
		visibleText(pom.getsearch().getRoom_type(), "Super Deluxe");
		selectByValue(pom.getsearch().getRoom_nos(), "2");
		selectByValue(pom.getsearch().getAdult_room(), "2");
		visibleText(pom.getsearch().getChild_room(), "1 - One");
		clickOnElement(pom.getsearch().getSubmit());

		// Select hotel
		clickOnElement(pom.getselect().getRadiobutton_0());
		clickOnElement(pom.getselect().getSubmit());

		// Book hotel
		String firstname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFirstname();
		passInput(pom.getbh().getFs(), firstname);
		String lastname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLastname();
		passInput(pom.getbh().getLs(), lastname);
		String address = File_Reader_Manager.getInstanceFRM().getInstanceCR().getAddress();
		passInput(pom.getbh().getAddress(), address);
		String ccnum = File_Reader_Manager.getInstanceFRM().getInstanceCR().getcc_num();
		passInput(pom.getbh().getCcnum(), ccnum);
		visibleText(pom.getbh().getCctype(), "VISA");
		visibleText(pom.getbh().getMonth(), "January");
		visibleText(pom.getbh().getYear(), "2012");
		String cvv = File_Reader_Manager.getInstanceFRM().getInstanceCR().getcc_cvv();
		passInput(pom.getbh().getcvv(), cvv);
		clickOnElement(pom.getbh().getBook_now());
		clickOnElement(pom.getbh().getLogout());

		// takescreenshot
		takeScreenshot("C:\\Users\\Lenovo\\eclipse-workspace\\Maven_Project1\\Screenshots\\img1.png");

	}
}