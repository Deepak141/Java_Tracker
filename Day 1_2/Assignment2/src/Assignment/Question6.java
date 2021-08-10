package Assignment;
import java.util.Scanner;

class Employees{
	private String name;
	private String address;
	private String mobile;
	Employees(String name,String address,String mobile){
		this.name=name;
		this.address=address;
		this.mobile=mobile;
	}
	public void getinfo() {
		System.out.println("Name : "+this.name);
		System.out.println("Address : "+this.address);
		System.out.println("Mobile : "+this.mobile);
		return;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAdd(String address) {
		this.address=address;
	}
	public void setMob(String mobile) {
		this.mobile=mobile;
	}
}

class EmployeeMains{
	Scanner sc=new Scanner(System.in);

	EmployeeMains(){
		System.out.println("Enter Employee Name");
		String name= sc.nextLine();
		System.out.println("Enter Address");
		String address = sc.nextLine();
		System.out.println("Enter Mobile Number");
		String mobile = sc.nextLine();
		Employees e=new Employees(name,address,mobile);
		e.getinfo();
		System.out.println("Verify the Details");
		String n="";
		while (n != "4") {
			System.out.println("Menu");
			System.out.println("1. Update Employee name\r\n 2. Update Employee Address\r\n 3. Update Employee mobile\r\n 4. All information correct/Exit "
				);
			n = sc.nextLine();
			System.out.println(n);
			switch(n) {
			case "1": 
				System.out.println("Current name is "+name);
				System.out.println("Enter the name");
				name=sc.nextLine();
				e.setName(name);
				break;
			case "2":
				System.out.println("Current address is "+address);
				System.out.println("Enter the address");
				address=sc.nextLine();
				e.setAdd(address);
				break;
			case "3":
				System.out.println("Current mobile number is "+mobile);
				System.out.println("Enter the mobile number");
				mobile=sc.nextLine();
				e.setMob(mobile);
				break;
			default :
				System.out.println("The details are");
				e.getinfo();
				return;
			}
		}
		
		
		
	}

	
}

public class Question6 {

	public static void main(String[] args) {
		new EmployeeMains();
	}
}
