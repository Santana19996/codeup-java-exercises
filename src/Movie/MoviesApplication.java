
package Movie;
import java.util.Scanner;
public class MoviesApplication extends Movie


{


    public MoviesApplication(String name, String category) {
        super(name, category);
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("What would you like to do?"  +
                  "\n 0 - exit"
                + "\n 1 - view all movies"
                + "\n 2 - view movies in the animated category"
        + "\n 3 - view movies in the drama category" +
         "\n 4 - view movies in the horror category" +
         "\n 5 - view movies in the scifi category");
        System.out.println("Enter your choice:");
        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input
    }
}
