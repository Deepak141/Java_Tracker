package Assignment;

import java.util.Scanner;



	class Innings{
		private String teamname;
		private String innings;
		private int runs;
		Innings(String teamname,String innings,int runs){
			this.teamname=teamname;
			this.innings =innings;
			this.runs=runs;
		}
		public void getinfo() {
			System.out.println();
			System.out.println("Team Name : "+ this.teamname);
			System.out.println("Innings : "+this.innings.toLowerCase());
			if(this.innings.toLowerCase().equals("first"))
			{
				System.out.println("Scored : "+this.runs);
				System.out.println("Need "+(this.runs+1)+" to win");
			}
			else {
				System.out.println("Scored : "+this.runs);
				System.out.println("Match Ended");
			}
			
		}
	}
	class InningsMain{
		InningsMain(){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter TeamName");
			String teamname = sc.nextLine();
			System.out.println("Enter innings");
			String innings = sc.nextLine();	
			System.out.println("Enter runs");
			int runs = sc.nextInt();
			
			Innings i = new Innings(teamname,innings,runs);
			
			i.getinfo();
		}
	}
public class Question3 {
	public static void main(String[] args) {
		 new InningsMain();

		
	}
	
}

