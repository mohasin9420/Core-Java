class Staticmethod6

{
	public static void main(String[] args) 
	{
		System.out.println("main start");
		int x=10;
		float y=29.5f;
		float result=add(x,y);
		System.out.println(result);
		System.out.println("main end");
	}
	static float add(int x,float y){
		System.out.println("m1 start");
		float result = x+y;
		return  result;
}
}
