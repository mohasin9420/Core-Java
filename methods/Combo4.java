class Combo4
{
   

    public static void main(String[] args)
    {
        A obj = new A();
		
        System.out.println(obj.a);
        obj.m1();
    }
}
class A
{
	int a ;

    void m1(){
        System.out.println("inside m1");
    }
}