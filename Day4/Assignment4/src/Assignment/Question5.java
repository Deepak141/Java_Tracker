package Assignment;
import java.util.Scanner;

class Age extends Exception{
	public Age(String str){
				super(str);
	}
}

public class Question5 {

	public static void main(String[] args) throws Age {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the player name");
		String name=sc.nextLine();
		System.out.println("Enter the player Age");
		try {
		int age=sc.nextInt();
		if(age<19) {
			throw new Age("Invalid age");
		}
		System.out.println("Player name : "+name +"\nPlayer age : "+age);
		}
		catch (Age a) {
			System.out.println(a);
		}

	}

}
