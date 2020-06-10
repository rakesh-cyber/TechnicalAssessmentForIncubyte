package TDDpackege.TechnicalAssessmentForIncubyte;

public class StringCalculator {

private static int add(final String numbers, final String delimiter) {
    int returnValue = 0;
    String[] numbersArray = numbers.split(delimiter);
    for (String number : numbersArray) {
        if (!number.trim().isEmpty()) {
            returnValue += Integer.parseInt(number.trim());
        }
    }
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
			    if (numbers.startsWith("//")) {
			        int delimiterIndex = numbers.indexOf("//") + 2;
			        delimiter = numbers.substring(delimiterIndex, delimiterIndex + 1);
			        numbersWithoutDelimiter = numbers.substring(numbers.indexOf("n") + 1);
			    
			    System.out.println("numbersWithoutDelimiter" + numbersWithoutDelimiter);
			    return add(numbersWithoutDelimiter, delimiter); 
			    }
			    else {
			    	System.out.println("numbers is "+ numbers);
					numbers = numbers.replaceAll("\\r\\n|\\r|\\n", ",");;
					System.out.println("numbers is "+ numbers);
					int Totalsum = 0; 
					for(int i = 0; i < numbers.length(); i++) 
					{ 
						char ch = numbers.charAt(i); 
						if (Character.isDigit(ch))  // only for number 
							Totalsum += Integer.parseInt(String.valueOf(ch)); 

					} 
					System.out.println(Totalsum);
					 return Totalsum ; 
			    }
		}
		return -1;
		
	}

}
