class Example33
{
	public static void main(String[] args) // throws BusNotAvailableException
	{
		System.out.println("Hello World!");
		Redbus cust1=new Redbus();
		try
		{
			cust1.cheakdist("Bangolore");
		}
		catch (BusNotAvailableException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
class Redbus
{
	String dist="Bangolor3e";

	Redbus()
	{
		System.out.println("Account successfully crated at redbuss");
		
	}
	void cheakdist(String custdistna) // throws BusNotAvailableException
	{
		if (dist.equals(custdistna))
		{
			System.out.println("bus are available");
		}
		else
		{
			//System.out.println("bus are Currently Not Available");
			throw new BusNotAvailableException();
		}
		
	}

}

// this is example of the 0 arugument constructor unCheaked Exception