class Example4 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Hdfcapp obj = new B(12000);
		obj.cheakpinformat(4);
		obj.getbalnce();


	}
}

abstract class Hdfcapp
{
	void cheakpinformat(int pin){
		if(pin==4){
			System.out.println("Login Successfull");
		}
		else
		{
			System.out.println("unable login");
		}

	}
	abstract void getbalnce();
}
class B extends Hdfcapp
{
	int bal;
	B(int bal){
		this.bal=bal;
	}
	void getbalnce(){
		System.out.println(bal);
	}
}