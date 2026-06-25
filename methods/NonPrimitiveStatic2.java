class NonPrimitiveStatic2 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Demo.refvar = new Demo();
		Demo.refvar.m1();
		System.out.println(Demo.refvar.a);
	}
}
class Demo
{
	int a=100;
	void m1(){
		System.out.println("inside m1");
	}
	static Demo refvar;
}
