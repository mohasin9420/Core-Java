class  Example18
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Sample obj =new Sample();
		obj.m1();
		obj.m2();
	}
}
interface Demo
{
	void m1();
}
interface Demo1 
{
	void m2();
}
class Sample extends Demo1,Demo

{
	public void m1(){
		System.out.println("Int A");
	}
	public void m2(){
		System.out.println("Int b");
	}
}