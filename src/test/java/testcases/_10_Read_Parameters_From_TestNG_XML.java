package testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utility.ExcelReader;

public class _10_Read_Parameters_From_TestNG_XML {
    
    public static ExcelReader excel = null;
    
    @Parameters({"browser", "suite"})
    @Test
    public void login1(String browser, String suite) {
	System.out.println("browser is " + browser + " and suite is " + suite);
	
    }    
}
