package Assignment;
import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of overs");
		try {
			
		String n = sc.nextLine();
		System.out.println("Enter the number of runs of each over");
		int[] runs = new int[(Integer.parseInt(n))];

		for (int i=0;i<(Integer.parseInt(n));i++) {
			runs[i] = sc.nextInt();
		}
		System.out.println("Enter the over number");
		int o=sc.nextInt();
		System.out.println("Runs scored in this over : "+runs[(o-1)]);

		}
		catch (Exception e) {
			System.out.println(e);
		}
		}
	
}
