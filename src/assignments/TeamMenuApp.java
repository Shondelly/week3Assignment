package assignments;

import java.util.Scanner;

public class TeamMenuApp {

	static Scanner s = new Scanner(System.in);
	static int addingIndex = 0;
	public static void main(String[] args) {
		/*
		 *	Using the 5 points below construct a Team Menu App
		 * "Add team member
		 * view team member
		 * view all team members
		 * delete team member by position
		 * delete all team members"
		 * use the top down method and pretend your "Methods" are already written
		 * key things to consider:
		 * how to keep the code running instead of ending after it is ran until conditions are met
		 * how to keep track of members
		 * user input and way to give them a decision and they can pick one
		 * ways to help call on code to reuse for each function
		 */

		String[] team = new String[5];
//		"Team" is able to be used in each method without issues if the codes are self contained between brackets
		int decision = 0;	
		while(decision != -1) {
			showMenu();
			decision = s.nextInt(); 
			
			if (decision < -1 || decision > 5) {
				System.out.println("Invalid entry please try again.");
			
			} else if (decision == 1) {
				 addTeamMember(team);
			} else if (decision == 2) {
				viewTeamMember(team); 
			} else if (decision == 3) {
				viewAllMembers(team);
			} else if (decision == 4) {
				deleteTeamMember(team);
			} else { 
				deleteAllMembers(team);
//			to save on line(s) (cause only 1 line as your typing) make the "if" start with the "||"	 for the invalid entry instead of at the end.		
			}
		
		}
	}	
//		Becasue we dont need to validate any info or user inptu we just need a way to clear all names assigned into the array
		public static void deleteAllMembers(String[] team) {
/*		for (String member : team)
 * 		member = null; // this was tghe code originally used in the video but it didnt work so we trouble shoot it
 */
				for (int i = 0; i < team.length; i++) {
				team[i] = null;
				}
		}
	
		public static void deleteTeamMember(String[] team) {
			System.err.println("Which team member would you like to delete");
			int memberToDelete = s.nextInt();
			if(isValid(memberToDelete)) {
				team[memberToDelete] = null;
			}
		}
		public static void viewAllMembers(String[] team) {
			System.out.println("Team: ");
			// using the enhanced for loop seems good at first but you need a way to keep track of the int in your members
			for(int i = 0; i < team.length; i++) {
				System.out.println(i + ": " + team[i]);
			}
		}
		
		public static void viewTeamMember(String[] team)	{
			System.out.println("Which team member would you like to see? ");
			int teamNumber = s.nextInt();
			if (isValid(teamNumber)) {
			System.out.println(teamNumber + ": " + team[teamNumber]);
		} 
	}
		
		public static void addTeamMember(String[] team) {
			System.out.print("Enter new member name: ");
			String newMember = s.next();
//			its tricky to add something new to the array we have to find a way to keep track so we use an adding index outside of our class then plug addingIndex 
//			into team	// we also are gonna use "isValid" method for us to measure our data value
			if (isValid(addingIndex)) {
				team[addingIndex++] = newMember;
		}
	}		
//		making "isValid" boolean so we dont have to repeat code to measure our parameters		
		public static boolean isValid(int input) {
			if (input >= 0 && input <5 ) {
				return true;
			} else {
				System.out.println("Invalid entry.");
				return false;
			}
		}
	
	public static void showMenu() {
		System.out.println("Please pick and option or enter -1 to exit");
		System.out.println("1) Add team member");
		System.out.println("2) View team member");
		System.out.println("3) View all team members");
		System.out.println("4) Delete team member");
		System.out.println("5) Delete all team members");
			
		
	}

}
