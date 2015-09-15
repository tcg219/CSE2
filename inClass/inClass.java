//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Trent Gray
// CSE2
// 9/14/15

// This program is for the purpose of praticing while durring class in order to follow the professer.

  import java.util.Scanner;
  public class inClass {
      public static void main(String[] args) {
          
          Scanner scan = new Scanner(System.in);
          
          System.out.print("Enter a non-decimal integer: ");
          
          int amount = scan.nextInt();
          
          if (amount > 20) {
              System.out.println("Amount is greater than 20.");
          }
          
          else {
              System.out.println("Amount is less than 20.");
          }
      }
  }