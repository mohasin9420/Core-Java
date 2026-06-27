 class  Abstraction1
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		B obj = new B();
		obj.m1();
		
	}
	
	
}
abstract class A
{
	abstract void m1();
}
class B extends A
{
	 void m1(){
		System.out.println("A");
	}

}




/*abstraction caan achive using two ways
1) abstratct classes
2) interfaces 
*/
// abstarction is process of  highliting the Serivices and hiding the impementation  detail
// hiding the implementation
// class contain only declaration of method but no implemen
// if class contain abstarct method  so automatically become abstract 
// interview whenwever we compile code we generate .class file ?
// yes 