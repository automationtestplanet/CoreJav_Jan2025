package iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataTOExcel {

	public static void main(String[] args) throws Exception {
		String filePath = System.getProperty("user.dir") + "//Files//Test.xlsx";
		XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(new File(filePath)));

		XSSFSheet febSheet = workbook.createSheet("FEB_2025");
		Row firstRow = febSheet.createRow(0);
		Cell firstCell = firstRow.createCell(0);
		firstCell.setCellValue("New data set by java code");

		FileOutputStream fos = new FileOutputStream(filePath);
		workbook.write(fos);
		fos.close();
		
//		febSheet.getRow(1).getCell(1).setCellValue(false);

	}

}
