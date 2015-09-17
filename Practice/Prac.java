////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Trent Gray
// CSE2
// 9/8/15
  
  import java.util.Scanner;
  public class Prac {
      public static void main(String[] args) {
          
          Scanner scan = new Scanner(System.in);
          System.out.println("Goodmoring me, are you having a good morning?");
          System.out.print("Yes or No: ");
          
          String yesNo = scan.nextString();
            
           switch (yesNo) {
             case Yes:
               System.out.println("Great! Perhaps you should grab a cup of coffee!");
               break;
             case No:
               System.out.prinln("That's too bad. Perhaps you should grab a cup of coffee?");
               break;
             default:
               System.out.println("That's not a valid input. Perhapst you should grab a cup of coffee.");
           }
      }
  }