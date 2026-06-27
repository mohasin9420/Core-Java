class Example7
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		A obj =new B(); // upcasting
		B obj1=(B)obj;  // downcating
		obj.m1();
		obj.m2();
		obj1.m4();
	}
}
class A
{
	void m1(){
		System.out.println("In A");
	}
	void m2(){
		System.out.println("in M2");
	}
}
class B extends A
{
	void m1(){
		System.out.println("In B");
	}
	void m4(){
		System.out.println("in M4");
	}
}
// in method overriding there is no concept of upcasting and down casting
//witount overriding prefernce will give the parent but the cocncept of overriding preference will give th child 
//