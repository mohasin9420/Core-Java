class Overloading2 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		A obj = new A();
		new A(12);
		new A(14,33);
		
	}
}
class A
{
	A(){
		System.out.println("in A Constructor 0");
	}
	A(int a){
		System.out.println("in A Constructor 1");
	}
	A(int a , int b){
		System.out.println("in A Constructor 2");
	}
}
