class Example4 
{
	public static void main(String[] args) 
	{
		String str1="cyber";
		String str2="Success";
		String str3="cyber";
		System.out.println(str1==str2);
		System.out.println(str2==str3);
		System.out.println(str3==str1);
		String str11=new String("cyber");
		String str22=new String ("Success");
		String str33=new String("cyber");
		System.out.println(str11==str22);
		System.out.println(str22==str33);
		System.out.println(str3==str11);
	}
}
