class Overriding1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		B obj = new B();
		obj.m1();
	}
}
class A
{
	void m1(){
		System.out.println("A");
	}
}
class B extends A
{
	void m1(){
		System.out.println("B");
	}
}