//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Trent Gray
// CSE2
// 10/7/15

// This program is for the purpose of creating a square.

  import java.util.Scanner;
  public class SquareBoard {
      public static void main(String[] args) {
          
          Scanner scan = new Scanner(System.in);
          
          System.out.print("Enter the size of the square you want: ");
          
          double num = scan.nextDouble();
          
          while (true) {
              
          if (num % 1 != 0) {
              
              System.out.println("Invalid imput.");
              
              System.out.print("Enter an integer value for the size of the square: ");
              
              num = scan.nextDouble();
          }
          
          else {
              
              break;
              
          }
          }
          
          int size = (int) num;
          
          for (int x = 0; x < size; x++) {
            
            for (int y = 0; y < size; y++) {
              
              System.out.print(" #");
            }
            
            System.out.println("");
            
          }
      }
  }