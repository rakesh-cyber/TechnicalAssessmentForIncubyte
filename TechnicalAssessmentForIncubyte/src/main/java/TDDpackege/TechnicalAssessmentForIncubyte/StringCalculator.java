package TDDpackege.TechnicalAssessmentForIncubyte;

public class StringCalculator {
	
	public static int add(String numbers)
	{
		if(numbers.length() == 0 )
			return 0;
		else if(numbers.length() == 1)
		{
			return Integer.parseInt(numbers);
		}else if(numbers.length() >= 2 )
		{
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
		return -1;
		
	}

}
