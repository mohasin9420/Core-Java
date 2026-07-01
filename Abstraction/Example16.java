class  Example16
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		BankInsurance obj = new BankInsurance();
		obj.Banking();
		obj.Finance();
		obj.Insurance();
	}
}
interface Bankapp
{
	void Banking();
	void Finance();
	void Insurance();
}
abstract class BankServer implements Bankapp
{
	public void Banking(){
		System.out.println("in Banking");
	}

}
abstract class BankFinance extends BankServer
{
	public void Finance(){
		System.out.println("In Finance");
	}
}
class BankInsurance extends BankFinance
{
	public void Insurance(){
		System.out.println("in Insurance");
	}
}