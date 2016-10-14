public class StringExamples 
{
	public static void main(String[] args)
	{
		// how to get ASCII value of char
		int i = 65; 
		char c = (char) i;
		System.out.println(c);
		
		char d = 'e';
		int j = (int) d;
		System.out.println(j);
		
		String s = "abc";
		String s1 = new String("abczazaz");
		String s2 = new String("abc");
		String s3 = new String("abz");
		
		System.out.println(s.compareTo(s1));
		System.out.println(s1.compareTo(s));
		System.out.println(s.compareTo(s2));
		System.out.println(s.compareTo(s3));
		
		System.out.println(s1.indexOf(s));
		System.out.println(s.indexOf(s1));
		
		System.out.println(s1.charAt(1));
		
		System.out.println("--------------");
		System.out.println(hasDigit("darle1n"));
	}
	
	/** 
	 * this method takes in a string and returns true if 
	 * the given string has a digit, return false otherwise
	 * @param s the given string to check 
	 * @return boolean true if it has a digit
	 */
	public static boolean hasDigit(String s)
	{
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) >= 48 && s.charAt(i) <= 57)
				return true;
		return false;
	}


}