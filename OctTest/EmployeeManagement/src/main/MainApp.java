package main;

import java.util.ArrayList;
import java.util.Scanner;

import dao.EmployeeDAO;
import model.Employee;

public class MainApp {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = 'N';
		do {
			System.out.println("**********Menu*********");
			System.out.println(" 1 -> Add Employee");
			System.out.println(" 2 -> Update Employee");
			System.out.println(" 3 -> Delete Employee");
			System.out.println(" 4 -> View All Employees");
			System.out.println(" 5 -> Exit");
			
			System.out.println("Enter a Choice : ");
			int choice = sc.nextInt();
			int x = 0;
			
			switch(choice) {
			case 1 : //add employee 
				System.out.println("Enter the name of employee: ");
				String name = sc.next();
			
				System.out.println("Enter the email of employee: ");
				String email = sc.next();

				System.out.println("Enter the department of employee: ");
				String department = sc.next();

				System.out.println("enter the salary of employee");
				double salary = sc.nextDouble();
				
				Employee e = new Employee(name, email, department, salary);
//				System.out.println("Empoyee: " + e.getName()+" "+e.getEmail()+" "+e.getSalary()+" "+e.getDepartment());
				
				x = new EmployeeDAO().addEmployee(e);
				if(x!=0) System.out.println("Employee added");
				else System.out.println("Employee not added");
				break;
				
			case 2 : //update employee
				System.out.println("enter the id of employe whom you want to update: ");
				int id = sc.nextInt();
				
				System.out.println("Enter the name of employee: ");
				String ename = sc.next();
			
				System.out.println("Enter the email of employee: ");
				String eemail = sc.next();

				System.out.println("Enter the department of employee: ");
				String edepartment = sc.next();

				System.out.println("enter the salary of employee");
				double esalary = sc.nextDouble();
				
				x = new EmployeeDAO().updateEmployee(id, ename, eemail, esalary, edepartment);
				if(x!=0) System.out.println("Employee updated");
				else System.out.println("Employee not updated");
				break;
				
			case 3 : //delete employee
				System.out.println("enter the id of employe whom you want to update: ");
				int id1 = sc.nextInt();
				x = new EmployeeDAO().deleteEmployee(id1);
				if(x!=0) System.out.println("Employee deleted");
				else System.out.println("Employee not deleted");
				break;
				
			case 4 : //view all employee
				ArrayList<Employee> list = new EmployeeDAO().getAllEmployee();
				System.out.println("List of All Employee :- ");
				for(Employee em : list) {
					System.out.println(em.getId()+"  " + em.getName()+"  "+em.getEmail()+"  "+em.getSalary()+"  "+em.getDepartment());
				}
				break;
				
			case 5 : //exit 
					System.out.println("BYE BYE");
					System.exit(0);
			default : System.out.println("Invalid Choice");
			}
			
			System.out.println("\nDo you want to continue or not enter y|Y for continue");
			ch = sc.next().charAt(0);
			
		}while(ch=='y' || ch=='Y');
		if(ch != 'y' && ch != 'Y') System.out.println("Bye Bye");
	}

}
