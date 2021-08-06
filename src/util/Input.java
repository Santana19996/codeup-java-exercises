package util;

import java.util.Scanner;

public class Input {
   private Scanner userinput;

   public Input() {
      userinput = new Scanner(System.in);
   }

  public  String getString(){
      return null;
  }
   public boolean yesNo(){
      return true;
   }
   public int getInt(int min, int max){
      return max;
   }
   public int getInt(){
      return 5;
   }
  public  double getDouble(double min, double max){
      return min;
  }
   public double getDouble(){
      return 5;
   }


}