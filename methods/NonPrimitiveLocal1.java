class NonPrimitiveLocal1 
{
	int a=10;
	float b=20.5f;
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		NonPrimitiveLocal1 obj2 = m1();
		System.out.println(obj2.a + obj2.b);

	}

	static NonPrimitiveLocal1  m1(){
		NonPrimitiveLocal1 obj = new NonPrimitiveLocal1();
		System.out.println(obj.a + obj.b);
		return obj;
	}
}
