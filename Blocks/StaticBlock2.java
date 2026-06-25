class StaticBlock2
{
    public static void main(String[] args)
    {
        System.out.println("Inside main");
        System.out.println(Demo.x);
        System.out.println("Inside main out");
    }
}

class Demo
{
    static int x = 10;

    static
    {
        System.out.println("Static Block");
    }
}