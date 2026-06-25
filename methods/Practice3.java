class Practice3 
{
	public static void main(String[] args) 
	{	
		Cyber obj=new Cyber();
		Sucess obj1 = new Sucess();
		float result= obj.a + Sucess.b;
		System.out.println(result);
		obj.m1();
		Sucess.m2();

		
	}

}

class Cyber

{
	int a=10;
	void m1(){
		System.out.println("Inside the  cyber m1");
	}
	

}

class Sucess

{
	static float b=10.5f;
	 static void m2(){
		System.out.println("Inside the  sucess m2");
	}

}
	

