class Solution {
    public int reverse(int number) {
StringBuilder  reversedNumber = new StringBuilder();
				
		String numberInString = number + "";
		
		int counter = numberInString.length()-1;
		System.out.println("Number in String : "+numberInString);
		while (counter>0 ||(counter >=0 && number>0))
		{
            
			reversedNumber.append(numberInString.charAt(counter));
            --counter;
			
		}
		try {
		
			if (number>0)
				return Integer.parseInt(reversedNumber.toString());
			else 
				return Integer.parseInt("-"+reversedNumber.toString());
			
		}
		catch(Exception e)
		{
            System.out.println("Exception occured");
			return 0;
		}
    }
}