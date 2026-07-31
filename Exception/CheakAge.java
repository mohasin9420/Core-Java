import java.util.Scanner;

class InvalidAgeException extends Exception
{
    InvalidAgeException()
    {
        super("Age must be 18 or above.");
    }
}

class CheakAge
{
    static void checkAge(int age) throws InvalidAgeException
    {
        if(age < 18)
        {
            throw new InvalidAgeException();
        }
        else
        {
            System.out.println("Eligible to vote.");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age : ");
        int age = sc.nextInt();

        try
        {
            checkAge(age);
        }
        catch(InvalidAgeException e)
        {
            System.out.println(e.getMessage());
        }
    }
}