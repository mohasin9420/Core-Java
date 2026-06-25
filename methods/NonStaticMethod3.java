class NonStaticMethod3 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Cyber obj =new Cyber();
		obj.m1();
		obj.m2();
	}

}

class Cyber

{
	void m1(){
		System.out.println("Inside the m1");
	}
	void m2(){
		System.out.println("Inside the m2");
	}

}
	

