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
	void m1();
}
interface Demo2 extends Demo1,Demo
{
	void m2();
}
class Sample implements  Demo2

{
	public void m1(){
		System.out.println("Int A");
	}
	public void m2(){
		System.out.println("Int b");
	}
	public void m3(){
		System.out.println("Int b");
	}
}