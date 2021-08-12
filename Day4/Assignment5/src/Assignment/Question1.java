package Assignment;
import java.util.ArrayList;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> player = new ArrayList<>();
		System.out.println("Enter the top 5 players name in IPL season 13");
		for (int i=0;i<5;i++) {
			player.add(sc.nextLine());
		}
		ArrayList<String> cp=new ArrayList<>();
		System.out.println("Enter the top 5 player names in IPL season 12");
		for(int i=0;i<5;i++)
		{
			cp.add(sc.nextLine());
		}
		System.out.println("Consistent run scorers ");
		for(String i:player) {
			for(String j:cp) {
				if(i.equals(j)) {
					System.out.println(i);
				}
			}
		}
		

	}

}
