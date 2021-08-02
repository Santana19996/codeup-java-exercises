import java.util.Arrays;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[]args){
//        System.out.print("Hello World!");





        int myFavoriteNumber = 21;
        System.out.print(myFavoriteNumber);

 String MyString = "Hello";
System.out.print("\nMyString");

//double myNumber =3.14;
//System.out.print(myNumber);
//
//        int x = 5;
//        System.out.println(++x);
      //  System.out.println(x);



//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;



        int x = 4;
//        x = x + 5;


        x += 5;
//        System.out.print(x);
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print(" Enter Something");
//        String userInput = scanner.nextLine();
//        System.out.println("You entered: -->\" " +userInput + "\" <--");
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print(" Enter Something ");
//        int userNumber = scanner.nextInt();
//        System.out.printf("You entered %s \n",userNumber);
//
//     Scanner scanner = new Scanner(System.in);
//      System.out.print(" Enter 3 words ");
//      String userInput = scanner.next();
//       System.out.println("You entered: -->\" " +userInput + "\" <--");
//
//       String first_word;
//       first_word = userInput;
//
//       String secondWord;
//       secondWord = scanner.next();
//
//       String ThirdWord;
//       ThirdWord = scanner.next();
//
//        System.out.println(first_word);
//        System.out.println(secondWord);
//        System.out.println(ThirdWord);

//        Scanner scanner = new Scanner(System.in);
//       System.out.print(" Enter A Sentence ");
//       String userInput = scanner.nextLine();
//
//
//        System.out.println(userInput);

//        Scanner scanner = new Scanner(System.in);
//
//     System.out.print(" Enter the length  of the Codeup Classrom:");
//
//        String userInput = scanner.nextLine();
//        double UserNumbers = Integer.parseInt(userInput);
//        System.out.println("You entered Length: -->\" " +UserNumbers + "\" <--");
//
//
//        System.out.println("Enter the Width of the Classroom");
//        String UserInputWidth = scanner.nextLine();
//        double  UserWidth = Integer.parseInt(UserInputWidth);
//        System.out.println("You entered Width: -->\" " +UserInputWidth + "\" <--");
//
//        double area = UserNumbers * UserWidth;
//        double perimiter = area * 2;
//        System.out.printf("The area of the classroom is %s \n",area );
//        System.out.printf("The perimeter of the classroom is %s \n",perimiter);
////        System.out.println("You entered Width) \" " +area+ "\" \""+perimiter+"\"");
//
//        System.out.println("What is the height of the Codeup Classroom?:");
//        String userInputHeight = scanner.nextLine();
//        double UserHeight = Integer.parseInt(userInputHeight);
//        System.out.println("You entered Height: -->\" " +userInputHeight + "\" <--");
//        double volume = UserNumbers * UserWidth * UserHeight;
//        System.out.printf("The volume of the Codeup Classroom is: %s \n",volume);

        for(int i = 1; i <= 10; i++) { // <--+
            if(i % 2 == 1) { //              |
                continue; // ----------------+
            }
            System.out.println(i);
        }
        }
    }
