class  Constructor2
{
	Constructor2(){

		// default zero implements constructor

	}

	Constructor2(int a){
		System.out.println("the number " + a);
	}


	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Constructor2 obj = new Constructor2();
		Constructor2 obj2= new Constructor2(12);
	}
}
