class NonPrimitiveNonStatic 
{
	char x='x';
	void m1(){
		System.out.println("inside m1 ");
	}
	NonPrimitiveNonStatic refvar;
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		NonPrimitiveNonStatic ref = new NonPrimitiveNonStatic();
		ref.refvar=new NonPrimitiveNonStatic();
		ref.refvar.m1();
		System.out.println(ref.refvar.x);

	}
}
