class NonStaticMethod1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		NonStaticMethod1 obj =new NonStaticMethod1();
		obj.m1();
	}
	void m1(){
		System.out.println("Inside the m1");
	}
}
