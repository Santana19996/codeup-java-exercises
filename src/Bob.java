import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);




        String name = "Bob";
        String Response1 = "Sure";
        String Response2= "Whoa,chill out";
        String Response3= "Fine.Be That Way!";
        String Response4 = "Whatever";

        String input;

        input= in.nextLine();

        while (true) {
            if(input.endsWith("?")){
                System.out.printf(Response1);
                break;
            }

            if (input.endsWith("!")){
                System.out.printf(Response2);
              break;
            }
            if (input.equals("")){
                System.out.printf(Response3);
                 break;
            }
            else {
                System.out.printf(Response4);
              break;
            }
        }

    }
}
