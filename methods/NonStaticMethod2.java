class NonStaticMethod2 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		NonStaticMethod2 obj =new NonStaticMethod2();
		obj.m1();
		obj.m2();
	}
	void m1(){
		System.out.println("Inside the m1");
	}
	void m2(){
		System.out.println("Inside the m2");
	}
}
