package handelExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");

		Workbook wb= WorkbookFactory.create(fis);

		Sheet sh = wb.getSheet("citytour");
		Row row = sh.getRow(5);
		Cell cell = row.createCell(4);
		cell.setCellValue("Automation");

		FileOutputStream fos=new  FileOutputStream("./data/TestData.xlsx");
		wb.write(fos);


	}

}
