class  Practice4
{	
	int a =10;
	static float b=20.5f;
	public static void main(String[] args) 
	{
		Practice4 obj= new Practice4();
		float result = obj.a + b;
		System.out.println(result);
		obj.add();
		obj.add1();
	}

	void add(){

		float res= a + Practice4.b;
		System.out.println(res);
	}
	void add1(){
		A obj = new A();
		int .res= obj.a+ obj.b;
		System.out.println(res);
	}
}

class A
{
	int a=10;
	int b=12;
}
