package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_Read {

	public static void read_All_Data() throws IOException {

		System.out.println("==============All Data===============");

		File f = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Maven_Project1\\datasheet.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis); // upcasting concept
		Sheet sheetAt = w.getSheetAt(0);
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();

		// outer loop
		for (int i = 0; i < numberOfRows; i++) {

			Row row = sheetAt.getRow(i);
			int numberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < numberOfCells; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();

				if (cellType.equals(cellType.STRING)) {
					String value = cell.getStringCellValue();
					System.out.println(value);

				}

				else if (cellType.equals(cellType.NUMERIC)) {
					double value = cell.getNumericCellValue();
					int num = (int) value;
					System.out.println(num);
				}
			}
		}

	}

	public static void read_Particular_Data() throws IOException {
		System.out.println("==================Particular data======================");

		File f = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Maven_Project1\\datasheet.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(1);
		Cell cell = row.getCell(0);
		CellType cellType = cell.getCellType();

		if (cellType.equals(cellType.STRING)) {
			String value = cell.getStringCellValue();
			System.out.println(value);
		}

		else if (cellType.equals(cellType.NUMERIC)) {
			double value = cell.getNumericCellValue();
			int num = (int) value;
			System.out.println(num);
		}

	}

	public static void read_Column_Data() throws IOException {
		System.out.println("==================Column data======================");

		File f = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Maven_Project1\\datasheet.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);

		int numberOfRows = sheetAt.getPhysicalNumberOfRows();

	
		for (int i = 0; i < numberOfRows; i++) {

			Row row = sheetAt.getRow(i);
			Cell cell = row.getCell(0);
			CellType cellType = cell.getCellType();

			if (cellType.equals(cellType.STRING)) {
				String value = cell.getStringCellValue();
				System.out.println(value);
			}

			else if (cellType.equals(cellType.NUMERIC)) {
				double value = cell.getNumericCellValue();
				int num = (int) value;
				System.out.println(num);
			}
		}

	}

	public static void read_row_Data() throws IOException {

		System.out.println("==============Row Data===============");

		File f = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Maven_Project1\\datasheet.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis); // upcasting concept
		Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(2);
		int numberOfCells = row.getPhysicalNumberOfCells();
		for (int j = 0; j < numberOfCells; j++) {
			Cell cell = row.getCell(j);
			CellType cellType = cell.getCellType();

			if (cellType.equals(cellType.STRING)) {
				String value = cell.getStringCellValue();
				System.out.println(value);

			}

			else if (cellType.equals(cellType.NUMERIC)) {
				double value = cell.getNumericCellValue();
				int num = (int) value;
				System.out.println(num);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		read_All_Data();
		read_Particular_Data();
		read_Column_Data();
		read_row_Data();
	}

}
