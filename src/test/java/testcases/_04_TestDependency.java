package testcases;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _04_TestDependency {
    
    @Test(priority = 1)
    public void userRegisteration() {
	System.out.println("Executing userRegisteration @Test");
	Assert.fail("userRegisteration failed");
    }
    
    @Test(priority = 2, dependsOnMethods = "userRegisteration")
    public void logIn() {
	System.out.println("Executing login @Test");
    }
    
    @Test(priority = 3)
    public void search() {
	System.out.println("Executing search @Test");
	SoftAssert objSoftAssert = new SoftAssert();
	AssertJUnit.fail("saerch failed");
	objSoftAssert.assertAll();
    }
    
    @Test(priority = 4, dependsOnMethods = "search")
    public void openPDP() {
	System.out.println("Executing openPDP @Test");
    }
    
    @Test(priority = 5, dependsOnMethods = "search", alwaysRun = true)
    public void addToBag() {
	System.out.println("Executing addToBag @Test");
    }
    
    
}
