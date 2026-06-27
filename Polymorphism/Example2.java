class Example2 
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
		//C obj =new C();
		return new C();
		
	}
}
	class B extends A
	{
		public C m1(){
			System.out.println("In B");
			//C obj =
			return new C();
		}
	}
	// it is possible to override oveeriding method return type and overriden method return type is same at class level
   // if parent class return parent type  and child class method child types such return types are called as coverint types 