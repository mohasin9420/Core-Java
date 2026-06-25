class Test3 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Child obj=new Child();
		obj.show();
		obj.display();
	}
}
class Parent
{
    void show()
    {
        System.out.println("Parent");
    }
}

class Child extends Parent
{
    void show()
    {
        System.out.println("Child");
    }

    void display()
    {
        show();
        super.show();
    }
}
