class Practice5 
{
	int a=100;
	static float b=100.5f;
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Practice5 obj1 = new Practice5();
		obj1.m1();
	}

	void m1(){
		System.out.println("inside m1");

		float result =a+b;
		System.out.println(result);
	}
}
