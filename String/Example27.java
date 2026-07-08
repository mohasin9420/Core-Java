import java.util.StringTokenizer;
class Example27 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		String str="this, is example, of String tokenizer";
		StringTokenizer st1=new StringTokenizer(str,",");

		while(st1.hasMoreElements()){
			System.out.println(st1.nextElement());
		}

	}
}
