class Example1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		BankInfo obj = new BankInfo(4000);
		

	}
}
class BankInfo
{
	int accBalance;
	static String BankName="Central Bank of India";


BankInfo(int accBalance){
	if(accBalance>=5000){
	this.accBalance = accBalance;
	System.out.println(BankName + "In this bank Account will created And Balce is " + accBalance);
	}
	else{
		System.out.println("amount is low we need minimum deposite 5000");
	}
}

/*<!--  --><!-- public void GetInfo(){
	System.out.println(BankName + "In this bank Account will created And Balce is " + accBalance);
}
} -->
*/
}