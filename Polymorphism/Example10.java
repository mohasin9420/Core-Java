class Example10
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		RBI cust1=new HDFC();
		cust1.loans();
		RBI cust2 =new YES();
		cust2.loans();
	}
}
class RBI 
{
	void loans(){
		System.out.println("Min RBI as 7%");
	}
}
class SBI extends RBI
{
	void loans(){
    System.out.println("MIN INtersent 15.44%");
	}
}
class HDFC extends RBI
{
	void loans(){
    System.out.println("MIN INtersent 20%");

}
}
class YES extends RBI
{
	//void loans(){
  //  System.out.println("MIN INtersent 22%");

//}
}