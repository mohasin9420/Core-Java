class Inheritance1 
{
	public static void main(String[] args) 
	{
		System.out.println("main Start");

		B obj = new B();
		System.out.println(obj.c);
		System.out.println(obj.a);
		System.out.println(obj.b);
	}
}
class A
{
	int a=10;

	float b=12.5f;
}
class B extends A
{
	char c='c';
}
