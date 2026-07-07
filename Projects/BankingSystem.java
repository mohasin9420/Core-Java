abstract class Account
{
    private int accountNo;
    private String holderName;
    protected double balance;

    Account(int accountNo, String holderName, double balance)
    {
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount)
    {
        balance += amount;
        System.out.println(amount + " Deposited Successfully");
    }

    abstract void withdraw(double amount);

    public void showBalance()
    {
        System.out.println("---------------------------");
        System.out.println("Account No : " + accountNo);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance    : " + balance);
    }
}

class SavingsAccount extends Account
{
    SavingsAccount(int accountNo, String holderName, double balance)
    {
        super(accountNo, holderName, balance);
    }

    @Override
    void withdraw(double amount)
    {
        if(balance - amount >= 1000)
        {
            balance -= amount;
            System.out.println("Withdrawal Successful.");
        }
        else
        {
            System.out.println("Minimum balance should be 1000.");
        }
    }
}

class CurrentAccount extends Account
{
    CurrentAccount(int accountNo, String holderName, double balance)
    {
        super(accountNo, holderName, balance);
    }

    @Override
    void withdraw(double amount)
    {
        if(balance - amount >= -5000)
        {
            balance -= amount;
            System.out.println("Withdrawal Successful.");
        }
        else
        {
            System.out.println("Overdraft Limit Exceeded.");
        }
    }
}

class FixedDepositAccount extends Account
{
    FixedDepositAccount(int accountNo, String holderName, double balance)
    {
        super(accountNo, holderName, balance);
    }

    @Override
    void withdraw(double amount)
    {
        System.out.println("Withdrawal Not Allowed Before Maturity.");
    }

    @Override
    public void deposit(double amount)
    {
        System.out.println("Additional Deposit Not Allowed.");
    }
}

public class BankingSystem
{
    public static void main(String[] args)
    {
        Account accounts[] = new Account[3];

        accounts[0] = new SavingsAccount(101, "Mohasin", 10000);
        accounts[1] = new CurrentAccount(102, "Rahul", 5000);
        accounts[2] = new FixedDepositAccount(103, "Amit", 50000);

        for(Account acc : accounts)
        {
            acc.showBalance();
            acc.deposit(2000);
            acc.withdraw(3000);
            acc.showBalance();
            System.out.println();
        }
    }
}