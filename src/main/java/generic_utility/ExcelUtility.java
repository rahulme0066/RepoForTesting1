package generic_utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public FileInputStream fis;
	public String getDataFromExcel(String sheetName,int rowNo,int cellNo) throws EncryptedDocumentException, IOException {
		fis=new FileInputStream("./src/test/resources/Assignment.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Cell cellNum = workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo);
		String value = cellNum.toString();
		return value;
	}
	public int getrowCount(String sheetName) throws EncryptedDocumentException, IOException {
		fis=new FileInputStream("./src/test/resources/Assignment.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int rowCount = wb.getSheet(sheetName).getLastRowNum();
		return rowCount;
		
	}
}
