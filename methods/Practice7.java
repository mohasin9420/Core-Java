class  Practice7
{
	public static void main(String[] args) 
	{
		System.out.println("insidde main");
		Practice7 obj3 = new Practice7();
		obj3.m1();
		m3();

	}
	  void m1(){
		System.out.println("insidde m1");
		demo obj1 = new demo();
		System.out.println(obj1.a);
		obj1.m2();
		
		
	}

	static void m3(){
		System.out.println("insidde m3");
		demo obj2 = new demo();
		System.out.println(obj2.a);
		obj2.m2();
	}
}
class demo
{
	int a=100;
	static void m2(){
		System.out.println("insidde m2 in other class");
	}
}
