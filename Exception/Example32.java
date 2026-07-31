class Example32 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Flipcard cust1=new Flipcard();
		cust1.cheakStock(11);

	}
}
class Flipcard
{
	int mobilestock=10;
	Flipcard()
	{
		System.out.println("Account Created Successfully");

		
	}
	void cheakStock(int custreq)
		{
		    if(custreq<=mobilestock)
		     {
			System.out.println("Requirment fullfilled");
		     }
		    else
			{
		  /// System.out.println("OutofStock");
		         throws new OutOfStock("OutofStock");
	         }
       }
}
