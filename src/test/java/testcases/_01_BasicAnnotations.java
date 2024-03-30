package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class _01_BasicAnnotations {
    
    @BeforeSuite
    public void beforeSuite() {
	System.out.println("Executing beforeSuite @BeforeSuite");
    }
    
    @AfterSuite
    public void afterSuite() {
	System.out.println("Executing afterSuite @AfterSuite");
    }
    
    @BeforeTest
    public void createDBConnection() {
	System.out.println("Executing createDBConnection @BeforeTest");
    }
    
    @AfterTest
    public void closeDBConnection() {
	System.out.println("Executing closeDBConnection @AfterTest");
    }
    
    @BeforeMethod
    public void launchBrowser() {
	System.out.println("Executing launchBrowser @BeforeMethod");
    }
    
    @AfterMethod
    public void closeBrowser() {
	System.out.println("Executing closeBrowser @AfterMethod");
    }
    
    @Test(priority = 2)
    public void logIn() {
	System.out.println("Executing login @Test");
    }
    
    @Test(priority = 1)
    public void userRegisteration() {
	System.out.println("Executing userRegisteration @Test");
    }
}
