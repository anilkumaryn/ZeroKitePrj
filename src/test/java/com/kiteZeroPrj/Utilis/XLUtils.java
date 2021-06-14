package com.kiteZeroPrj.Utilis;


import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtils {
	
	static String path=System.getProperty("user.dir");

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	//static workbook = new XSSFWorkbook("C://Users//ayeliyur//eclipse-workspace//ZeroKitePrj//src//test//java//com//ZeroKitePrj//testData//NSEdata.xlsx");
	//String xlpath="C://Users//ayeliyur//eclipse-workspace//ZeroKitePrj//src//test//java//com//ZeroKitePrj//testData//NSEdata.xlsx";
	//String sheetName="sheet1";
	
	//create a constructor to call from other functions and add agrs for xl path and sheet name 
	public XLUtils(String xlpath,String sheetName) {
		try {
			workbook = new XSSFWorkbook(xlpath);
			sheet=workbook.getSheet(sheetName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
/*	public static void main(String[] args) {
		
		getrowcount();
		getcelldataString(1, 0); 		
	}
	*/
	
	
	public static void  getrowcount() {
		
			int rowcount=sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows :"+rowcount);
			
	}
	 
	
	public static void getcelldataString(int rowNum, int colNum)
	{
		
		String Celldata= sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		System.out.println(Celldata);
		
		
		
	}
	
	
	public static void getcelldatanum(int rowNum, int colNum)
	{
		
		double Celldata= sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		System.out.println(Celldata);
		
	}
	
	
	
	
	/*------------------------
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;

	
	 
	public static int getRowCount(String xlfile,String xlsheet) throws IOException 
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		int rowcount=ws.getLastRowNum();
		//wb.close();
		fi.close();
		return rowcount;		
	}
	
	
	public static int getCellCount(String xlfile,String xlsheet,int rownum) throws IOException
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rownum);
		int cellcount=row.getLastCellNum();
	//	wb.close();
		fi.close();
		return cellcount;
	}
	
	
	public static String getCellData(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rownum);
		cell=row.getCell(colnum);
		String data;
		try 
		{
			DataFormatter formatter = new DataFormatter();
            String cellData = formatter.formatCellValue(cell);
            return cellData;
		}
		catch (Exception e) 
		{
			data="";
		}
		//wb.close();
		fi.close();
		return data;
	}
	
	public static void setCellData(String xlfile,String xlsheet,int rownum,int colnum,String data) throws IOException
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rownum);
		cell=row.createCell(colnum);
		cell.setCellValue(data);
		fo=new FileOutputStream(xlfile);
		wb.write(fo);		
	//	wb.close();
		fi.close();
		fo.close();
	}
	
----*/	
}
