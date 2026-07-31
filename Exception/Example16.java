class Example16 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		try
		{
			System.out.println("in try block !");
			int res=10/0;
		}
		catch (ArithmeticException aa)
		{
			System.out.println("in catch block");

		}
		finally{
			System.out.println("In finaaly block!");
		}
	}
}
