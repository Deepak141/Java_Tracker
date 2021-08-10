package Assignment;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

class Company{
	private String cname;
	private String emp;
	private String tl;
	
	Company(String cname,String emp,String tl){
		this.cname=cname;
		this.emp=emp;
		this.tl=tl;
	}
	public void getinfo() {
		
		String[] e = this.emp.split(",");
		List<String> list= Arrays.asList(e);
		if(list.contains(tl)) {
			System.out.println("Company Name : "+this.cname);
			System.out.println("Employees : "+this.emp);
			System.out.println("Team Lead : "+this.tl);
		}
		else {
			System.out.println("Invalid Team Lead Name");
		}
		
	}
}

class CompanyMain{
	CompanyMain(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Company Name");
		String cname = sc.nextLine();
		System.out.println("Enter the Employees name with comma seperated");
		String emp = sc.nextLine();
		System.out.println("Enter the TeamLeader name");
		String tl = sc.nextLine();
		Company c = new Company(cname,emp,tl);
		c.getinfo();
	}
}
public class Question5{
	public static void main(String[] args) {
		new CompanyMain();
}
}
