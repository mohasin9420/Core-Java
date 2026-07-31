import java.util.Scanner;

class InvalidPasswordException extends RuntimeException
{
    InvalidPasswordException(String msg)
    {
        super(msg);
    }
}

class Password
{
    static void checkPassword(String password)
    {
        if(password.length() < 8)
        {
            throw new InvalidPasswordException("Password must contain at least 8 characters.");
        }

        System.out.println("Login Successful");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password : ");
        String password = sc.next();

        try
        {
            checkPassword(password);
        }
        catch(InvalidPasswordException e)
        {
            System.out.println(e.getMessage());
        }
    }
}