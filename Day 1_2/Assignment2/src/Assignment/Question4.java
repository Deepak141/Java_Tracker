package Assignment;
import java.util.Scanner;

class Customer{
	private String name;
	private String address;
	private String mobile;
	Customer(String name,String address,String mobile){
		this.name=name;
		this.address=address;
		this.mobile=mobile;
	}
	public void getinfo() {
		System.out.println("Name : "+this.name);
		System.out.println("Address : "+this.address);
		System.out.println("Mobile : "+this.mobile);
	}
}
class CustomerMain{
	CustomerMain(){
		System.out.println("Enter name , address , mobile with comma seperate");
		Scanner sc = new Scanner(System.in);
		String info = sc.nextLine();
		String[] data = info.split(",");
		String name=data[0];
		String address=data[1];
		String mobile=data[2];
		
		Customer c=new Customer(name,address,mobile);
		c.getinfo();
	}
}

public class Question4 {
	public static void main(String[] s) {
		new CustomerMain();
	}

}
