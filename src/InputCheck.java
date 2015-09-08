


public class InputCheck {
	
	/**
	 * this method will check if the input of a user is an integer
	 * @param a user input
	 * @return verified user input
	 */
	public static int checkInput(String a){
		double mod_result;
		double b;
		b=Double.parseDouble(a); // takes string a and converts to double
		mod_result = b % 1; // checks if the input stored in b is an integer
		
		if (mod_result==0){
			return 0; //the input is an integer
		}
		else{
			System.out.println("Invalid entry. Your answer should be an integer."
					+ "Make a new entry");
			return 1; //the input is not an integer
		}
	}
}
