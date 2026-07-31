class Example11
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int [] arr=new int[3];
		try{
			System.out.println("inside try block");
			System.out.println(10/2);
			System.out.println(arr[4]);
		}
		catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("inside catch block");
			System.out.println(10/2);
		}
		System.out.println("Hello  end!");

	}
}
