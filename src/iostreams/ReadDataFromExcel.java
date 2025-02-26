package iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Exception {
		String filePath = System.getProperty("user.dir") + "//Files//Test.xlsx";
//		FileInputStream fis = new FileInputStream(new File(filePath));		
//		HSSFWorkbook workbook = new HSSFWorkbook();   // for .xls file
//		XSSFWorkbook workbook = new XSSFWorkbook(fis); // .xlsx file

		XSSFWorkbook workbook = new XSSFWorkbook(
				new FileInputStream(new File(System.getProperty("user.dir") + "//Files//Test.xlsx")));

		XSSFSheet languagesSheet = workbook.getSheet("Languages");
		Iterator<Row> allRows = languagesSheet.rowIterator();

		while (allRows.hasNext()) {
			Row eachRow = allRows.next();
			Iterator<Cell> allCells = eachRow.cellIterator();
			while (allCells.hasNext()) {
				Cell eachCell = allCells.next();

				switch (eachCell.getCellType()) {

				case Cell.CELL_TYPE_STRING:
					String str1 = eachCell.getStringCellValue();
					System.out.print(str1 + "          ");
					break;
				case Cell.CELL_TYPE_NUMERIC:
					double int1 = eachCell.getNumericCellValue();
					System.out.print(int1 + "          ");
					break;
				case Cell.CELL_TYPE_BLANK:
					String str2 = eachCell.getStringCellValue().toString();
					System.out.print(str2 + "     ");
					break;
				}

			}
			System.out.println();
		}
	}

}
