class Practice8
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Success obj2 = new Success();
		obj2.m1();
		obj2.m2();
	}
}
class Cyber
{
	int a=100;
	static float b=200.5f;
}
class Success
{
	void  m1()
	{
		System.out.println("inside m1 in sucess");
		Cyber obj = new Cyber();
		float result  = Cyber.b + obj.a;
		System.out.println(result);
	}
	static void m2()
	{	Cyber obj1=new Cyber();
	    float result1= Cyber.b * obj1.a;
		System.out.println("inside m2 in success");
		System.out.println(result1);
	}
}
