class Example1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		//A obj = new A();
		B obj1=new B();
	}
}
 abstract class A
{
	abstract void m1();
}
class B  
{
}
class C
{
}
// if child class inherites abstracts methods and does not provide implementation child class beacome as abstract class to insure 
// child class not abstract child class provides implementations 
