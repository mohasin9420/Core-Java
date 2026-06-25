class NonStatic2 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		NonStatic obj = new NonStatic();
		System.out.println(obj.a);
	}
}
class NonStatic
{
	int a =10;
	int b=11;
}
