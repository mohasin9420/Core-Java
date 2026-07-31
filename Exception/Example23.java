class Example23 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int b=10/0;
		try
		{
			System.out.println("in try block");
			int a=10/0;
			
		}
		catch (ArithmeticException aa)
		{
			System.out.println("in cacth block");
		}
		finally{
			System.out.println("in finally");
		}
	}

}
