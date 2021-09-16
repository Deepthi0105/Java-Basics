package oops;

public class Employee {

	int empId;
	String empName;
	int salary;
	int deptNo;

	void display() {
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(salary);
		System.out.println(deptNo);
	}

	public static void main(String[] args) {
		
		//Assigning values to the class variables using object

		Employee emp1 = new Employee();

		emp1.empId = 101;
		emp1.empName = "Raj";
		emp1.salary = 70000;
		emp1.deptNo = 100;
		emp1.display();

		Employee emp2 = new Employee();
		emp2.empId = 102;
		emp2.empName = "Simran";
		emp2.salary = 65000;
		emp2.deptNo = 105;
		emp2.display();

	}

}
