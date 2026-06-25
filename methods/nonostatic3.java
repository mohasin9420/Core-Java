class A

{
	int x=100;
}

class B
{
	int y;

}

class nonostatic3
{
	
	public static void main(String[] mohasin) 
	{
		 
		System.out.println("Hello World!");

		A obj =new A();
		B obj1 =new B();
		int result = obj.x + obj1.y;
		System.out.println(result + " Result is  " );

	}
}
