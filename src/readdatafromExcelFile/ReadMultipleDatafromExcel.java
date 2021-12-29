package readdatafromExcelFile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDatafromExcel {

	public static void main(String[] args) throws Throwable, IOException {
		for(int i=0;i<=6;i++) { 
			FileInputStream st = new FileInputStream("./data/Inputdata.xlsx");
			
	        Workbook wb = WorkbookFactory.create(st);
	        Sheet sh = wb.getSheet("Sheet1");
	        Row  r = sh.getRow(i);
	        Cell c = r.getCell(0);
	        String value = c.getStringCellValue();
	        System.out.println(value);
		}

	}

}
