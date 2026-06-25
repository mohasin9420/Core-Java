class NonPrimitiveStatic 
{
	static int a=100;
	static NonPrimitiveStatic  ref = new NonPrimitiveStatic();
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		System.out.println(ref.a);
	}
}
