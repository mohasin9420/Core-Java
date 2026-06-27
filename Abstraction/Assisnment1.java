class Assisnment1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		B obj = new B(12);

	}
}
abstract class A
{
	A(){
		this(12);
		System.out.println("in Abstract 0 constructor ");
	}
	A(int a){
		System.out.println("in Abstract 1 constructor ");
	}
}
class B extends A
{
	B(){
		super();

		System.out.println("in B 0 constructor ");
	}
	B(int a){
		this();
		System.out.println("in B 1 constructor ");
	}
}








/* anstract class 
2 // 2 cons
// class 
// 2 con
*/
