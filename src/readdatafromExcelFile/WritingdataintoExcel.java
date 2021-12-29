package readdatafromExcelFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritingdataintoExcel {

	public static void main(String[] args) throws Throwable, IOException {
		FileInputStream st = new FileInputStream("./data/Inputdata.xlsx");
		 Workbook wb = WorkbookFactory.create(st);
	        Sheet sh = wb.getSheet("Sheet1");
	        Row  r = sh.getRow(3);
	        Cell c = r.createCell(2);
	        c.setCellValue("chakri");
	        FileOutputStream os = new FileOutputStream("./data/Inputdata.xlsx"); 
	        wb.write(os);
	        System.out.println("Written done");

	}

}
