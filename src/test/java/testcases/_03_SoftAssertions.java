package testcases;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _03_SoftAssertions {
    
    @Test
    public void executionStoppedAfterAssertFailure() {
	System.out.println("Start");
	
	Assert.fail("Failed assertion");
	
	System.out.println("End");
    }
    
    @Test
    public void usingSoftAssertion() {
	String actualTitle = "Sephora SEA", expectedTitle = "Sephora USA";
	
	SoftAssert objSoftAssert = new SoftAssert();
	
	AssertJUnit.assertEquals(actualTitle, expectedTitle, "Test case failed as titles are not same");
	
	System.out.println("Printing after first softAssertion");
	
	Assert.assertEquals(true, false, "Test case failed true is not false");
	
	System.out.println("Printing after second softAssertion");
	
	objSoftAssert.assertAll();
    }

}
