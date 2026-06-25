class NonPrimitiveStatic3
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");

        Demo.refvar = new Sample();

        Demo.refvar.m1();
        System.out.println(Demo.refvar.a);
    }
}

class Demo
{
    static Sample refvar;
}

class Sample
{
    int a = 100;

    void m1()
    {
        System.out.println(" ");
    }
}