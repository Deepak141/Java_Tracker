package Assignment;
import java.util.HashSet;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of players to be entered");
		int n=sc.nextInt();
		sc.nextLine();
		HashSet<String> player = new HashSet<>();
		for (int i=0;i<n;i++) {
			player.add(sc.nextLine());
		}
		System.out.println(player.size());
		
	}

}
