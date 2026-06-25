class Example1
{
	public static void main(String[] args) 
	{
		Success Stud1 = new Success();
		Stud1.SetInfo(1,"Mohasin Shaikh");
		Success Stud2 = new Success();
		Stud2.SetInfo(2,"Saurabh Aglave");

		Stud1.Getinfo();
		Stud2.Getinfo();
	
		
	}
}

class Success
{
	int id;
	String name;
	static String classname="Cyber Success";

	public void Getinfo(){
		System.out.println("Student id is " + id + " student name " + name + " From " + classname);
	}
	public void SetInfo(int id ,String name){
		this.id=id;
		this.name=name;
	}

}
