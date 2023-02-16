
import java.util.Scanner;

public class MovieDriver_Task1 {


	public static void main(String[] args) {

		String choice;
		
		Scanner input = new Scanner(System.in);
		
		Movie movieInformation = new Movie();
		
		System.out.println("Enter the name of a movie");
		String title = input.nextLine();
		movieInformation.setTitle(title);
		
		System.out.println("Enter the rating of the movie");
		String rating = input.nextLine();
		movieInformation.setRating(rating);
		
		System.out.println("Enter the number of tickets sold");
		int soldTickets = input.nextInt();
		movieInformation.setSoldTickets(soldTickets);
		
		System.out.println(movieInformation.toString());
		
		System.out.println("Goodbye");
	}

}


