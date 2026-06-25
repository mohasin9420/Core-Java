class ReturnType1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		B obj = new B();
		obj.display();
		
	}
}
class A
{
    A display()
    {
        return new A();
    }
}

class B extends A
{
    B display()
    {
        return new B();
    }
}
