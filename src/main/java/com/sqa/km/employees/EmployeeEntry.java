/**
 *   File Name: EmployeeEntry.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Nov 23, 2015
 *
 */

package com.sqa.km.employees;

import java.util.Scanner;

/**
 * EmployeeEntry //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
// public class EmployeeEntry {
// private static String[] addresses;
//
// private static String[] ages;
//
// private static String[] jobTitles;
//
// private static String[] names;
// private static String[] newAddresses;
// private static String[] newAges;
// private static String[] newJobTitles;
// private static String[] newNames;
// private static Scanner scanner;
//
// public static boolean addEmployees() {
// // Variable to hold num of Employees
// int numEmployees;
// // Ask the user How many employees they like to add
// System.out.print("How many employees would you like to add? ");
// // Use a try catch to handle issues when user enters letters and
// // not a valid number format
// try {
// // Hinlight the line under, right click, choose "Surround with",
// // then "Try/Catch Block
// // Convert the input from user to a number
// numEmployees = Integer.parseInt(scanner.nextLine());
// newNames = new String[numEmployees];
// newAddresses = new String[numEmployees];
// newAges = new String[numEmployees];
// newJobTitles = new String[numEmployees];
// // Use a loop to call the addEmployee method for each employee that
// // you want to add to the application
// for (int i = 0; i < numEmployees; i++) {
// createEmployee(i);
// }
//
// } catch (NumberFormatException e) {
// // Omit the stack trace that is printed to the console when
// // user enters letters instead of numbers
//
// // e.printStackTrace();
// // Tell the user to enter the valid number
// System.out.print("Please enter a valid number.");
// return true;
//
// }
// while (true) {
//
// System.out.print("Would you like to addmore employees?");
// String input = scanner.nextLine();
// if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y")) {
// return true;
// } else if (input.equalsIgnoreCase("no")
// || input.equalsIgnoreCase("n")) {
// return false;
// } else {
// continue;
// }
//
// }
//
// }
//
// public static void main(String[] args) {
// // Welcome the user
// scanner = new Scanner(System.in);
// System.out.println("Welcome to Employee Entry Application");
// // addEmployees() - that's the method
// while (addEmployees()) {
//
// }
// displayEmployees();
// System.out
// .println("Thank you for using the Employee Entry Application");
// scanner.close();
// System.exit(0);
// }
//
// /**
// * @param i
// *
// */
// private static void createEmployee(int i) {
// String name;
// String age;
// String address;
// String jobTitle;
//
// System.out.println("What is employee " + (i + 1) + "'s name:");
// name = scanner.nextLine();
// System.out.println("What is " + name + "'s age:");
// age = scanner.nextLine();
// System.out.println("What is " + name + "'s address:");
// address = scanner.nextLine();
// System.out.println("What is " + name + "'s jobTitle:");
// jobTitle = scanner.nextLine();
//
// // set those values into the new arrays
//
// newNames[i] = name;
// newAges[i] = age;
// newAddresses[i] = address;
// newJobTitles[i] = jobTitle;
// }
//
// private static void displayEmployees() {
// for (int i = 0; i < newNames.length; i++) {
// System.out.println(i + ") Name:" + newNames[i] + " Age:"
// + newAges[i] + " Address:" + newAddresses[i]
// + " Job Title:" + newJobTitles[i]);
// }
//
//
//
// }
// }

public class EmployeeEntry {

	private static String[] addresses;

	private static String[] ages;

	private static String[] jobTitles;

	private static String[] names;

	private static String[] newAddresses;

	private static String[] newAges;

	private static String[] newJobTitles;

	private static String[] newNames;

	private static Scanner scanner;

