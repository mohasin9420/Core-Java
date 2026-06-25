class Combo6 
{
	public static void main(String[] args) 
	{
		Combo6 obj = new Combo6();
		obj.m2();
		System.out.println("Hello World!");
	}
	void m2(){
		// access here
		A obj1 =new A();
		System.out.println(obj1.x);
		obj1.m1();

	}
}
class A

{
	int x=10;
	void m1(){
		System.out.println("Inside m1");
	}

}

