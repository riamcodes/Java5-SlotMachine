//NAME: Ria Mukherji
//SMU ID: 48877496
//LAB: Lab 5 fall 2022
//INSTRUCTOR: Dixit,Paarul Howard,Ken

import java.util.Scanner;
import java.util.Random;

public class Slots1 {

	//main method prompts user to spin or quit using a for loop
	public static void main(String[] args) {
		
		//Scanner
		Scanner Scan = new Scanner(System.in);
		
		
		//Strings that will contain the names
		String name1 = new String();
		String name2 = new String();
		String name3 = new String();
		
		//While true loop
		while (true) {
			System.out.print("Spin/Quit (S/Q) : ");
			
			//create variable response to store the users response
			String response = Scan.next();
			
			//if user responds with S
			if (response.equalsIgnoreCase("S"))
			{
				//Randomly assign the names by calling spin wheel
				name1 = spinWheel();
				name2 = spinWheel();
				name3 = spinWheel();
				
				System.out.println(name1 + " - " + name2 + " - " +  name3);
			}
			//if user responds with Q
			else if (response.equalsIgnoreCase("Q")) {
				break;
			}
		
			
		}//end loop

	}// end main
	
	//method contains an array of 4 strings and calls a random number representative of the index of one of the strings. It then returns the string.
	public static String spinWheel(){
		String names[] = new String[] {"Mickey", "Minnie", "Donald","Daisy"};
		//rand is a number between 0 and 3 assigned to the array list index so that a random name can be chosen
		Random rand = new Random();
		int random;
		random = rand.nextInt(4);
		String nameChoice = names[random];
		return nameChoice;
	}//end spinWheel

}//end class
