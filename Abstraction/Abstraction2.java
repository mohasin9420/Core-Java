class Abstraction2 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		A onj = new B();
		onj.m1();
	}
}
// business logic
abstract class A
{
	abstract void m1();
}
class B extends A
{
	 void m1(){
		System.out.println("A");
	}

}

