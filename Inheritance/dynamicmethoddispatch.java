class dynamicmethoddispatch 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		A obj = new B();
		obj.show();

	}
}
class A
{
	public void show(){
		System.out.println("In the A Show");
	}
}
class B extends A
{
	@Override
		public void show(){
		super.show();
			System.out.println("int B");
		}
}
