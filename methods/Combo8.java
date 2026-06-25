class Combo8 
{
	public static void main(String[] args) 
	{
	Combo8 obj1 = new Combo8();
	obj1.m2();
		
	}
	void m2(){
		System.out.println("inside m2");

		// Access using object
		A obj1 = new A();
		System.out.println(obj1.a);
		obj1.m1();
}
}

class A 
{	
	int a = 10;

	void m1(){
		System.out.println("inside m1");
	}


}

	