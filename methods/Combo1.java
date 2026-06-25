class Combo1 
{
	static int a=10;
	static void m1(){
		System.out.println("inside m1" );
	}
	public static void main(String[] args) 
	{
		//how to accisible 

		// direct 
		System.out.println(a);
		// class name 
		System.out.println(Combo1.m1);
		// object
		Combo1 obj = new Combo1();
		System.out.println(obj.m1);
		
	}
}
