class Example22
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		try
{
    System.out.println("in the try block");
    System.exit(0);
    System.out.println(10/0); // Unreachable
}
catch (ArithmeticException e)
{
    System.out.println("catch");
}
finally
{
    System.out.println("finally");
}
	}
}
