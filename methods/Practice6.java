class Practice6 
{
	public static void main(String[] args) 
	{
		System.out.println("Inside main");
		int a=10;
		float b=20.5f;
		Practice6 obj1 = new Practice6();
		int result1=obj1.m1(a);
		float result2 =m2(b);
		float finalresult=result1 + result2;
		System.out.println("The Final Result" +finalresult);
	}
	int m1(int a){
		System.out.println("Inside m1");
		Practice6 obj = new Practice6();
		 int result1= a+100;
		return result1;
		
	}
	static float m2(float b){
		System.out.println("Inside m2");

		 float result2= b+200.5f;
		return result2;
	}
}
