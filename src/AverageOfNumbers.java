
import java.util.Scanner;

public class AverageOfNumbers {
	
	private double value; // the value entered by the user 
	private double sum=0; // the sum of all the values
	private double avg; // the average
	private int count=0; // the number of entries by the user
	/**
	 * This method computes the average of any number of non negative entries by a user
	 * @return avg is the average calculated by the program
	 * @return 0 if there is 0 entries
	 */
	public double computeAverage(){
		System.out.println("Please enter any number of positve values and this"
				+ " program will calculate the average. To stop entering numbers "
				+ "enter a negative number. \nNote that this negative number will "
				+ "not be included in the list of numbers.\n");
		
		Scanner in =new Scanner(System.in);
		
		//enter a value while the input is non negative
		System.out.println("Enter a value: ");
		value = in.nextDouble();
		
		do{
			sum += value; //adds the number to sum
			count++; //counter	
			System.out.println("Enter a value: ");
			value = in.nextDouble();
			}while(value>=0.0);
		
			//calculates the average
			if (count>0){
				avg = sum/count;
				System.out.println("The average is: "+ avg);
				return avg;
			}
			else{
				System.out.println("Cannot calculate average with 0 entries.\n");
				return 0;
			}	
		
	}	
}
