package Assignment;
import java.util.Scanner;

public class question4 {
	
	public static void highestFeedBack(int medical[],int healthcare[],int size)
	{
		for(int i=0; i<size; i++) {
			if(medical[i]==0) {
				continue;
			}
			else {
				if(medical[i]>healthcare[i]) {
					System.out.println(i+1);
					System.out.println(medical[i]);
				}
				else {
					System.out.println(i+1);
					System.out.println(healthcare[i]);
				}
				healthcare[i] = 0;
					
			}
		}
		for(int i=0; i<size; i++) {
			if(healthcare[i]==0)
				continue;
			else {
				System.out.println(i+1);
				System.out.println(healthcare[i]);
			}
		}
	}
	
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n = sc.nextInt();
		int[] med = new int[n];
		int[] hlth = new int[n];
		for (int i=0;i<n;i++)
		{
			String a= sc.nextLine();
			String[] str = a.split(" ");
			med[i] = Integer.parseInt(str[0]);
			if (med[i]<0) {
				return;
			}
			hlth[i]=Integer.parseInt(str[1]);
			if (hlth[i]<0)
			{
				return;
			}
		}
		highestFeedBack(med,hlth,n);
		
	}

}
