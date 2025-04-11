package utils;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

    /**
     * Description: This method read data from excel
     * 
     * @param String, String int, int
     * @return String
     */
    public static String DataReader(String path, String sheet, int row, int cell) {
        try {
            FileInputStream fis = new FileInputStream(path);
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheets = workbook.getSheet(sheet);
            XSSFRow rows = sheets.getRow(row);
            XSSFCell cells = rows.getCell(cell);
            String value = cells.toString();

            workbook.close();
            return value;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
