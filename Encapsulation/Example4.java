class Example3 
{
	
	private static Example3 ex;

	Example3(){
		

		}
		
	}

	public Example3 getinstance(){
		if( ex==null){
			ex=new Example3();


		return ex;
	}

}

class Example4
{
	public static void main(String args[]){
		Example3 ex1 =new Example3();
		Example3 ex2 =new Example3();
			System.out.println((ex1==ex2)?true:false);

	}
}

