class Inheritance5 
{
	public static void main(String[] args) 
	{
		Child obj = new Child();
		
	//	Child obj1 = new Child(10);
		
	}
}
class Parent
{
	Parent(){
		this(12);
		System.out.println("In SIngle Parent ");
		
	}
	Parent(int a){
		System.out.println("In Multi Parent ");
	}
}
class Child extends Parent
{
	Child(){
		this(10);
		System.out.println("In SIngle chiled ");
		
	}
	Child(int a){
	//	super(12);
		System.out.println("In Multi child ");
		
	}
}
