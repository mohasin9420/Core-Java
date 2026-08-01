class  Example8
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int score = 500;

			// Method 1: The standard, cleanest way
			String s1 = String.valueOf(score);

			// Method 2: Using the specific Wrapper class method
			String s2 = Integer.toString(score);

			// Method 3: Lazy concatenation (Slower performance, but commonly used)
			String s3 = score + ""; 

	}
}
