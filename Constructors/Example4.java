class Example4 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		Student stud1= new Student(1,"Mohasin Shaikh" ,40);
		stud1.displayStudent();
		stud1.checkResult();
		Student.result();
		Student.showStudentCount();
		Student stud2= new Student(2,"Sayanad Jagadale",39);
		stud2.displayStudent();
		stud2.checkResult();
		Student.result();
		Student.showStudentCount();
		Student stud3= new Student(3,"Shree jagadale" ,33);
		stud3.displayStudent();
		stud3.checkResult();
		Student.result();
		Student.showStudentCount();

	}
}
class Student 
{
	  int rollNo;
      String  name;
      int marks;
	  static int passStudent=0;
	  static int failStudent=0;

	  static String  collegeName = "NBN Sinhgad";
      static int studentCount=0;
	
	Student(int rollNo,String name,int marks){
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
		studentCount++;
		 if(marks >= 35)
        passStudent++;
    else
        failStudent++;
}
	
	public void displayStudent(){
		System.out.println("Student Roll Number is " + rollNo);
		System.out.println("Student Name Is " + name);
		System.out.println("Students Marks Is" + marks );
		
	}
	public void checkResult(){
		if (marks >=35)
		{
			System.out.println("Student is Pass" );
			
		}
		else
		{
			System.out.println("Student is fail" );
		}
	}
	static void showStudentCount(){
		System.out.println("total Student is " + studentCount);
		
	}
	static void result() {
    System.out.println("Pass Students : " + passStudent);
    System.out.println("Fail Students : " + failStudent);
}

}
