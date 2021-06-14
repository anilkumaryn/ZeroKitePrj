package com.ZeroKitePrj.TestCase;

import java.io.IOException;

import org.openxml4j.document.spreadsheet.ExcelDocument;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.xml.XmlUtils;

import com.KitePrj.BaseClass.BaseClass;
import com.kiteZeroPrj.Utilis.XLUtils;

public class TC_Kite_ScriptDetails_02 extends BaseClass {
	
	
	
	public static void main(String[] args) {
		
		
		String path =System.getProperty("user.dir"); 
		XLUtils xl=new XLUtils("C://Users//ayeliyur//eclipse-workspace//ZeroKitePrj//src//test//java//com//ZeroKitePrj//testData//NSEdata.xlsx", "sheet1");
		xl.getrowcount();
		xl.getcelldataString(1, 1);
		
		
	}
	
	
	

}
