class  Example19
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		String str="resume.pdf";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='.'){
				System.out.println(str.substring(i+1));
				break;
				
			}
		}
		String str1 = "resuvgvgme.vhdf";

        System.out.println(str1.substring(str1.indexOf('.') + 1));
	}
}


// take a string resume.pdf
// output pdf 