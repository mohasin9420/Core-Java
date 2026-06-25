class Combo77
{
	int a = 10;

	void m1(){
		System.out.println("inside m1");
	}

	public static void main(String[] args)
	{
		Combo77 obj = new Combo77();
		obj.m2();
		System.out.println("Hello World!");
	}

	void m2(){
		System.out.println("inside m2");

		// Direct access
		System.out.println(a);
		m1();

		// Access using object
		Combo77 obj1 = new Combo77();
		System.out.println(obj1.a);
		obj1.m1();
	}
}