class Multilevel 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		A obj = new A();
		System.out.println(obj.c);
		System.out.println(obj.b);
		System.out.println(obj.a);
	}
}

class A extends B
{
	int c=10;
}
class B extends C
{
	int b=10;
}
class C
{
	int a =10;
}