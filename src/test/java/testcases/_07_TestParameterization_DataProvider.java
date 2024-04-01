package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.ExcelReader;

public class _07_TestParameterization_DataProvider {
    
    public static ExcelReader excel = null;
    
    //@Test(dataProvider="getData")
    public void login(String username, String password) {
	System.out.println("username is " + username + " and password is " + password);
	
    }
    
    @Test(dataProvider="getData1")
    public void login1(String username, String password) {
	System.out.println("username is " + username + " and password is " + password);
	
    }
    
    @DataProvider
    public Object[][] getData() {
	Object[][] data = new Object[3][2];
	
	data[0][0] = "tom";
	data[0][1] = "tom123";
	data[1][0] = "mary";
	data[1][1] = "mary123";
	data[2][0] = "john";
	data[2][1] = "john123";
	
	return data;
    }
    
    @DataProvider
    public Object[][] getData1() {
	
	if(excel == null)
	    excel = new ExcelReader("./src/test/resources/Book1.xlsx");
	
	String sheetName = "Sheet1";
	int rowCount = excel.getRowCount(sheetName);
	int columnCount = excel.getColumnCount(sheetName);
	Object[][] data = new Object[rowCount - 1][columnCount];
	
	for(int i = 2; i <= rowCount; i++) {
	    for(int j = 0; j < columnCount; j++) {
		data[i-2][j] = excel.getCellData(sheetName, j, i);
	    }
	}
	return data;
    }

}
