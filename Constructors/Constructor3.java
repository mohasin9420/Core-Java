class  Constructor3
{

	Constructor3(){
		this(10);
		System.out.println("o argument construtor");
	}
	Constructor3(int a){
		this(10,20);
		System.out.println("1 argument construtor");
		
	}
	Constructor3(int a , int b){
		this(10,20,30); 
		System.out.println("2 argument construtor");

		
	}
	Constructor3(int a ,int b ,int c){
		System.out.println("3 argument construtor");
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Constructor3 obj = new Constructor3();
	}
}
