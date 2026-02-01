package utils;

import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
//
public class ExcelReader {

    public static List<String[]> readExcel(String path) {
        List<String[]> data = new ArrayList<>();

        try {
            Workbook workbook = WorkbookFactory.create(new FileInputStream(new File(path)));
            Sheet sheet = workbook.getSheetAt(0);

            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                data.add(new String[]{
                        row.getCell(0).getStringCellValue(),
                        row.getCell(1).getStringCellValue(),
                        row.getCell(2).getStringCellValue(),
                        row.getCell(3).getStringCellValue()
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
}
