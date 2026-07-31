class Example15 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int arr[]=new int[4];
		try
		{
			System.out.println("Inside try");
			try
			{
				System.out.println("Inside inner try");
				arr[5]=12;
			}
			catch (ArrayIndexOutOfBoundsException ae )
			{
				System.out.println("Inside inner catch");
				System.out.println("Exception array catch");
			}
			int res=10/0;
		}
		catch (ArithmeticException ab)
		{
			System.out.println("Inside catch");
			try
			{
				System.out.println("Inside catch try ");
				arr[5]=11;


				
			}
			catch (ArrayIndexOutOfBoundsException av)
			{
				System.out.println("Inside catch catch");
				System.out.println("Exception array catched");
			}

		}
	}
}
