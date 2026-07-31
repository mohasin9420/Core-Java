class  Example18
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		try
		{
			System.out.println("in ty block");
			int res=10/2;
		}
		catch (ArithmeticException aa)
		{
			//int d=10/0;
			System.out.println("in catch block");
		}
		finally{
			System.out.println("in finally block");
		}

	}
}
