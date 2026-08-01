class Example4 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Example4 obj=new Example4();
		Integer it1 =Integer.valueOf(100);
		System.out.println(it1); // -> WErapper Class overrides the method toString()
		System.out.println(obj); // from Object Class
	}
}
