class Example8 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		MB obj = new MB();
	}
}

abstract class Demo	

{
	Demo(){
		System.out.println("Constructot abstract");
	}
}
class MB extends Demo
{
	MB(){
		System.out.println("in mb");
	}
}
// we can create constructor wirhin abstract class but to execute that constructor 
// we need inherited that abstract class anothe class