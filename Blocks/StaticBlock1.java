class StaticBlock1 
{
	static int x;
	static{
		x=100;
		System.out.println("Static Block Excuted");
	}
	public static void main(String[] args) 
	{
		System.out.println(x);
	}
}
