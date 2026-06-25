class Test5 
{
	int a=100;
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Test5 obj = new Test5();
		System.out.println(obj); // implicit

		System.out.println(obj.hashCode());
		System.out.println(obj.toString());// explicit
		// what is reason java creates java object class :- to perform common operation to support java has created 
		// toString method and the To String method actually comes from Object class hence for every class to perform common Operation 
		// object class provides methods beaucse og that all claases shoud inheriance from Object class 
		// The toString() method of the Object class returns a string representation of the object.
		// By default, it returns the class name followed by the object's hash code in hexadecimal form.

	}
	public String toString(){
		return getClsss().getName() + "@" + Integer.toHexString(hashcode());
	}
}
class Mohasin
{

	public String toString()
{
    return getClass().getName() + "@"
           + Integer.toHexString(hashCode());
}

}


