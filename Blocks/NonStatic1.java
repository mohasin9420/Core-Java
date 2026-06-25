class NonStatic1 
{
	int a =10;
	float b=20;
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		NonStatic1 obj = new NonStatic1();
		System.out.println(obj.a);
		System.out.println(obj.b);
	}
}
