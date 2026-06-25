class Example2 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		BankAccount acc1=new BankAccount(1234567890,0,"Mohasin Shaikh");
		acc1.deposit(10000);
		acc1.deposit(10000);
		acc1.displayAccount();
		acc1.showTotalAccounts();
		BankAccount acc2=new BankAccount(1234543210,0,"Samir Shaikh");
		acc2.deposit(5000);
		acc2.deposit(10000);
		acc2.displayAccount();
		acc2.showTotalAccounts();
	}
}


class BankAccount {

    long accountNumber;
    String holderName;
    int balance;

    static String bankName = "Central Bank of India";
    static int totalAccounts = 0;

    BankAccount(long accountNumber, int balance, String holderName) {

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.holderName = holderName;

        totalAccounts++;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void displayAccount() {

        System.out.println("Bank Name : " + bankName);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name : " + holderName);
        System.out.println("Balance : " + balance);
    }

    static void showTotalAccounts() {
        System.out.println("Total Accounts : " + totalAccounts);
    }
}