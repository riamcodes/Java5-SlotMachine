import java.util.Random;
import java.util.Scanner;

public class Slots3 {
	//main method prompts user to spin or quit using a for loop
		public static void main(String[] args) {
			
			//money player has and is updated throughout game
			double money = 0;
			
			//Strings that will contain the name 
			String name1 = new String();
			String name2 = new String();
			String name3 = new String();
			Scanner Scan = new Scanner(System.in);
			
			System.out.print("How much money would you like to insert? ");
			money = Scan.nextDouble();
			
			//while true loop
			while (true) {
				System.out.print("Spin/Quit (S/Q) : ");
				//create variable response to store the users response
				String response = Scan.next();
				//If user responds with S
				if (response.equalsIgnoreCase("S"))
				{ 
					System.out.println("Paid 0.25 to spin....");
					money -= .25;
					name1 = spinWheel();
					name2 = spinWheel();
					name3 = spinWheel();
					
					System.out.println(name1 + " - " + name2 + " - " +  name3);
					money += checkWinner(name1,name2,name3);
					System.out.printf("now have $%.2f\n", money);
				}
				//If user responds with Q
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
		
		//method checks to see if Spins are the same and returns a double based on how many of the spins match.
		public static double checkWinner(String a, String  b, String c)
		{
			//value is the double to return
			double value = 0;
			
			//check how many of the names are the same and increment value based on outcome
			if (a.equals(b)||a.equals(c))
			{
				value +=.5;
			}
			if (b.equals(c))
			{
				value += .5;
			}
			
			//Print out a String based on the final value of double value
			if (value == 0)
			{
				System.out.println("No prize");
			}
		    if (value == 0.5)
				System.out.println("Won 50 cents");
		    if (value == 1)
				System.out.println("Won $1");
		    
		    //return value
			return value;
		}//end checkWinner
	

}//end class
