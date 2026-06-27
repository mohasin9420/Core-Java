class  Example5
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	/*	A obj =new C();
		 obj.m1();
		 B b1=(B)obj;
		 b1.m2();
		 C c1=(C)b1;
		 c1.m3();
		 */
		Sample.test(new C());
		 
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
	void m2(){
		System.out.println("In B");
	}
}
class C extends B
{
	int b = 33;
	void m3(){
		System.out.println("In C");
	}
}
class Sample 
{
	static void test(A obj){
		obj.m1();
		
	}
}
