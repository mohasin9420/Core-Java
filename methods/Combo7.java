class Combo7 
{	
	public static void main(String[] args) 
	{	
		System.out.println("Hello World!");
		Combo7 obj = new Combo7();
		obj.m2();

	}
	void m2(){
		// classname ,obj
		A.m1();
		System.out.println(A.m);

	}
}
class A
{
	static int m=100;
	static void m1(){	
		System.out.println("inside m1");
	}
}
