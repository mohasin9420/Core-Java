class  Inheritance3
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		B obj = new B ();
		obj.show();
	}
}
class A
{
    int a = 10;
}

class B extends A
{
    int a = 20;                          

    void show()
    {
        System.out.println(a);       // 20
        System.out.println(this.a);  // 20
        System.out.println(super.a); // 10
    }
}