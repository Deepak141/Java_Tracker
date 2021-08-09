package Assignment;

import java.util.Scanner;

public class question3 {
	
	public static  int productDigits(int n) 
	{
		int mult=1;
		if(n<0 ||n >32767)
		{
			mult=-1;
		}
		else
		{
			while ( n != 0)
			{
				int rem = 0;
				rem = n % 10;
				mult = mult * rem;
				n=n/10;
			}	
		}
		return mult;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n = sc.nextInt();
		int result;
		result = productDigits(n);
		if (result<0) {
			System.out.println("Invalid input");
		}
		else
		System.out.println("Result is "+result);
		

	}

}
