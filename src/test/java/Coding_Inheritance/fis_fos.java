package Coding_Inheritance;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class fis_fos {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		int  i =0;
//		Reading into the file
		FileInputStream fis = new FileInputStream("D:\\BDD\\ScreehShots\\Reading.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		Row r = sheet.getRow(i);
		Cell c = r.getCell(i);
		System.out.println(c);

//		Displays the data size in the sheet
		System.out.println(sheet.getDimension());
		System.out.println(sheet.findEndOfRowOutlineGroup(i));
		System.out.println("Last row number is: "+sheet.getLastRowNum());
		System.out.println("First row number is: "+sheet.getFirstRowNum());
		System.out.println(sheet.getPhysicalNumberOfRows());
		System.out.println(r.getLastCellNum());

		for (int j = 0; j <sheet.getPhysicalNumberOfRows(); j++) {
			for(int k =0;k<r.getLastCellNum();k++) {
				System.out.println(sheet.getRow(j).getCell(k));
				
			}
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
