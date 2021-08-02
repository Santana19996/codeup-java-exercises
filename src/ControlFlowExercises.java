public class ControlFlowExercises {
    public static void main(String[]args) {

//        int i = 5;
//        while(i <= 15){
//            System.out.println(i);
//            i++;
//        }


        //  Increment by 2 Do-While Loop
//int i = 0;
//
//do {
//    System.out.println(i);
//i+=2;
//}while (i <= 100);

        //Do-While Count Backwards by 5's
//        int i = 100;
//        do {
//            System.out.println(i++);
//            i+=-6;
//        } while (i>=-10);
//        }

//Do While Squared
//        long i = 2L;
//        do {
//            System.out.println(i);
//            i = (long) Math.pow(i,2);
//        } while (i < 1000000);

//Refactored
//        for (long i = 2; i < 1000000; i = (long) Math.pow(i,2) ) {
//
//            System.out.println(i);
//        }





//Refactored the First While Loop
//        for (int i = 5; i < 16; i++) {
//            System.out.println(i);
//        }

//        for (int i = 0; i <101 ; i+=2) {
//
//            System.out.println(i);
//        }

        String mult3 = "Fizz";
        String mult5 = "Buzz";
        String mult3and5 = "Fizzbuzz";
//Why does the double expression need to be on top
        for (int i = 1; i <101 ;i++ ) {
               if ((i % 3==0) && (i % 5==0)){
                    System.out.println(mult3and5+" ");
            }
           else if (i%5==0){
                System.out.println(mult5+ "");


            }
            else if ((i %3==0)){
                    System.out.println(mult3 + "");

            }
            else
            System.out.println(i);
        }

    }
    }





