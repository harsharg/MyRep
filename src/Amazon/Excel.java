package Amazon;
import java.io.File;
import java.io.FileInputStream;
import java.lang.*;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

public class Excel {

	
	FileInputStream file = new FileInputStream(new File("C:\test.xls"));
	
	HSSFWorkbook workbook = new HSSFWorkbook(file);
	
	HSSFSheet worksheet =  workbook.getSheetAt(1);
	
	
	Iterator<Row> rows =  worksheet.iterator();
	
	while(rows.hasNext())				
	{
		
		Row row = rows.next();
	}
	
	

	
    

  }
