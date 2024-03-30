package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_Assertions {
    
    @Test
    public void validateStringsEqual() {
	String expectedTitle = "Sephora SEA";
	String actualTitle = "Sephora USA";
	
	Assert.assertEquals(actualTitle, expectedTitle, "Test case failed as strings are not same");
    }
    
    @Test
    public void validateBooleanEqual() {
	boolean true1 = true;
	Assert.assertTrue(true1, "Test case failed as it's not true");
	
    }

}
