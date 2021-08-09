package Assignment;
import java.util.Scanner;

public class question1 {
	
	public static int calculateSal(int sal , int sft) {
		double food = 0,travel =0,sft_amt=0 , per_day= 0;
		int bal = 0;
		food = sal *  0.2;
		travel = sal * 0.3;
		per_day = (sal) * 0.02 ;
		sft_amt = per_day * sft;
		
		bal = (int) (sal + sft_amt - (food + travel) ) ;
		return (bal);
	}
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Salary");
		int sal = sc.nextInt();
		if (sal > 8000)
		{
			System.out.println("Salary too large");
			return;
		}
		System.out.println("Enter the Shifts");
		int sft = sc.nextInt();
		int saving=0;
		

		if(sal>0 && sal<8000 && sft != 0)
		{
			saving = calculateSal(sal , sft);
			System.out.println("Total saving is : "+saving);
		}
		else if (sal>0 && sal<8000 && sft != 0)
		{
			System.out.println("Shifts too small");
		}
		else 
		{
			System.out.println("Salary too small");
		}
	}

}

