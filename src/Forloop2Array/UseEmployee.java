package Forloop2Array;

public class UseEmployee{
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.empName = "Rahul";
		emp1.salary = 10000;
		emp1.empId = 123;
		emp1.Ismale = true;
		
		
		Employee emp2 = new Employee();
		emp2.empName = "Ram";
		emp2.salary = 15000;
		emp2.empId = 1234;
		emp2.Ismale = true;
		
		Employee emp3 = new Employee();
		emp3.empName = "Muthu";
		emp3.salary = 80000;
		emp3.empId = 12345;
		emp3.Ismale = true;
		
		Employee emp4 = new Employee();
		emp4.empName = "shruti";
		emp4.salary = 1234542;
		emp4.empId = 12343;
		emp4.Ismale = false;
		
		Employee emp5 = new Employee();
		emp5.empName = "Aashi";
		emp5.salary = 1233232;
		emp5.empId = 212121;
		emp5.Ismale = false;
		
		Employee[] emps = {emp1, emp2, emp3, emp4, emp5};
		
		for(int i=0; i<emps.length; i++) {
			System.out.println("name :"+emps[i].empName +" Salary: "+emps[i].salary+" EmployeeID: "+emps[i].empId+" Male/female: "+emps[i].Ismale);
		}
		
		for(int j=0; j<emps.length; j++) {
			if(emps[j].Ismale==true) {
				System.out.println(emps[j].empName);
			}
		}
		
		 Employee max = emps[0];
		for(int k=0; k<emps.length; k++) {
			if(emps[k].salary>max.salary) {
				max = emps[k];	
			}
			
			
			
		}
		System.out.println();
		System.out.println(max.empName);
		
				
	}
	
}




class Employee {
	String empName;
	int salary;
	int empId;
	boolean Ismale;

}
