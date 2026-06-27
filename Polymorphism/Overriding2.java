class Overriding2
{
    public static void main(String[] args)
    {
        A obj = new B();   // Parent reference, Child object
        obj.m1();
    }
}

class A
{
    void m1()
    {
        System.out.println("A");
    }
}

class B extends A
{
    @Override
    void ()
    {
        System.out.println("B");
    }
}