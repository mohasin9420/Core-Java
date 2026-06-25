class Inheritance4
{
	public static void main(String[] args) 
	{
		Child obj = new Child();
	

	}
}
class Parent
{
	Parent(){
		System.out.println("Parent Constructor");
	}
}
class Child extends Parent
{

	Child(){
		System.out.println("Childs Constructor");
	}
	

}
