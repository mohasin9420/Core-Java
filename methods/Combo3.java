class Combo3
{
    int a = 100;

    void m1(){
        System.out.println("inside m1");
    }

    public static void main(String[] args)
    {
        Combo3 obj = new Combo3();

        System.out.println(obj.a);
        obj.m1();
    }
}