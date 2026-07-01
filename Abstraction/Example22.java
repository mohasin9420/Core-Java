class Example22
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		A obj = new B();
		obj.m1();
	}
}
interface A
{
	default void m1(){
		System.out.println("IN defalt");
	}
}
class B implements A
{

}
