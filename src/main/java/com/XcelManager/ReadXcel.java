package com.XcelManager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXcel {
public void getExcel(int rowIndex,int columnIndex) throws IOException {
File file = new	File("./src/test/resources/TestCase.xlsx(dumy Data).xlsx");
//convert data to stream
FileInputStream fis = new FileInputStream(file);
//Apachi poi to read Xcel
XSSFWorkbook wb = new XSSFWorkbook(fis);
XSSFSheet sht = wb.getSheet("Sheet1");

//int totalRow=sht.getPhysicalNumberOfRows();
//loop for row
for(int i =0;i<sht.getPhysicalNumberOfRows();i++) {
if(i==rowIndex) {
	
}
Row row=sht.getRow(i);	
row.getLastCellNum();
//loop for column
for(int j=0;j<row.getLastCellNum();j++) {
	if(j==columnIndex) {
		
	}
Cell cell =	row.getCell(j);	
System.out.println(cell.getStringCellValue());
	
}

}

}
	
public static void main(String[] args) throws IOException {
new ReadXcel().getExcel(3,2);	

}	
}
