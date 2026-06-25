class Combo5 
{

	 static int a =100;
	 static void m1(){
		System.out.println("inside m1");
	}
	public static void main(String[] args) 
	{	


		System.out.println("Hello World!");
		Combo5 obj1 = new Combo5();
		obj1.m2();
		
	}

	void m2(){
		// direct access the members 
		System.out.println(a);
		m1();
		// classname
		System.out.println(Combo5.a);
		Combo5.m1();
		// obj creation 
		Combo5 obj2 = new Combo5();
		System.out.println(obj2.a);
		obj2.m1();


	}
}
