package Section3;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel01 {

	public static void main(String[] args) throws Throwable {
		
//		FileInputStream fis=new FileInputStream("C:\\Users\\Kandagatla Naresh\\Desktop\\Automation\\Book1.xlsx");
//		Workbook book=WorkbookFactory.create(fis);
//		Sheet sh=book.getSheet("Sheet2");
//		Row r=sh.getRow(25);
//		Cell c=r.getCell(4);
//		String data=c.getStringCellValue();
//		System.out.println(data);
		
		
		// shortcut for above method
		
		
//	    FileInputStream fis=new FileInputStream("C:\\Users\\Kandagatla Naresh\\Desktop\\Automation\\Book1.xlsx");
//	    String data= WorkbookFactory.create(fis).getSheet("Sheet2").getRow(24).getCell(4).getStringCellValue();
//	    System.out.println(data);
		
	    
		DataFormatter df=new DataFormatter();
		FileInputStream fis=new FileInputStream("C:\\\\Users\\\\Kandagatla Naresh\\\\Desktop\\\\Automation\\\\Book1.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Details");
//		int lastrow=sh.getLastRowNum();
//		System.out.println(lastrow);
		
		for(int i=0;i<=sh.getLastRowNum();i++)
		{
//			Row r=sh.getRow(i);
//			int c=r.getLastCellNum();
//			System.out.println(c);
		 for(int j=0;j<=sh.getRow(i).getLastCellNum();j++)
		 {
			 
			 String data= df.formatCellValue(sh.getRow(i).getCell(j));
			 System.out.print(data+"   ");
		}
		 System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
