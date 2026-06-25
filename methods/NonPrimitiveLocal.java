class NonPrimitiveLocal
{
    int a = 10;
    float b = 10.5f;

    public static void main(String[] args)
    {
        System.out.println("Hello World!");

        NonPrimitiveLocal ref = new NonPrimitiveLocal();
        System.out.println(ref.a + ref.b);

        m1(ref);
    }

    static void m1(NonPrimitiveLocal ref1)
    {
        System.out.println(ref1.a + ref1.b);
    }
}