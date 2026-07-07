class Example1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		B obj = new B();
		obj.set(12,11);
		System.out.println(obj.get());
	}
}
class B
{
	private int a;
	private int b;

	public void set(int a,int b){
		this.a=a;
		this.b=b;
	}
	public int get(){
		return a;
	}
}
