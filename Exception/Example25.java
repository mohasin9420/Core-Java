import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
class Example25 
{
	static void m1() throws FileNotFoundException,IOException
	{
		FileInputStream obj=new FileInputStream("D:\\All in one\\Core Java\\Exception\\ms.txt");
		obj.read();
		obj.close();
	}
	public static void main(String[] args) throws FileNotFoundException,IOException
	{
		System.out.println("Hello World!");
		m1();
	}
}
