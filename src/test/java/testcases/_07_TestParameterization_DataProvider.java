package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _07_TestParameterization_DataProvider {
    
    @Test(dataProvider="getData")
    public void login(String username, String password) {
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

}
