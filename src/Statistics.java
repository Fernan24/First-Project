

public class Statistics {
	/**
	 * This method shows the statistics of execution of methods in the program
	 * @param a refers to the Quadratic Equation method
	 * @param b refers to the Average of numbers method
	 * @param c refers to the Reverse a String method
	 * @param d refers to the Format a String method
	 * @param e refers to the Show Statistics method
	 */
	public static void showStatistics(int a,int b, int c, int d, int e) {
		
		System.out.println("Statistics:");
		System.out.println("Operation in the Program           |       "
				+ "    Number of times executed");
		System.out.println("===================================|======="
				+ "==============================");
		System.out.printf("Process the Quadratic Equation     |      "
				+ "                %d\n", a);
		System.out.printf("Compute the Average of Numbers     |      "
				+ "                %d\n", b);
		System.out.printf("Reverse a String                   |      "
				+ "                %d\n", c);
		System.out.printf("Format a String                    |      "
				+ "                %d\n", d);
		System.out.printf("Show Statistics                    |      "
				+ "                %d\n", e);		
		//menu main1 = new menu();
		//main1.MainMenu();
	}
}
