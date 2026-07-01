class  Example19
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Sample obj =new Sample();
		obj.m1();
		obj.m2();
		obj.m3();
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
class A
{
	void m3(){
		System.out.println("in m2");
	}
}
class Sample extends A implements Demo1,Demo

{
	public void m1(){
		System.out.println("Int A");
	}
	public void m2(){
		System.out.println("Int b");
	}
}