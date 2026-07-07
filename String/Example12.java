class Example12 
{
	public static void main(String[] args) 
	{
		StringBuffer sb1=new StringBuffer("mohasin");
		String str1=new String(sb1);
		//String str2=sb1;
		System.out.println(str1);
		String str2=sb1.toString();
		
		System.out.println(str2);
	}
}
