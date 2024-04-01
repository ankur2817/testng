package testcases;

import java.util.Date;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utility.ExcelReader;

public class _11_Parallel_Test {
    
    public static ExcelReader excel = null;
    
    @Parameters({"browser", "suite"})
    @Test
    public void login1(String browser, String suite) throws InterruptedException {
	
	Date d = new Date();
	System.out.println("browser is " + browser + " and suite is " + suite + "   " + d);
	Thread.sleep(2000);
    }    
}
