package Assignment;
import java.util.Scanner;
import java.util.ArrayList; 

class TeamNameNotFoundException extends Exception{
	public TeamNameNotFoundException(String str) {
		super(str);
	}
}

public class Question6 {

	public static void main(String[] args) throws TeamNameNotFoundException {
		Scanner sc = new Scanner(System.in);
		try {
			ArrayList<String> team = new ArrayList<>();
			team.add("CSK");
			team.add("SRH");
			team.add("RCB");
			team.add("DC");
			team.add("KXIP");
			team.add("KKR");
			team.add("MI");
			team.add("RR");		
		System.out.println("Enter the expected winner team of ipl season 13");
		String w = sc.nextLine();
		if(!team.contains(w)) {
			throw new TeamNameNotFoundException("Entered team is not a part of IPL Season 13");
		}
		System.out.println("Enter the expected runner Team of IPL Season 13");
		String r =  sc.nextLine();
		
		if(!team.contains(r)) {
				throw new TeamNameNotFoundException("Entered team is not a part of IPL Season 13");
			}
			System.out.println("Expected IPL Season 13 winner: "+w+"\nExpected IPL Season 13 runner: "+r);
		}
		catch(TeamNameNotFoundException e) {
			System.out.println(e);
		}
	}

}
