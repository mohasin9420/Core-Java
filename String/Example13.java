class Example13 
{
	public static void main(String[] args) 
	{
		String str = "madam";
		StringBuffer sb1=new StringBuffer(str);
		
		String str2=sb1.reverse().toString();

		if(str.equals(str2)){
			System.out.println("paledrone");
		}
		else{
			System.out.println(" not paledrone");
		}
		String str1 = "madama";
		StringBuffer sb2=new StringBuffer(str);
		
		String str3=sb2.reverse().toString();

		if(str1.equals(str3)){
			System.out.println("paledrone");
		}
		else{
			System.out.println("not paledrone");
		}
	}
}
