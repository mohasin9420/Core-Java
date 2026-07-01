class Assintment2
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		A obj = new D();
		obj.m1();
		obj.m2();
		obj.m3();
	}
}
interface A
{
	void m1();
	void m2();
	void m3();
}
abstract class B  implements A
{
	public void m1(){
		System.out.println("In m1 method B");
	}
}
abstract class C extends B
{
	public void m2(){
		System.out.println("In m1 method C");
	}
}
class D extends C
{
	public void m3(){
		System.out.println("In m1 method D");
	}
}