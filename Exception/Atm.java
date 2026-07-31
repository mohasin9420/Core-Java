import java.util.Scanner;

class InsufficientBalanceException extends RuntimeException
{
    InsufficientBalanceException()
    {
        super("Insufficient Balance.");
    }
}

class Atm
{
    static void withdraw(int balance, int amount)
    {
        if(amount > balance)
        {
            throw new InsufficientBalanceException();
        }

        System.out.println("Withdrawal Successful");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Balance : ");
        int balance = sc.nextInt();

        System.out.print("Enter Withdraw Amount : ");
        int amount = sc.nextInt();

        try
        {
            withdraw(balance, amount);
        }
        catch(InsufficientBalanceException e)
        {
            System.out.println(e.getMessage());
        }
    }
}