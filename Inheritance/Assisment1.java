class Assisment1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		new B();
		new B();
	}
}
class A extends Object
{
    static
    {
        System.out.println("A Static");
    }

    {
        System.out.println("A NSB");
    }

    A()
    {
        System.out.println("A Constructor");
    }
}

class B extends A
{
    static
    {
        System.out.println("B Static");
    }

    {
        System.out.println("B NSB");
    }

    B()
    {
        System.out.println("B Constructor");
    }
}