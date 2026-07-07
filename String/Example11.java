class Example11 
{
	public static void main(String[] args) 
	{
		String str="mohasin";
		StringBuffer sb1= new StringBuffer(str);
		// constructor based approach
		System.out.println(sb1);
		System.out.println(str);
		sb1.reverse();
		System.out.println(sb1);

	}
}
