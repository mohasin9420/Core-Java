class NonPrimitiveNonStatic3 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
						
		Success obj=new Success();
		//Demo obj1=new Demo();
		obj.refvar = new Demo();
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

}
class Success
{
	 Demo refvar;
}
