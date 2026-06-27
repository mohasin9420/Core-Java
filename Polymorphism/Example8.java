class Example8
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		A obj =new B(); // upcasting
		B obj1=(B)obj;  // downcating
		obj.m1();
		obj.m2();
		obj1.m2();
		//obj1.m4();
	}
}
class A
{
	void m1(){
		System.out.println("In A");
	}
	static void m2(){
		System.out.println("in M2");
	}
}
class B extends A
{
	void m1(){
		System.out.println("In B");
	}
	static void m2(){
		System.out.println("in M2 child");
	}
}
// in method overriding there is no concept of upcasting and down casting
//witount overriding prefernce will give the parent but the cocncept of overriding preference will give th child 
// it is possible to ovverride non static method as it it founded by obj  but it not possible to override  static as it is bounded by 
// 