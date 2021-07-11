package testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public  String[][] readData(String fileName) throws IOException {
		//Step1: Get into the workbook
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx");
		
		//step2: get into the worksheet
		XSSFSheet ws = wb.getSheet("Sheet1");
				
		//to get the number of rows
		int rowCount = ws.getLastRowNum(); //no of rows excluding the header (first row)
				
		//to get the cell count
		int cellCount = ws.getRow(1).getLastCellNum();
		
		//declare 2D array
		String[][] data = new String[rowCount][cellCount];
				
		for (int i = 1; i <= rowCount; i++) { //row
								
			for (int j = 0; j < cellCount ; j++) { //column / cell
				
				String cellValue = ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(cellValue);
				//0,0
				data[i-1][j] = cellValue;
			}
			
		}
		//to close the workbook
		wb.close();
		
		return data;
		
		//ws.getPhysicalNumberOfRows(); //no of rows including the header (first row)

		//step3: get into the row
		//XSSFRow row = ws.getRow(i);
		
		//step4: get into the cell
		//XSSFCell cell = row.getCell(0);
		
		//step5: read the data from the cell
		//String cellValue = cell.getStringCellValue();
		
		

	}

}
