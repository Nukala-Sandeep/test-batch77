package com.javaintro;

public class Employee2 {
	static String departmentName;
	static String location;
	int emp_id;
	String name;
	String mobile;
	String e_mail;
	public static void main(String[] args) {
		System.out.println("Employee Details:  ");
//		System.out.println("******************Object2*******************");
		System.out.println("departmentName     location       emp_id         name	   mobile       e_mail");

		departmentName="Sales";
		location="KPHB";
		Employee emp1=new Employee();
		emp1.emp_id=001;
		emp1.name="Sagar";
		emp1.mobile="9087654321";
		emp1.e_mail="sagar@gmail.com";
		System.out.println(departmentName+ "             "+location+"	 	   "+emp1.emp_id+"		"+emp1.name+"	 "+emp1.mobile+"  "+emp1.e_mail);
		
//		System.out.println("******************Object2*******************");
		Employee emp2=new Employee();
		emp2.emp_id=002;
		emp2.name="Usha";
		emp2.mobile="9870654321";
		emp2.e_mail="usha@gmail.com";
		System.out.println(departmentName+"		  "+location+" 		   "+emp2.emp_id+"		"+emp2.name+"	 "+emp2.mobile+"  "+emp2.e_mail);

//		System.out.println("******************Object3*******************");
		Employee emp3=new Employee();
		emp3.emp_id=003;
		emp3.name="Anil";
		emp3.mobile="9123456780";
		emp3.e_mail="anilr@gmail.com";
		System.out.println(departmentName+ " 	  	  "+location+" 		   "+emp3.emp_id+"		"+emp3.name+"	 "+emp3.mobile+"  "+emp3.e_mail);

//		System.out.println("******************Object4*******************");
		departmentName="Marketing";
		location="LB Nagar";
		Employee emp4=new Employee();
		emp4.emp_id=004;
		emp4.name="Sandeep";
		emp4.mobile="9912520087";
		emp4.e_mail="sandeep@gmail.com";
		System.out.println(departmentName+ " 	  "+location+" 	   "+emp4.emp_id+"		"+emp4.name+"  "+emp4.mobile+"  "+emp4.e_mail);
		
//		System.out.println("******************Object5*******************");
		Employee emp5=new Employee();
		emp5.emp_id=005;
		emp5.name="Rukmini";
		emp5.mobile="9346522222";
		emp5.e_mail="rukmini@gmail.com";
		System.out.println(departmentName+ "	  "+location+" 	   "+emp5.emp_id+"		"+emp5.name+"  "+emp5.mobile+"  "+emp5.e_mail);

		
		
		
			}

}
