class Example31 
{
	public static void main(String[] args) // throws CurrentlyUnavilable
	{
		System.out.println("Hello World!");
		Flipcard cust1=new Flipcard();
		cust1.cheakMobile("Motorola 30");
	}
}
class Flipcard
{
	String Instock="Motorola edge";

	Flipcard()
	{
		System.out.println("Account successfully crated");
		
	}
	void cheakMobile(String custmobile) // throws CurrentlyUnavilable
	{
		if (Instock.equals(custmobile))
		{
			System.out.println("Mobile are available");
		}
		else
		{
			//System.out.println("Mobile are Currently Not Available");
			throw new CurrentlyUnavilable();
		}
		
	}

}

// this is example of the 0 arugument constructor Cheaked Exception