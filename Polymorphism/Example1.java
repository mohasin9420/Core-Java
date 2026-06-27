class Example1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		B obj1 = new B();
		obj1.m1();
	}
}
class C
{
}
class A
{
	public C m1(){
		System.out.println("In A");
		C obj =new C();
		return obj;
		
	}
}
	class B extends A
	{
		public C m1(){
			System.out.println("In B");
			C obj =new C();
			return obj;
		}
	}
	// it is possible to override oveeriding method return type and overriden method return type is same at class level
