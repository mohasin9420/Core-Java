class Test2
{
    public static void main(String[] args)
    {
        Child obj = new Child();
    }
}
class Parent
{
    Parent(int a)
    {
        System.out.println(a);
    }
}

class Child extends Parent
{
    Child()
    {
        super(100);
        System.out.println("Child");
    }
}
