package Assignment;
import java.util.Scanner;

class Employee{
	private String name;
	private String address;
	private String mobile;
	Employee(String name,String address,String mobile){
		this.name=name;
		this.address=address;
		this.mobile=mobile;
	}
	public void getinfo() {
		System.out.println();
		System.out.println("Employee Info");
		System.out.println("Name : "+ this.name);
		System.out.println("Address : "+this.address);
		System.out.println("Mobile : "+this.mobile);
	}
}
class EmployeeMain{
	EmployeeMain(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = sc.nextLine();
		System.out.println("Enter address");
		String address = sc.nextLine();	
		System.out.println("Enter mobile");
		String mobile = sc.nextLine();
		
		Employee e = new Employee(name,address,mobile);
		
		e.getinfo();
	}
	
	
	
}

public class Question2 {
	public static void main(String[] args) {
		new EmployeeMain();
		
	}

}
