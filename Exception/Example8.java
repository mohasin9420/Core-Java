class Example8
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		try{
			System.out.println("inside try block");
			System.out.println(10/2);
		}
		catch(NullPointerException ae){
			System.out.println("inside catch block");
			System.out.println(10/2);
		}
		System.out.println("Hello end!");

	}
}
