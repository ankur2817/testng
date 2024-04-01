package testcases;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.ExcelReader;

public class _09_Multiple_DataProvider {
    
    public static ExcelReader excel = null;
    
    @Test(dataProviderClass = utility.DataProvider.class, dataProvider="dp1")
    public void login1(Hashtable<String, String> ht) {
	System.out.println("username is " + ht.get("username") + " and password is " + ht.get("password"));
	
    }
    
    @Test(dataProviderClass = utility.DataProvider.class, dataProvider="dp2")
    public void login2(Hashtable<String, String> ht) {
	System.out.println("username is " + ht.get("username") + " and password is " + ht.get("password"));
	
    }
    
   

}
