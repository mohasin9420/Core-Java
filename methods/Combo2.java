class A
{
    static int a = 10;

    static void m2()
    {
        System.out.println("inside m2");
    }
}

class Combo2
{
    public static void main(String[] args)
    {
        // Access using class name
        A.m2();
        System.out.println(A.a);

        // Access using object
        A obj = new A();
        obj.m2();
        System.out.println(obj.a);
    }
}