class Example3 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		Employee obj = new Employee(1,"Mohasin Shaikh" , 12000);
		obj.displayEmployee();
		Employee.changeCompanyName("Wipro");
		obj.displayEmployee();
	}
}
class Employee
{
	int empId;
	String empName;
	int empSalary;

	static String CompnyName="TCS";
	
	Employee(int empId,String empName,int empSalary){
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;

	}
	public void displayEmployee(){
		System.out.println("Employee ID is " + empId);
		System.out.println("Employee Name is " + empName);
		System.out.println("Employee Salaray is " + empSalary);
		System.out.println("Employee Compny is "+ CompnyName );
	}

static void changeCompanyName(String newName){
	CompnyName= newName;
}

}
