class  Example15 
{
	
	public static void main(String[] args) 
	{
		Sample obj = new Sample();
		obj.m1();
		obj.m2();
		
	}
}

abstract class Demo implements A
{
	public void m1(){
		System.out.println("in m1");
	}
}
class Sample extends Demo
{
	public void m2(){
		System.out.println("in m2");
	}
}
interface A
{
	void m1();
	void m2();
}

