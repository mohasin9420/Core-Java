class Upcasting 
{
	public static void main(String[] args) 
	{
		A obj=new B();
		System.out.println(obj.a);
		//System.out.println(obj.b);
		obj.m1();
		
	}
}
class A
{
	int a=199;
	void m1(){
		System.out.println("In A");
	}
}
class B extends A
{
	int b = 33;
	void m1(){
		System.out.println("In B");
	}
}
// without implementing overriding  we enable to perform upcasting and downcasting 