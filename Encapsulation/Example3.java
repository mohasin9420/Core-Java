class  Example3
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		BankOppration obj = new BankAcc();
		//obj.Validatebal();
		obj.deposite(20000);
		obj.withdraw(10000);
		obj.showbal();
		//BankOppration.display();
		obj.display();


	}
}
interface BankOppration
{
	void deposite(int amount);
	void withdraw(int amount);
	void showbal();
	default void display(){
		System.out.println("parent");
	}
	

}
class BankAcc implements BankOppration
{
	    int balnce;
	   public boolean Validatebal(){
		if(balnce>0){
			return true;
		}
		else {
			return false;
		}
	}
		public void deposite(int amount){
			this.sum(amount);
		}
		public void withdraw(int amount){
			this.sub(amount);
		}
		public void showbal(){
			System.out.println(this.balnce);
		}

		public void sum(int a){
			 this.balnce+=a;
		}

		public void sub(int a){
			 this.balnce-=a;
		}
			
			 public void display(){
		     BankOppration.super.display();
	}




}

