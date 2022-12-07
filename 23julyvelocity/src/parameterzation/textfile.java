package parameterzation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class textfile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fs=new FileInputStream("C:\\Users\\asus\\Documents\\facebooklogin.xlsx");
		
		//string data extract from excel file
		String data=WorkbookFactory.create(fs).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(data);
		
		//numeric data extract from excelkkk file
        FileInputStream file=new FileInputStream("C:\\\\Users\\\\asus\\\\aDocuments\\\\facebooklogin.xlsx");
		double data1=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(2).getNumericCellValue();
		System.out.println(data1);
		
		 
		///boolean data extract from excel file 
        FileInputStream file1=new FileInputStream("C:\\\\Users\\\\asus\\\\Documents\\\\facebooklogin.xlsx");
		boolean data2=WorkbookFactory.create(file1).getSheet("Sheet1").getRow(5).getCell(7).getBooleanCellValue();
		System.out.println(data2);
		
        //get last data present row in excel
		 
        FileInputStream file2=new FileInputStream("C:\\\\Users\\\\asus\\\\Documents\\\\facebooklogin.xlsx");
		int data3=WorkbookFactory.create(file2).getSheet("Sheet1").getLastRowNum();
		System.out.println(data3-1);
		
		//get cell number where data present in cell
		//return last cell num from particular row first get row number the find last cloumn for that row
		 FileInputStream file3=new FileInputStream("C:\\\\Users\\\\asus\\\\Documents\\\\facebooklogin.xlsx");
			int data4=WorkbookFactory.create(file3).getSheet("Sheet1").getRow(13).getLastCellNum();
			System.out.println(data4);
		
	}

}
