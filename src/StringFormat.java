
import java.util.Scanner;

public class StringFormat {
	
		private String original_str = ""; //string to be formated
		private String pattern_str = ""; //string formating pattern
		private String formated_str = ""; //formated string
		private int pattern_str_len; //length of pattern string
		private int i; //counter
		private String dash_str = "-"; //the dash character
		private String temp_str = ""; //stores a temporary character as a string
		private char temp_char; // stores a temporary character to be changed to string
		private int strcounter = 0;
		
		/**
		 * This method changes an entered string into an entered pattern
		 * @return the formated string
		 */
		public String StringFormater(){
			System.out.println("\nFor this program you will first give any string or input"
					+ " you desire.\nThen you will give a pattern for the program to follow"
					+ " using dashes ('-') and x's ('x') like so: \nxxx-xx-xxxx\n"
					+ "This program will print the string or input in this format.\n"
					+ "\nEnter a string to be formated: ");
			Scanner in = new Scanner(System.in);
			original_str = in.nextLine(); //input string
			System.out.println("Enter a String format which contains only dashes ('-')"
					+ " and X's ('X'): ");
			pattern_str = in.nextLine(); //input pattern
			pattern_str_len = pattern_str.length();//determines the length of the pattern
			
			for(i=0; i <= pattern_str_len-1; i++){//iterates through the pattern string
				if (pattern_str.charAt(i) == 'X'|| pattern_str.charAt(i) == 'x'){
					//takes the character at counter
					temp_char = original_str.charAt(strcounter);
					//converts character to string
					temp_str = Character.toString(temp_char);
					//concatenates character to new string
					formated_str = formated_str.concat(temp_str);
					strcounter++;	
				} 
				else {
					formated_str = formated_str.concat(dash_str);
				}
			}
			System.out.println("Your output is:"+ formated_str);
			return formated_str;
		}
	}


