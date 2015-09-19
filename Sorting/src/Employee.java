
public class Employee {
	public int employeeNumber;
	public String firstName;
	public String lastName;
	public String emailId;

	public Employee(int employeeNumber,String firstName, String lastName, String emailId){
		this.employeeNumber = employeeNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}
	
	public String getName(){
		return this.firstName + "" + this.lastName;
	}
	
	public int getEmployeeNumber(){
		return this.employeeNumber;
	}
	
}
