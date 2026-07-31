import java.util.Scanner;

class InvalidMarksException extends Exception
{
    InvalidMarksException(String msg)
    {
        super(msg);
    }
}

class MarkCheak
{
    static void checkMarks(int marks) throws InvalidMarksException
    {
        if(marks < 0 || marks > 100)
        {
            throw new InvalidMarksException("Marks should be between 0 and 100.");
        }
        else
        {
            System.out.println("Valid Marks");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks : ");
        int marks = sc.nextInt();

        try
        {
            checkMarks(marks);
        }
        catch(InvalidMarksException e)
        {
            System.out.println(e.getMessage());
        }
    }
}