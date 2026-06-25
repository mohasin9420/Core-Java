class  Practice1
{
	static int var1 = 100;
	float var2 = 200.5f;
	public static void main(String[] args) 
	{
		Practice1 obj = new Practice1();
		float result = var1 + obj.var2; // method 1
		float result1= Practice1.var1 + obj.var2; 
		System.out.println(result);
	}
}
