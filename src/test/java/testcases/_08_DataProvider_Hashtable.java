package testcases;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.ExcelReader;

public class _08_DataProvider_Hashtable {
    
    public static ExcelReader excel = null;
    
    @Test(dataProvider="getData1")
    public void login1(Hashtable<String, String> ht) {
	System.out.println("username is " + ht.get("username") + " and password is " + ht.get("password"));
	
    }
    
    @DataProvider
    public Object[][] getData1() {
	
	if(excel == null)
	    excel = new ExcelReader("./src/test/resources/Book1.xlsx");
	
	Hashtable<String, String> objHashtable = null;
	
	String sheetName = "Sheet1";
	int rowCount = excel.getRowCount(sheetName);
	int columnCount = excel.getColumnCount(sheetName);
	Object[][] data = new Object[rowCount - 1][1];
	
	for(int i = 2; i <= rowCount; i++) {
	    objHashtable = new Hashtable<String, String>();
	    for(int j = 0; j < columnCount; j++) {
		objHashtable.put(excel.getCellData(sheetName, j, 1), excel.getCellData(sheetName, j, i));
		data[i-2][0] = objHashtable;
	    }	    
	}
	
	return data;
    }

}
