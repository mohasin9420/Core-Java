class Example34
{
	public static void main(String[] args) // throws FlightNotAvailableException
	{
		System.out.println("Hello World!");
		Mmt cust1=new Mmt();
		try
		{
			cust1.cheakdist("Bangolore");
		}
		catch (FlightNotAvailableException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
class Mmt
{
	String dist="Bangolor3e";

	Mmt()
	{
		System.out.println("Account successfully crated at MakemyTrip");
		
	}
	void cheakdist(String custdistna) // throws FlightNotAvailableException
	{
		if (dist.equals(custdistna))
		{
			System.out.println("Flight are available");
		}
		else
		{
			//System.out.println("Flight are Currently Not Available");
			throw new FlightNotAvailableException("Flight are not avilable");
		}
		
	}

}

// this is example of the 0 arugument constructor unCheaked Exception