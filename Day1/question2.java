package Assignment;
import java.util.Scanner;

public class question2 {
	public static void main(String[] arg)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of salary U want to enter");
		int n = sc.nextInt();
		if(n<0)
		{
			System.out.println("Invalid input");
			return ;
		}
		int[] lst = new int[n];
		System.out.println("Enter the values");
		for (int i =0 ; i < n ; i++)
		{
			int val = sc.nextInt();
			if(val<0)
			{
				System.out.println("Invalid input");
				return ;
			}
			else
			{
				lst[i] = val;
			}
		}
		for(int i = 0; i < lst.length; i++) {  
			int cnt = 0;
            for(int j = i + 1; j < lst.length; j++) {  
                if(lst[i] == lst[j])  
                    cnt = cnt + 1;
            }  
            if (cnt > 0)
            {
            	System.out.println(lst[i]+" repeated "+(cnt+1));
            }
        }
		
	}
}