	public static boolean addEmployees() {
		// Variable to hold num of Employees
		int numEmployees;
		// Ask the user how many employees they want to add
		System.out.print("How many employees would you like to add:");
		// Use a try catch to handle issues when user enters letters and not a
		// valid number format
		try {
			// Convert the input from user to a number
			numEmployees = Integer.parseInt(scanner.nextLine());
			// Initialize the new Arrays to the size requested by user
			newNames = new String[numEmployees];
			newAges = new String[numEmployees];
			newAddresses = new String[numEmployees];
			newJobTitles = new String[numEmployees];
			// Use a loop to call the addEmployee method for each employee that
			// you want to add to the application
			for (int i = 0; i < numEmployees; i++) {
				// Invokes the method that creates new employees
				createEmployee(i);
			}
			// Invoke the method which merges the employees if there are old
			// ones
			mergeEmployees();
		} catch (NumberFormatException e) {
			// Omit the stack trace that is printed to the console when user
			// enters letters instead of numbers
			// e.printStackTrace();
			// Tell the user to enter a valid number
			System.out.println("Please enter a valid number.");
			// return true to the calling method so that it may continue
			// executing this method
			return true;
		}
		// Create an infinite loop which terminates if a valid option is
		// selected
		while (true) {
			System.out.print("Would you like to add more employees:");
			// Set console input to temporary local variable input
			String input = scanner.nextLine();
			// If the user enters Yes...
			if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y")) {
				// return true to the calling method, addEmployees (this
				// continues to add employees)
				return true;
				// If the user enter no...
			} else if (input.equalsIgnoreCase("no")
					|| input.equalsIgnoreCase("n")) {
				// return false to the calling method, addEmployees (this
				// terminates the adding of employees)
				return false;
				// Else continue the infinite loop of asking if they want to add
				// employeesd
			} else {
				System.out.println("Please responsde with a Yes/Y or No/N");
				continue;
			}
		}
	}

	public static void displayEmployees() {
		// For the length of all the newly entered employees...
		for (int i = 0; i < names.length; i++) {
			// Display their respective information
			System.out
					.println(i + 1 + ") Name:" + names[i] + " Age:" + ages[i]
							+ " Address:" + addresses[i] + " Job Title:"
							+ jobTitles[i]);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Welcome the user
		scanner = new Scanner(System.in);
		System.out.println("Welcome to the Employee Entry Application");
		// While addEmployees method return true
		while (addEmployees()) {
		}
		// Display the employees information by invoking the disaplyEmployees
		// method
		displayEmployees();
		System.out
				.println("Thank you for using the Employee Entry Application");
		// Close the Scanner object to advoid memory leakage
		scanner.close();
		// Oficially exit the system
		System.exit(0);
	}

	public static void mergeEmployees() {
		if (names != null) {
			// Create an array with the size of both new and old arrays
			String[] mergedNames = new String[names.length + newNames.length];
			String[] mergedAges = new String[ages.length + newAges.length];
			String[] mergedAddresses = new String[addresses.length
					+ newAddresses.length];
			String[] mergedJobTitles = new String[jobTitles.length
					+ newJobTitles.length];
			// Add the system variables to the local merged array variables
			for (int i = 0; i < names.length; i++) {
				mergedNames[i] = names[i];
				mergedAges[i] = ages[i];
				mergedAddresses[i] = addresses[i];
				mergedJobTitles[i] = jobTitles[i];
			}
			// Add the new value variables to the local merged array variables
			for (int i = names.length, j = 0; i < mergedNames.length; i++, j++) {
				mergedNames[i] = newNames[j];
				mergedAddresses[i] = newAddresses[j];
				mergedAges[i] = newAges[j];
				mergedJobTitles[i] = newJobTitles[j];
			}
			// Set the system variables to the merged array values
			names = mergedNames;
			ages = mergedAges;
			addresses = mergedAddresses;
			jobTitles = mergedJobTitles;
		} else {
			// Just set the new values to the regular variables
			names = newNames;
			addresses = newAddresses;
			ages = newAges;
			jobTitles = newJobTitles;
		}
	}

	/**
	 * @param i
	 */
	private static void createEmployee(int i) {
		// Variables to hold values
		String name;
		String age;
		String address;
		String jobTitle;
		// Request values for employees
		System.out.println("What is employee " + (i + 1) + "'s name:");
		name = scanner.nextLine();
		System.out.println("What is " + name + "'s age:");
		age = scanner.nextLine();
		System.out.println("What is " + name + "'s address:");
		address = scanner.nextLine();
		System.out.println("What is " + name + "'s job title:");
		jobTitle = scanner.nextLine();
		// Set those values into the new arrays
		newNames[i] = name;
		newAges[i] = age;
		newAddresses[i] = address;
		newJobTitles[i] = jobTitle;
	}
}