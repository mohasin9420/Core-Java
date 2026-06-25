class nonstaticvar2 
{	int a=10;
	float b=12.5f;
	boolean m=true;
	public static void main(String[] args) 
	{
		nonstaticvar2 ref1 = new nonstaticvar2();
		nonstaticvar2 ref2 = new nonstaticvar2();
		ref1.a=100;
		ref2.a=1000;

		System.out.println(ref1.a + " " + ref2.a + " " + ref1.m);
	}
}
