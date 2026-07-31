import java.util.*;

class Example12
{
	public static void main(String[] args) 
	{
		int arr[]=new int[2];
		try
		{
			int result = 10 / 0;
			System.out.println(arr[4]);
		}
		
		catch (ArithmeticException ab)
		{
			System.out.println("in Exception ari");
			/*System.out.println(ab.toString());   // corrected
			System.out.println(ab.getMessage()); 
			ab.printStackTrace();
			*/
		}
		
		catch (Exception ar)
		{
			System.out.println("in Exception");
		}
	}
}

