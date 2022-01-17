
public class Employee {
	
	//variable declaration
	int eid;
	String ename;
	double salary;
	String department;
	
	//methods
	
	public int getEid(){
		return eid;
	}
	
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public String getEname() {
		return ename;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	

	public static void main(String[] args) {
		
		//Creating object for employee class
		Employee e1 = new Employee();
		
		//Setting employee attributes using setters
		e1.setEid(100);
		e1.setEname("Jane");
		e1.setSalary(1500);
		e1.setDepartment("Human Resources");
		
		//Using get method to display employee data
		System.out.println("Employee ID: " + e1.getEid());
		System.out.println("Name: " + e1.getEname());
		System.out.println("Salary: " + e1.getSalary());
		System.out.println("Department: " + e1.getDepartment());
		
	}

}
