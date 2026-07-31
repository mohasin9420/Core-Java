class Example29 
{
	int amount;
	Example29(int amount)
	{
		if(amount>=10000){
			System.out.println("Account created successfully");
		}
		else
		{
			throw new ArithmeticException("Invalid amount");
		}
		

	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Example29 obj = new Example29(3000);
	}
}
