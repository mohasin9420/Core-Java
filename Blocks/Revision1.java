class Revision1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Bank obj = new Bank(10000);
		
		obj.ShowBalance();
		
	}
}
class Bank
{
	int balance=0;
	
	static{
		System.out.println("Adhar kyc wii issued");
	}
	{
		System.out.println("Adhar kyc completed");
	}
	Bank(int balance){
		this.balance=this.balance+balance;;
		System.out.println("Bank account created");
	}
	public void ShowBalance(){
		System.out.println("total amout " +balance );
	}

}
