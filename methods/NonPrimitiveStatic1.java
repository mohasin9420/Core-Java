class NonPrimitiveStatic1
{
    void m1()
    {
        System.out.println("inside m1");
    }
	 static int a;

    static NonPrimitiveStatic1 ref;

    public static void main(String[] args)
    {  a=100;
       // System.out.println("Hello World!"+ ref.a);
		
        ref = new NonPrimitiveStatic1();
        ref.m1();
		System.out.println("Hello World! "+ ref.a);
    }
}