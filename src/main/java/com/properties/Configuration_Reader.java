package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p;

	public Configuration_Reader() throws IOException {
		File f = new File(
				"C:\\Users\\Lenovo\\eclipse-workspace\\Maven_Project1\\src\\main\\java\\com\\properties\\Adactin.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}

	public String geturl() throws Throwable {
		String url = p.getProperty("url");
		return url;
	}

	public String getUsername() {
		String username = p.getProperty("username");
		return username;
	}

	public String getPassword() {
		String password = p.getProperty("password");
		return password;
	}

	public String getFirstname() {
		String firstname = p.getProperty("first_name");
		return firstname;
	}

	public String getLastname() {
		String lastname = p.getProperty("last_name");
		return lastname;
	}

	public String getAddress() {
		String address = p.getProperty("address");
		return address;
	}

	public String getcc_num() {
		String ccnum = p.getProperty("cc_num");
		return ccnum;
	}

	public String getcc_cvv() {
		String cvv = p.getProperty("cc_cvv");
		return cvv;
	}

}
