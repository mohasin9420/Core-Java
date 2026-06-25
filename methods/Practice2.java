class Practice2 
{
	public static void main(String[] args) 
	{
		
		success obj2 = new success();
		success1 obj1= new success1();

		obj2.status=cyber.var1 + obj1.var2;
		
		System.out.println(obj2.status);
	}
}
class cyber
{
	static int var1=100;
}
class success

{
	 static float status;

}
class success1
{
float var2=200.4f;
}
