class Example11
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		RBI cust1=new SBI();
		cust1.loans();
	}	
}
class RBI 
{
	default void loans(){
		System.out.println("Min RBI as 7%");
	}
}
class SBI extends RBI
{
	 default void loans(){
       System.out.println("MIN INtersent 15.44%");
	}
}
/*
: modifier default not allowed here
        default void loans(){
                     ^
					 */