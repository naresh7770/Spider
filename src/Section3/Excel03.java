package Section3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel03 {
   public static void main(String[] args) throws Throwable {
	
	   FileInputStream fis=new FileInputStream("C:\\Users\\Kandagatla Naresh\\Desktop\\Automation\\Book1.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		//only once we can create the sheet after we need to use GETSHEET method
		book.getSheet("Details").createRow(1).createCell(1).setCellValue("Naresh");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Kandagatla Naresh\\Desktop\\Automation\\Book1.xlsx");
		book.write(fos);
		
	   System.out.println("pass");
	   
}
}
