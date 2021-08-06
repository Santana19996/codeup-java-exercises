import java.util.Scanner;

public class MethodsExercise {
   static Scanner in  = new Scanner(System.in);

    public static int AdditionMethod(int number, int numberTwo) {
        return (number + numberTwo);

    }

    public static int SubtractionMethod(int number, int numberTwo) {
        return (number - numberTwo);
    }

    public static int MultiplicationMethod(int number, int numberTwo) {
        return (number * numberTwo);

    }

    public static double DivisionMethod(int number, int numberTwo) {
        return (number / numberTwo);
    }

    public static int FindModOfTwo(int number, int numberTwo) {
        return (number % numberTwo);
    }


    public static int getInteger(int min, int max){

       // do {
            System.out.print("Enter a number between " +  min + " and " +  max + ":");
           int input = in.nextInt();
            if (input < min || input>max){
                System.out.println("Input  not Accepted");
            return getInteger(min, max);

            }
     //   } while (input < min || input > max);
        return input;
    }
//public static String getFactorial
//
//    public static int CalculateFactorial (int number){
//        int FactorialNumber = getInteger(1, 10);
//        for (int i = 0; i <FactorialNumber ; i++) {
//            System.out.println(i + "! = " + i + "=" + 1);
//
//        }
//    }







                public static void main(String[] args) {
                    System.out.println(AdditionMethod(1,6));
                    System.out.println(SubtractionMethod(10,5));
                    System.out.println(MultiplicationMethod(10,6));
                    System.out.println(DivisionMethod(30,5));
                    System.out.println(FindModOfTwo(100,50));

                    getInteger(1,10);


    }
}
