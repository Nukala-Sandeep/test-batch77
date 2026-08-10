package com.javaintro;

public class Employee {
	static String departmentName;
	static String location;
	int emp_id;
	String name;
	String mobile;
	String e_mail;
	static int count=0;
	     Employee(){
		count++;
	}
	
	

	public static void main(String[] args) {
		System.out.println("Employee Details ");
		departmentName="Sales";
		location="KPHB";
		
		Employee emp1=new Employee();
		
		emp1.emp_id=001;
		emp1.name="Sagar";
		emp1.mobile="9087654321";
		emp1.e_mail="sagar@gmail.com";
		System.out.println("******************Object1*******************");
		System.out.println("Department Name: "+departmentName);
		System.out.println("Location: "+location);
		System.out.println("Employee Id: "+emp1.emp_id);
		System.out.println("Employee Name: "+emp1.name);
		System.out.println("Employee Number: "+emp1.mobile);
		System.out.println("Employee E-mail: "+emp1.e_mail);
		
		System.out.println("******************Object2*******************");
		Employee emp2=new Employee();
		emp2.emp_id=002;
		emp2.name="Usha";
		emp2.mobile="9870654321";
		emp2.e_mail="usha@gmail.com";
		System.out.println("Department Name: "+departmentName);
		System.out.println("Location: "+location);
		System.out.println("Employee Id: "+emp2.emp_id);
		System.out.println("Employee Name: "+emp2.name);
		System.out.println("Employee Number: "+emp2.mobile);
		System.out.println("Employee E-mail: "+emp2.e_mail);
		
		System.out.println("******************Object3*******************");
		Employee emp3=new Employee();
		emp3.emp_id=003;
		emp3.name="Anil";
		emp3.mobile="9123456780";
		emp3.e_mail="anilr@gmail.com";
		System.out.println("Department Name: "+departmentName);
		System.out.println("Location: "+location);
		System.out.println("Employee Id: "+emp3.emp_id);
		System.out.println("Employee Name: "+emp3.name);
		System.out.println("Employee Number: "+emp3.mobile);
		System.out.println("Employee E-mail: "+emp3.e_mail);
		
		
		System.out.println("******************Object4*******************");
		departmentName="Marketing";
		location="LB Nagar";
		Employee emp4=new Employee();
		emp4.emp_id=004;
		emp4.name="Sandeep";
		emp4.mobile="9912520087";
		emp4.e_mail="sandeep@gmail.com";
		
		System.out.println("Department Name: "+departmentName);
		System.out.println("Location: "+location);
		System.out.println("Employee Id: "+emp4.emp_id);
		System.out.println("Employee Name: "+emp4.name);
		System.out.println("Employee Number: "+emp4.mobile);
		System.out.println("Employee E-mail: "+emp4.e_mail);
		
		
		System.out.println("******************Object5*******************");
		Employee emp5=new Employee();
		emp5.emp_id=005;
		emp5.name="Rukmini";
		emp5.mobile="9346522222";
		emp5.e_mail="rukmini@gmail.com";
		
		System.out.println("Department Name: "+departmentName);
		System.out.println("Location: "+location);
		System.out.println("Employee Id: "+emp5.emp_id);
		System.out.println("Employee Name: "+emp5.name);
		System.out.println("Employee Number: "+emp5.mobile);
		System.out.println("Employee E-mail: "+emp5.e_mail);
		
		
		System.out.println("Object count: "+Employee.count);

	}

}
