class Example21 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	
	try
	{
		System.out.println("in the try block");
		int a=10/0;

	}
	catch (ArithmeticException aa)
	{

		System.out.println("in catch vlock");
	}
	finally{
		try
		{
			System.out.println("in the finally try block");
			int v=10/0;
			
		}
		catch (ArithmeticException ad)
		{
			System.out.println("in the finally catch block");
		}
		
	}
	}
}
