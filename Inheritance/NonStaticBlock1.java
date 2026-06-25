class NonStaticBlock1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		B obj = new B();

	}
}
class A
{
	{
		System.out.println("In non static block in A");
	}
}
class B extends A
{
	{
		System.out.println("In non static block in B");
	}
}
