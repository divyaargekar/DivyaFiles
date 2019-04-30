package mavenUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	 private static XSSFSheet ExcelWSheet;

     private static XSSFWorkbook ExcelWBook;
     
     private static XSSFCell Cell;

     private static XSSFRow Row;

	public static  void setExcelfile(String path,String sheetName) throws IOException
	{
		try {
			FileInputStream Excelfile=new FileInputStream(path);
			ExcelWBook=		new  XSSFWorkbook(Excelfile);
			ExcelWSheet= ExcelWBook.getSheet(sheetName);



		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}

	public static String getcelldata(int rownum,int colnum)
	{
	Cell=	ExcelWSheet.getRow(rownum).getCell(colnum);
	String ReturnCellData=   Cell.getStringCellValue();
	 return ReturnCellData;
	}



	public static void SetCelldata(String Result,int rownum,int colnum) throws FileNotFoundException
	{
	Row=	ExcelWSheet.getRow(rownum);
		Cell=	Row.getCell(colnum);

		  if(Cell==null)
		  {
	Cell=		  Row.createCell(colnum);
	Cell.setCellValue(Result);
		  }
		  else
		  {
			  Cell.setCellValue(Result);
		  }
			try {
		  FileOutputStream fileOut = new FileOutputStream(Constants.Path_TestData + Constants.File_TestData);


				ExcelWBook.write(fileOut);

				fileOut.flush();

				fileOut.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


	}



}