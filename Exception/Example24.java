class Example24 
{
	public static void main(String[] args) throws InterruptedException
	{
		m1();
		System.out.println("In last ");
		
	}
	static void m1() throws InterruptedException
	{
		System.out.println("in the m1");
		m2();
	}
	static void m2() throws InterruptedException
	{
		System.out.println("in the m2");
		m3();
	}
	static void m3() throws InterruptedException
	{
		System.out.println("in the m3");
		Thread.sleep(3000);
	}
}
