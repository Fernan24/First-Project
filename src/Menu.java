
import java.util.Scanner;

public class Menu {
	

		private int fail_select; //number of chances to select valid option
		private String user_answ1, user_answ2, user_answ3; //user answer as string 
		private int temp1, temp2, temp3; //stores the value of the input check method
		private int checked_ans1,checked_ans2, checked_ans3; //executes the choice of the user
		private int a, b, c; // Coefficients for the quadratic equation method
		private int average_count = 0; //statistics counter for average method execution
		private int quadratic_count = 0; //statistics counter for quadratic method execution
		private int reverse_count = 0;//statistics counter for reverse string method execution
		private int format_count = 0;//statistics counter for string formatter method execution
		private int statistics_count = 0;//statistics counter for statistics display method execution
		private Scanner input; // scanner object
		
		public Menu(Scanner input)
		{
			this.input = input;
		}
		/**
		 * This method displays the main menu
		 */
		public void MainMenu(){
			
			fail_select=3; // the amount of attempts available to user for correct selection
			//checks if user input is int
			while (fail_select>0){
				//displays Main menu
				System.out.println("\nMain Menu:\n"
						+ "1) Perform Operations on Numbers\n"
						+ "2) Perform Operations on Strings\n"
						+ "3) Show use Statistics\n"
						+ "4) Exit Program");
				
				do{ //input check
					user_answ1 = input.nextLine(); //user input for menu selection
					temp1 = InputCheck.checkInput(user_answ1);
				} while(temp1==1);
				
				checked_ans1 = Integer.parseInt(user_answ1);
				//executes method based on user selection
				switch (checked_ans1){
					case 1:
						subMenu_numbers(); // shows number operations sub menu
						break;
					case 2:
						submenu_strings(); // shows String operations sub menu
						break;
					case 3:// shows statistics of method use
						statistics_count++;
						Statistics.showStatistics(getQuadratic_count(), getAverage_count(),
								getReverse_count(), getFormat_count(), getStatistics_count());
						break;
					case 4:
						System.out.println("Program terminated.");
						System.exit(0); //normal termination
						break;
					default:
							fail_select--;
							if (fail_select>0){
								System.out.printf("Invalid selection. You now have %d "
									+ "attempts left. Please try again.\n", fail_select);
							} 
							else {
								System.out.println("You have no more attempts available. "
										+ "\nProgram terminated.");
								System.exit(1); //abnormal termination
							}
							break;
				}		
			}
		}
		
		/**
		 * this method will display sub menu with number operations
		 */
		public void subMenu_numbers(){
			
			fail_select=3; //attempts reset to 3 upon correct selection
			//display numbers sub menu
			while(fail_select>0){
				System.out.println("\nNumber Operations Menu:\n"
						+ "1) Process Quadratic Equation\n"
						+ "2) Compute Average of list of Numbers\n"
						+ "3) Exit to Main Menu");
				
				do{//input check
					user_answ2 = input.nextLine(); //user input for menu selection
					temp1 = InputCheck.checkInput(user_answ2);
					} while(temp2==1);
					
					checked_ans2 = Integer.parseInt(user_answ2);
					//executes method based on user selection
				switch (checked_ans2){
					case 1:
						System.out.println("Enter a value for the A coeficient:");
						Scanner coef1 = new Scanner(System.in);
						a = coef1.nextInt();
						
						System.out.println("Enter a value for the B coeficient:");
						Scanner coef2 = new Scanner(System.in);
						b = coef2.nextInt();
						
						System.out.println("Enter a value for the C coeficient:");
						Scanner coef3 = new Scanner(System.in);
						c = coef3.nextInt();
						
						QuadraticEquation obj1 = new QuadraticEquation(a, b, c);
						obj1.discriminat(a, b, c);
						obj1.realSolutionsCount();
						obj1.getRealSolutions();
						obj1.getRealSolutions();
						obj1.displayFLOATPair();
						quadratic_count ++;
						;
						break;
					case 2:
						AverageOfNumbers obj2 = new AverageOfNumbers();
						average_count ++;
						obj2.computeAverage();
						break;
					case 3:
						 MainMenu();
						break;
					default: //fail select
						fail_select--;
						if (fail_select>0){
							System.out.printf("Invalid selection. You now have %d "
								+ "attempts left. Please try again.\n", fail_select);
						} 
						else {
							System.out.println("You have no more attempts available. "
									+ "\nProgram terminated.");
							System.exit(1);
						}
						break;
				}
			}
		}
		
		/**
		 * This method displays the string oriented sub menu
		 */
		public void submenu_strings(){
			
			fail_select = 3; //attempts reset to 3 upon correct selection
			//display sub menu
			while(fail_select>0){
				System.out.println("\nString Operations Menu:\n"
						+ "1) Show reverse of a given string\n"
						+ "2) Format Strings\n"
						+ "3) Exit to Main Menu");
				do{ //input check
					user_answ3 = input.nextLine(); //user input for menu selection
					temp3 = InputCheck.checkInput(user_answ3);
					} while(temp3==1);
					
					checked_ans3 = Integer.parseInt(user_answ3);
					//execution of methods based on user input
				switch (checked_ans3){
					case 1:
						ReverseString obj3 = new ReverseString();
						obj3.stringReverse();
						reverse_count ++;
						break;
					case 2:
						StringFormat obj4 = new StringFormat();
						obj4.StringFormater();
						format_count ++;
						break;
					case 3:
						MainMenu();
						break;
					default: //failed selection
						fail_select--;
						if (fail_select>0){
							System.out.printf("Invalid selection. You now have %d "
								+ "attempts left. Please try again.\n", fail_select);
						} 
						else {
							System.out.println("You have no more attempts available. "
									+ "\nProgram terminated.");
							System.exit(1);
						}
						break;
				}
			}
		}
		/**
		 * @return the average_count
		 */
		public int getAverage_count() {
			return average_count;
		}

		/**
		 * @return the quadratic_count
		 */
		public int getQuadratic_count() {
			return quadratic_count;
		}

		/**
		 * @return the reverse_count
		 */
		public int getReverse_count() {
			return reverse_count;
		}

		/**
		 * @return the format_count
		 */
		public int getFormat_count() {
			return format_count;
		}

		/**
		 * @return the statistics_count
		 */
		public int getStatistics_count() {
			return statistics_count;
		}


}

