class Example5 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		HdfcFin obj = new HdfcFin();
	}
}
abstract class Hdfc
{
	abstract void banking();
	abstract void finance();
}
abstract class HdfcBank extends Hdfc
{
	void banking(){
		System.out.println("baking");
	}

}
class HdfcFin extends HdfcBank
{
	void finance(){
		System.out.println("finance");
	}
}
