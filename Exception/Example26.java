import java.io.FileInputStream;

class Example26
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
		m1();
    }

    static void m1()
    {
        try
        {
            System.out.println("in try block");
            FileInputStream txt = new FileInputStream("D:/All in one/Core Java/Exception/ms.txt");
            txt.read();
        }
        catch (Exception e)
        {
            System.out.println("in catch block");
        }
    }
}
