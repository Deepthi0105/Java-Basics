package oops;

public class Employee1 {

	int empId;
	String empName;
	int salary;
	int deptNo;

	Employee1(int id, String name, int sal, int dno) {
		empId = id;
		empName = name;
		salary = sal;
		deptNo = dno;
	}

	void display() {
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(salary);
		System.out.println(deptNo);
	}

	public static void main(String[] args) {

		// Assigning values to the class variables using Constructor

		Employee1 emp1 = new Employee1(101, "Raj", 75000, 100);
		emp1.display();

		Employee1 emp2 = new Employee1(102, "Simran", 70000, 101);
		emp2.display();

	}

}
