class Example11 extends Demo
{
	static{
		System.out.println("in  static block in exapmle ");
	}
	public static void main(String[] args) 
	{
	 new Example11();
		
		System.out.println("Hello World!");
	}
}

abstract class Demo
{
	static{
		System.out.println("in  static block Demo");
	}
	

}
