package Assignment;
import java.util.Scanner;

abstract class Match{
	private int cs;
	private float co;
	private int target;
	public void setdata(int cs,float co,int target) {
		this.cs=cs;
		this.co=co;
		this.target=target;
	}
	public float[] getdata() {
		float[] a = new float[3];
		a[0]=this.cs;
		a[1]=this.co;
		a[2]=this.target;
		return a;
	}
	abstract public float calculateRunRate(int cs,int target,int balls);
	abstract public int calculateBalls(float co);
	abstract public void display(double reqRunrate, int balls);
}

class ODIMatch extends Match{
	
	@Override
	public int calculateBalls(float co) {
		int tb=300;
		
		int over=(int)co;
		
		return (int)(tb-((over*6)+(co-over)*10));
	}
	
	@Override
	public float calculateRunRate(int cs,int t,int b) {
		float f=(t-cs);
		float ball=(b/6);
		float res=f/ball;
		return (res);
	}

	@Override
	public void display(double reqRunrate, int balls) {
		System.out.println("Need "+(float)(reqRunrate*(int)(balls/6))+"runs in "+balls+"balls");
		System.out.println("Required Runrate is "+(float)reqRunrate);
		
	}
	
}

class TestMatch extends Match{
	
	@Override
	public int calculateBalls(float co) {
		int tb=540;
		
		int over=(int)co;
		
		return (int)(tb-((over*6)+(co-over)*10));
	}
	
	@Override
	public float calculateRunRate(int cs,int t,int b) {
		float f=(t-cs);
		float ball=(b/6);
		float res=f/ball;
		return (res);
	}

	@Override
	public void display(double reqRunrate, int balls) {
		System.out.println("Need "+(int)(reqRunrate*(balls/6))+"runs in "+balls+"balls");
		
	}
	
}

class T20Match extends Match{
	
	@Override
	public int calculateBalls(float co) {
		int tb=120;
		
		int over=(int)co;
		
		return (int)(tb-((over*6)+(co-over)*10));
	}
	
	@Override
	public float calculateRunRate(int cs,int t,int b) {
		float f=(t-cs);
		float ball=(b/6);
		float res=f/ball;
		return (res);
	}

	@Override
	public void display(double reqRunrate, int balls) {
		System.out.println("Need "+(int)(reqRunrate*(balls/6))+"runs in "+balls+"balls");
		
	}
	
}

class MainMatch{
	MainMatch(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Match formt : \n1.ODI \n2.T20 \n3.Test");
	int i=sc.nextInt();
	System.out.println("Enter the Current score");
	int cs = sc.nextInt();
	System.out.println("Enter the current over");
	float co = sc.nextFloat();
	System.out.println("Enter the Target Score");
	int t=sc.nextInt();
	System.out.println("Requirements:");
	switch(i) {
	case 1:{
			ODIMatch o=new ODIMatch();
			o.setdata(cs, co, t);
			int b=o.calculateBalls(co);
			double rs = o.calculateRunRate(cs, t, b);
			System.out.println(t-cs);
			o.display(rs, b);
			break;
	}
	case 2:{
		T20Match o=new T20Match();
		o.setdata(cs, co, t);
		int b=o.calculateBalls(co);
		double rs = o.calculateRunRate(cs, t, b);
		System.out.println(t-cs);
		o.display(rs, b);
		break;
		
	}
	default:{
		TestMatch o=new TestMatch();
		o.setdata(cs, co, t);
		int b=o.calculateBalls(co);
		double rs = o.calculateRunRate(cs, t, b);
		System.out.println(t-cs);
		o.display(rs, b);
		break;
	}
	}
	}
}

public class Question3 {

	public static void main(String[] args) {
		
		new MainMatch();
	}

}
