class Assinment 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Demo obj = new Demo();
		obj.refvar=new Cyber();
		obj.retvar=new Success();
		obj.retvar.m1();
		System.out.println(obj.refvar.a);
	}
}

class Cyber
{
	float a=100.6f;
}
class Success
{
	void m1(){
		System.out.println("inside m1");
	}
}
class Demo
{
	  Cyber   refvar;
	  Success retvar;
}
