package TDDpackege.TechnicalAssessmentForIncubyte;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

private static int add(final String numbers, final String delimiter) {
	 
    int returnValue = 0;
    System.out.println("delimiter" + delimiter);
    String[] numbersArray = numbers.split(delimiter);
    for (String number : numbersArray) {
        if (!number.trim().isEmpty()) {
            returnValue += Integer.parseInt(number.trim());
        }
    }
    System.out.println("returnValue" + returnValue);
    return returnValue;
	}
	public static int add(String numbers)
	{
		if(numbers.length() == 0 )
			return 0;
		else if(numbers.length() == 1)
		{
			return Integer.parseInt(numbers);
		}else if(numbers.length() >= 2 )
		{
			 String delimiter = ",|n";
			    String numbersWithoutDelimiter = numbers;
			    if(numbers.startsWith("//[")){
			    	int delimiterIndex = numbers.indexOf("//[") + 3;
			    	 System.out.println("delimiterIndex" + delimiterIndex );
			        delimiter = numbers.substring(delimiterIndex, delimiterIndex + 3);
			        
			        numbersWithoutDelimiter = numbers.substring(numbers.indexOf("n") + 1);
			    System.out.println("delimiter" + delimiter );
			    System.out.println("numbersWithoutDelimiter" + numbersWithoutDelimiter);
			    return add(numbersWithoutDelimiter, delimiter); 
			    	
			    } else if (numbers.startsWith("//")) {
			        int delimiterIndex = numbers.indexOf("//") + 2;
			        System.out.println("delimiterIndex" + delimiterIndex );
			        delimiter = numbers.substring(delimiterIndex, delimiterIndex + 1);
			        
			        numbersWithoutDelimiter = numbers.substring(numbers.indexOf("n") + 1);
			    System.out.println("delimiter" + delimiter );
			    System.out.println("numbersWithoutDelimiter" + numbersWithoutDelimiter);
			    return add(numbersWithoutDelimiter, delimiter); 
			    }
			    
			    else 
			    {
			    	System.out.println("numbers is "+ numbers);
					numbers = numbers.replaceAll("\\r\\n|\\r|\\n", ",");;
					System.out.println("numbers is "+ numbers);
					  String[] numbersArray = numbers.split(",");
					 List<Integer> negativeNumbers = new ArrayList<Integer>();
					int Totalsum = 0; 
					for (String number : numbersArray) { // after refactoring for negative number 
				        if (!number.trim().isEmpty()) {  
				        	int num = Integer.parseInt(number);
				        	if(num<0)
				        		negativeNumbers.add(num) ;
				        	else if(num > 1000) // after refactoring for bigger than 1000
				        	{
				        		num = num % 1000 ; 
				        	}
				        	Totalsum += num;
				        	
				        }
				    }
					System.out.println(negativeNumbers.toString());
					if(negativeNumbers.size() > 0)
					{
						 throw new RuntimeException("Negatives not allowed: " + negativeNumbers.toString());
					}
					System.out.println(Totalsum);
					 return Totalsum ; 
			    }
		}
		return -1;
		
	}

}
