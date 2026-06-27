class Overriding3 
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
	static void m1(){
		System.out.println("A");
	}
}
class B extends A
{
	static void m1(){
		System.out.println("B");
	}
}			// static method cannot inheritance 					