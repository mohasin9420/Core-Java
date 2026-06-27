class  Example2
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		A obj =new B();
		obj.m1();
		obj.m2();
	}
}
 abstract class A
{
	abstract void m1();
	abstract void m2();
}
class B  extends A
{
	void m1(){
	System.out.println("in m1");
}
void m2(){
	System.out.println("in m2");
}
}
// example 5 within abstract class we can create both complete and incomplete method 
// hence abstract classes is not hifhrly abstract as it supposrt both complete and incomplete method 