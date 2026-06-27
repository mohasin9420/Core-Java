class Example6 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		A obj =new B();
		obj.m1();
	}
}
class A
{
	void m1(){
		System.out.println("In A");
	}
	
}
class B extends A
{
	void m1(){
		System.out.println("In B");
	}
	
}
// in method overriding there is no concept of upcasting and down casting
//witount overriding prefernce will give the parent but the cocncept of overriding preference will give th child 
//