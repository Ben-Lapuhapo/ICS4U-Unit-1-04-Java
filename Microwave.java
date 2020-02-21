/****************************************************************************
 *
 * Created by: Ben Lapuhapo
 * Created on: Febuary 20 2019
 * Created for: ICS4U
 * This program tells the user how long it will take to microwave their item 
 * of choice, given its quantity.
 *
 ****************************************************************************/

import java.util.Scanner;

public class Microwave {

	public static void main(String[] args) {
		
        double TimeOfFood = 0;
        
        // property
        double TimeOfSub = 1;
        double TimeOfPizza = 0.75;
        double TimeOfSoup = 1.75;
		
        // get item from user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose one of the 3 options and Enter the first item name with a CAPITAL LETTER.");
		System.out.println("What would you like to heat up a Sub, Pizza or Soup?:");
		String UserChoice = scanner.nextLine();
		
		// get quantity of item from user
		if (UserChoice.equals("Sub") || UserChoice.equals("Pizza") || UserChoice.equals("Soup")) {
			System.out.println("How many " + UserChoice + " Would you like to heat? You can choose 1, 2 or 3.");
			int quantity = scanner.nextInt();
			scanner.close();
			
			//calculate time required to heat up iteam based on quantity entered by user
			if(quantity == 1 && UserChoice.equals("Sub")) {
				TimeOfFood = TimeOfSub * 1;
			}
			else if (quantity == 1 && UserChoice.equals("Pizza")) {
				TimeOfFood = TimeOfPizza * 1;
			}
			else if (quantity == 1 && UserChoice.equals("Soup")) {
				TimeOfFood = TimeOfSoup * 1;
			}
			else if(quantity == 2 && UserChoice.equals("Sub")) {
				TimeOfFood = TimeOfSub * 1.5;
			}
			else if (quantity == 2 && UserChoice.equals("Pizza")) {
				TimeOfFood = TimeOfPizza * 1.5;
			}
			else if (quantity == 2 && UserChoice.equals("Soup")) {
				TimeOfFood = TimeOfSoup * 1.5;
			}
			else if(quantity == 3 && UserChoice.equals("Sub")) {
				TimeOfFood = TimeOfSub * 2;
			}
			else if (quantity == 3 && UserChoice.equals("Pizza")) {
				TimeOfFood = TimeOfPizza * 2;
			}
			else if (quantity == 3 && UserChoice.equals("Soup")) {
				TimeOfFood = TimeOfSoup * 2;
			}
			
			//Test for an invalid input (value user inputted is not 1, 2 or 3) 		
			if(quantity > 3) {
			    System.out.println("Please choose a valid input. ");
			}
			else {
				System.out.println("The total time is: " + TimeOfFood + " minutes");
			}
		}
		else {
			System.out.println("Invalid Input!! Please Try Again. ");
		}
		
	}

}