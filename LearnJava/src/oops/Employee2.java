package oops;

public class Employee2 {

	int empId;
	String empName;
	int salary;
	int deptNo;

	void setdata(int id, String name, int sal, int dno) {
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

		// Assigning values to the class variables using method

		Employee2 emp1 = new Employee2();
		emp1.setdata(101, "Raj", 80000, 100);
		emp1.display();

		Employee2 emp2 = new Employee2();
		emp2.setdata(102, "Simran", 85000, 101);
		emp2.display();
	}

}
