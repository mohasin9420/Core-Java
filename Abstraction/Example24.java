class Example24 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		C obj = new C();
		obj.m1();

	}
}

interface A {

    default void m1() {
        System.out.println("A");
    }
}

interface B {

    default void m1() {
        System.out.println("B");
    }
}

class C implements A, B {

    @Override
    public void m1() {
        A.super.m1(); 
	    B.super.m1();
    }
}