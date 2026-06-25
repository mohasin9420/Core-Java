class  NonStaticBlock
{

	NonStaticBlock(){
		System.out.println("Constructor ");

	}

	{
		System.out.println("in instatic block");
	}
	{
		System.out.println("in instatic block-1");
	}
	public static void main(String[] args) 
	{
		System.out.println("Start Main");
		NonStaticBlock obj = new NonStaticBlock();
		NonStaticBlock obj1 = new NonStaticBlock();
		NonStaticBlock obj2 = new NonStaticBlock();
		System.out.println("End Start!");
	}
}
