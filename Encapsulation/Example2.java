class Example2
{
    public static void main(String[] args)
    {
        ATM obj = new ATM();

        obj.withdraw(5000.0);

        System.out.println("Balance = " + obj.checkBalance());
    }
}

class ATM
{
    private double balance = 10000.0;

    public void withdraw(double amount)
    {
        if(amount <= balance)
        {
            balance -= amount;
            System.out.println("Withdraw Successfully");
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }

    public double checkBalance()
    {
        return balance;
    }
}