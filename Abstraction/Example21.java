class Example21
{
    public static void main(String[] args)
    {
        C obj = new Demo();

        obj.m1();
        obj.m2();
        obj.m3();
    }
}

interface A
{
    void m1();
}

interface B
{
    void m2();
}

interface C extends A, B
{
    void m3();
}

class Demo implements C
{
    public void m1()
    {
        System.out.println("In A");
    }

    public void m2()
    {
        System.out.println("In B");
    }

    public void m3()
    {
        System.out.println("In C");
    }
}