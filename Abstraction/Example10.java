class Example10 extends Demo
{
	{
		System.out.println("in Non static block in exapmle ");
	}
	public static void main(String[] args) 
	{
	 new Example10();
		
		System.out.println("Hello World!");
	}
}

abstract class Demo
{
	{
		System.out.println("in Non static block DEmo");
	}

}
