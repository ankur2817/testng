package utility;

import java.util.Hashtable;

public class DataProvider {
    
    public static ExcelReader excel = null;
    
    
    @org.testng.annotations.DataProvider(name="dp1")
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
    
    @org.testng.annotations.DataProvider(name="dp2")
    public Object[][] getData2() {
	
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
