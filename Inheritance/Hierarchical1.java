class Hierarchical1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		B obj = new B();
		C obj1 = new C();
		System.out.println(obj.a + "in c" + obj1.a);
	}
}
class A
{
	int a=10;
}

class B extends A
{
}
class C extends A
{
}
