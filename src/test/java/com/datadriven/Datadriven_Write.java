package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_Write {

	public static void write_data() throws IOException {
		File f = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Maven_Project1\\datasheet.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet createSheet = w.createSheet("newsheet");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("Kousalya");
		w.getSheet("newsheet").getRow(0).createCell(1).setCellValue(1803);
		w.getSheet("newsheet").createRow(1).createCell(0).setCellValue("Hanvika");
		w.getSheet("newsheet").getRow(1).createCell(1).setCellValue(0503);
		w.getSheet("newsheet").createRow(2).createCell(0).setCellValue("Rohan");
		w.getSheet("newsheet").getRow(2).createCell(1).setCellValue(0212);
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);
		w.close();
	}

	public static void main(String[] args) throws IOException {
		write_data();
	}

}
