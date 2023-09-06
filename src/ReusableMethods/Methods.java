package ReusableMethods;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Methods {
	
	public String property(String s) throws Throwable {
		
		FileInputStream fis=new FileInputStream("./src/test/resources/01.PROPERTIES");
		Properties pobj=new Properties();
		pobj.load(fis);
		String data=pobj.getProperty(s);
		return data;
	}
	public String Exceldata(String name,int row,int cell) throws Throwable
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/Book1.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet(name);
		Row ro=sh.getRow(row);
    	String data= ro.getCell(cell).getStringCellValue();
    	return data;
		
	}
}
