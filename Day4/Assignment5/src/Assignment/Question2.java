package Assignment;
import java.util.Scanner;
import java.util.*;

public class Question2 {
	public static void main(String[] arg) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of matches");
		int n=sc.nextInt();
		int c=0;
		int cv=0;
		System.out.println("Enter the match scores");
		List<Integer> run = new ArrayList<>();
		for(int i=0;i<n;i++) {
			run.add(sc.nextInt());			
		}
		for(int a:run) {
			if(a>49 && a<100) {
				c = c+1;
			}
			if(a>99) {
				cv=cv+1;
			}
		}
		System.out.println("Output");
		System.out.println(c);
		System.out.println(cv);
	}

}
