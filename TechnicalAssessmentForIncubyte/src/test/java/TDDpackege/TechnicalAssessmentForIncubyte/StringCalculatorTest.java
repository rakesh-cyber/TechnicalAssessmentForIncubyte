package TDDpackege.TechnicalAssessmentForIncubyte;

import org.junit.Test;

import junit.framework.Assert;

public class StringCalculatorTest {
	/*
	@Test
    public  void addEmptyNumbers() {
		
		StringCalculator obj = new StringCalculator();
		
		Assert.assertEquals(0, obj.add(""));
        
    }
	@Test
    public  void AddStringContainOnlyOneElement() {
		
		StringCalculator str = new StringCalculator();
		
		Assert.assertEquals(1, str.add("1"));
        
    }
	@Test
    public  void AddStringContainTwoElement() {
		
		StringCalculator str = new StringCalculator();
		
		Assert.assertEquals(1+2, str.add("1,2"));
        
    }
	@Test
    public  void AddStringContainUnknownAmountOfNumbers() {
		
		StringCalculator str = new StringCalculator();
		
		Assert.assertEquals(1+2+6+7+8, str.add("1,2,6,7,8"));
        
    }*/
	@Test
    public  void AddStringContainNewLine() {
		
		StringCalculator str = new StringCalculator();
		
		Assert.assertEquals(1+2+3+4, str.add("1\n2,3,4"));
        
    }

}
