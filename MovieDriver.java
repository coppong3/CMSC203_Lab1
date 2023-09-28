/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: Practice using multiple classes, access modifiers, and loops.
 * Due: 09/28/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Chrissie Oppong
 */

//import scanner package
import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		// create scanner
		Scanner scan = new Scanner(System.in);
		
		//create loop to repeat code
		boolean enterNewMovie = true;
	while(enterNewMovie) {		
		//create a movie object
		Movie movie = new Movie();
		
		//ask user to enter a movie title
		System.out.println("Enter the name of a movie:");
		
		//read in the title that the user enters
		String movieTitle = scan.nextLine(); //use nextLine() in case of spaces
		
		//set the title in the movie object
		movie.setTitle(movieTitle);
		
		//ask the user to enter the movie's rating
		System.out.println("Enter the rating of the movie:");
		
		//read in the movie's rating
		String movieRating = scan.nextLine();
		
		//set the rating in the movie object
		movie.setRating(movieRating);
		
		//ask the user to enter the number of tickets sold at a theater
		System.out.println("Enter the number of tickets sold for this movie:");
		

		//read in the integer value for tickets
		int numTickets = scan.nextInt();
		
		
		//scan.next to clear scanner
		scan.nextLine();
		
		//set the number of tickets sold in the movie object
		movie.setSoldTickets(numTickets);
		
		//print out the info using movie's toString method
		System.out.println(movie.toString());
		
		
		//ask user if they want to enter another movie
		System.out.println("Do you want to enter another movie? (y or n):");
		
		//read in user's answer
		String repeatChoice = scan.nextLine();
		
		//check if user wants to repeat and change loop variable if necessary
		if((repeatChoice.equalsIgnoreCase("y")) || (repeatChoice.equalsIgnoreCase("yes"))) {
			enterNewMovie = true;
		}
		else {
			enterNewMovie = false;
		}
		
		
	}//end while(enterAnotherMovie
		//print "Goodbye"
		System.out.println("Goodbye");
		
		//close scanner
		scan.close();
	}//end main

}
