class Example6 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		B obj = new B();
	}
}

 abstract class A
{
	int s=99;
}
class B extends A
{
	int b=98;
}
// in abstract method we not only create methods we also create variables 
// variables are not part ovrriding but theyy part of inheritance
// interview 