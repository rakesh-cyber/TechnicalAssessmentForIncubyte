package TDDpackege.TechnicalAssessmentForIncubyte;

import org.junit.Test;

import junit.framework.Assert;

public class StringCalculatorTest {
	@Test
    public  void addEmptyNumbers() {
		
		StringCalculator obj = new StringCalculator();
		
		Assert.assertEquals(0, obj.add(""));
        
    }

}
