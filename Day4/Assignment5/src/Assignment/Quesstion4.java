package Assignment;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Quesstion4  {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of players to be entered");
		int n=sc.nextInt();
		sc.nextLine();
		Set<String> player = new TreeSet<>();
		for (int i=0;i<n;i++) {
			player.add(sc.nextLine());
		}
		for(String i:player) {
			System.out.println(i);
		}

	}

}
