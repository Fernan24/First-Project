

import java.util.Scanner;


public class ReverseString {
	private String user_str=""; //input by user
	private String new_str=""; //output of the method execution
	private char temp_char; //stores a character temporarily
	private String temp_str="";//a temporary string to iterate through characters
	private int str_len; //stores the length of the string
	
	/**
	 * this method asks for any input form the user to display the reverse of the input
	 * @return the reverse input as a string
	 */
	public String stringReverse(){
		System.out.print("This program will ask for a string or any input"
				+ " you desire and it will show the reverse "
				+ "of the input you entered."
				+ "\nPlease enter a the desired string to reverse: ");
		Scanner s1 = new Scanner(System.in);
		user_str = s1.nextLine(); //input
		str_len=user_str.length();//string length
		for(int i=str_len-1; i >= 0; i--){ //iterates through every character 
			temp_char = user_str.charAt(i); //takes the character at index 1
			temp_str=Character.toString(temp_char); //converts character to string
			new_str = new_str.concat(temp_str); //concatenates character to new string
		}
		System.out.printf("\nYour reversed string is: %s \n", new_str);
		return new_str;
	}
	
}
	