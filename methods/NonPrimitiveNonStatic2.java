class NonPrimitiveNonStatic2 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		Demo obj =new Demo();
		obj.refvar=new Demo();
	    obj.refvar.m1();
		System.out.println(obj.refvar.status);


	}
}
class Demo
{
	boolean status=true;
	void m1(){
		System.out.println("inside m1 ");
	}
	Demo refvar;

}
