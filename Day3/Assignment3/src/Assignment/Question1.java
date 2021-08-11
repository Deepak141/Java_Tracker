package Assignment;
import java.util.Scanner;

class Vehicle{
	private String make;
	private String vn;
	private String ft;
	private int fc;
	private int cc;
	Vehicle(String make,String vn,String ft,int fc,int cc){
		this.make=make;
		this.vn=vn;
		this.ft=ft;
		this.fc=fc;
		this.cc=cc;
	}
	
	public void displayMake() {
		System.out.println("Make information : "+this.make);
	}
	public void displayBasicInfo() {
		System.out.println("BasicInfo of the Vehicle ");
		System.out.println("Vehicle Number : "+this.vn);
		System.out.println("Fuel Type : "+this.ft);
		System.out.println("CC : "+this.cc);
		System.out.println("Fuel Capasity : "+this.fc);
	}
	public void displayDetailInfo() {
		
	}
}

class TwoWheeler extends Vehicle{
	private Boolean KSA;
	TwoWheeler(String make, String vn, String ft, int fc, int cc , Boolean KSA) {
		super(make, vn, ft, fc, cc);
		this.KSA=KSA;
	}
	String value;
	public void displayDetailInfo() {
		if (this.KSA == true) {
			value="YES";
		}
		else value = "NO";
		System.out.printf("Availability of Kick Start : "+value);
	}
	
}
class FourWheel extends Vehicle{
	private String audioSystem;
	private int numberOfDoors;
	FourWheel(String make, String vn, String ft, int fc, int cc , String as,int nd) {
		super(make, vn, ft, fc, cc);
		this.audioSystem=as;
		this.numberOfDoors=nd;	
	}
	public void displayDetailInfo() {
		System.out.println("Audio System : "+this.audioSystem);
		System.out.println("Number of Door : "+this.numberOfDoors);
	}
}

public class Question1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("1.Four Wheeler\n2.Two Wheeler");
		System.out.println("Enter Vehicle Type:");
		int value = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Vehicle Make :");
		String vm= sc.nextLine();
		
		System.out.println("Vehicle number :");
		String vn=sc.nextLine();
		
		System.out.println("Fuel Type: \n 1.Petrol \n 2.Disel");
		int ft = sc.nextInt();
		sc.nextLine();
		String f;
		if (ft == 1) {
			f="Petrol";
		}
		else f="Disel";
		System.out.println("Fuel Capacity:");
		int fc=sc.nextInt();
		System.out.println("Engine CC :");
		int cc=sc.nextInt();
		if (value == 1) {
			System.out.println("Audio System");
			sc.nextLine();
			String as=sc.nextLine();
			System.out.println("Number of Doors");
			int vd=sc.nextInt();
			FourWheel fw = new FourWheel(vm,vn,f,fc,cc,as,vd);
			fw.displayMake();
			fw.displayBasicInfo();
			fw.displayDetailInfo();
		
			
		}
		else {
			System.out.println("Kick Start Available (yes/no)");
			sc.nextLine();
			Boolean ks;
			String k = sc.nextLine();
			System.out.println(k);
			if (k.equals("yes")) {
				ks = true;
			}
			else  ks=false;
			TwoWheeler tw=new TwoWheeler(vm,vn,f,fc,cc,ks);
			tw.displayMake();
			tw.displayBasicInfo();
			tw.displayDetailInfo();
		}
		
	}

}
