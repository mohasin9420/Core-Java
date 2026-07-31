class Example10 
{
	{
		System.out.println("2");
	}
	static{
		System.out.println("1");
	}
	Example10(){
		System.out.println("3");
	}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Example10 obj=new Example10();
		try
		{
			System.out.println(10/0);
		}
		catch (ArithmeticException ae )
		{
			try
			{
				System.out.println(10/0);
			}
			catch (ArithmeticException aa)
			{
				System.out.println("in catch block");
			}
		}
	}
}
