package Package;

import java.util.*;
import java.util.Scanner;
/**
 *  Jason Salazar
 * September 18, 2021 
 * CS 216 Data Structures and Algorithms 
 */

public class PileOfBooksDemo {

	public static void main(String[] args) {
		
		// bookName is used to hold user input for names of the book, numberOfBooks is user input for number of bookName
		
		String bookName; 
		
		int numberOfBooks; 
			
		//NodeBag used to store the books
		
		PileInterface<String> NodeBag = new PileOfBooks<String>();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many books do you wish to have?");
		
		numberOfBooks = scan.nextInt();
		
		
		System.out.println("Type the name of the books.");
		
		// loop that holds user input names of bookName
		
		for (int e = 0; e < numberOfBooks; e++) {
			
			System.out.print(" Book " + (e + 1) + " : ");
			
			bookName = scan.next();
			
			NodeBag.add(bookName); 
		}
		
		// printing inputs of bookName
		
		System.out.println("The name of the books you chose were ");
		
		displayBag(NodeBag);
		
		// deleting the bookName at the top of the input list
		
		System.out.println(NodeBag.remove() + " was at the top of the list. It has been now been removed from the list.");
		
		System.out.println();

		// printing the rest of the bookName
		
		System.out.println("The remaining books are ");
		
		displayBag(NodeBag);
		
		// showing the bookName at the top
		
		System.out.println("What book is your top pick?");
		System.out.println("The book, " + NodeBag.getTopBook() + ", is your top listing.");
		System.out.println();

		// checking if Nodebag is empty 
		
	System.out.println("Checking if the bag is empty or not");
		
		if (NodeBag.isEmpty() == true) {
			
			System.out.println("Yes, the bag is empty.");
		
		} else {
		
			System.out.println("No, the bag is not empty.");
		}
		
		// Clearing the names in NodeBag
		
		NodeBag.clear();
		
		System.out.println("Is this bag empty?");
		
		if (NodeBag.isEmpty() == true) {
			
			System.out.println("Yes, the bag is empty");
		} else {
			
			System.out.println("No, the bag is not empty");
		}
		

	}

	// displaying bag
	
	private static void displayBag(PileInterface<String> NodeBag) {
		Object[] pileOfBooks = NodeBag.toArray();
		for (int index = 0; index < pileOfBooks.length; index++) {
			System.out.print(pileOfBooks[index] + "; ");
		}
		System.out.println(" ");

	}

}
