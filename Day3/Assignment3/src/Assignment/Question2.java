package Assignment;
import java.util.Scanner;

class HotelRoom{
	private String hn;
	private int nsf;
	private Boolean tv;
	private Boolean wifi;
	HotelRoom(String hn,int nsf,Boolean tv,Boolean wifi){
		this.hn=hn;
		this.nsf=nsf;
		this.tv=tv;
		this.wifi=wifi;
	}
	public void calculateTariff(int nsf,int cst) {
	}
	public int getRatePerSqFee() {
		return 0;
	}
}

class DeluxRoom extends HotelRoom{
	private int cst;
	int cs=10;

	DeluxRoom(String hn, int nsf, Boolean tv, Boolean wifi) {
		super(hn, nsf, tv, wifi);
		this.cst=cs;
	}
	public void calculateTariff(int nsf,int cst) {
		int res=nsf*cst;
		System.out.println("Room Tariff per day is:"+res);
	}
	public int getRatePerSqFeet(Boolean wifi) {
		if (wifi == true) {
			return cst+2;
		}
		else return cst;
		
	}
	
}

class DeluxeSeaViewRoom extends DeluxRoom{
	private int cst;
	int cs=12;

	DeluxeSeaViewRoom(String hn, int nsf, Boolean tv, Boolean wifi) {
		super(hn, nsf, tv, wifi);
		this.cst=cs;
	}
	public void calculateTariff(int nsf,int cst) {
		int res=nsf*cst;
		System.out.println("Room Tariff per day is:"+res);
	}
	public int getRatePerSqFeet(Boolean wifi) {
		if (wifi == true) {
			return (cst)+2;
		}
		else return cst;	
}
}

class SuiteRoom extends HotelRoom{
	private int cst;
	int cs=15;
	SuiteRoom(String hn, int nsf, Boolean tv, Boolean wifi) {
		super(hn, nsf, tv, wifi);
		this.cst=cs;
		
	}
	
	public int getRatePerSqFeet(Boolean wifi) {
		if (wifi==true) {
			return (this.cst+2);
		}
		else return this.cst;
	}
	public void calculateTariff(int nsf,int cst) {
		int res=nsf*cst;
		System.out.println("Room Tariff per day is:"+res);
	}
	
}

public class Question2 {
	
	public static void main(String[] arg) {
		System.out.println("Hotel Traffic Calculator");
		System.out.println("1.Delux room \n2.Delux AC Room \n3.Suite AC Room");
		Scanner sc=new Scanner(System.in);
		String type=sc.nextLine();
		System.out.println("Hotel Name: ");
		String hn = sc.nextLine();
		System.out.println("Room Square Feet Area:");
		int n=sc.nextInt();
		System.out.println("Room has TV(yes/no):");
		sc.nextLine();
		String tv=sc.nextLine();
		Boolean t;
		if (tv.equals("yes")) {
			t = true;
		}
		else  t=false;
		System.out.println("Room has Wifi (yes/no):");
		String wifi=sc.nextLine();
		Boolean w;
		if (wifi.equals("yes")) {
			w = true;
		}
		else  w=false;
		switch (type) {
		case "1":{
			DeluxRoom d=new DeluxRoom(hn , n, t, w);
			int cst=d.getRatePerSqFeet(w);
			d.calculateTariff(n, cst);
			break;
		}
		case "2":{
			DeluxeSeaViewRoom d=new DeluxeSeaViewRoom(hn , n, t, w);
			int cst=d.getRatePerSqFeet(w);
			d.calculateTariff(n, cst);
			break;
		}
		default:{
			SuiteRoom d=new SuiteRoom(hn , n, t, w);
			int cst=d.getRatePerSqFeet(w);
			d.calculateTariff(n, cst);
			break;
		}
		}
	}


}
