//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Trent Gray
// CSE2
// 9/14/15

// This program is for the purpose of praticing while durring class in order to follow the professer.

  import java.util.Scanner;
  public class HarmonicSum {
      public static void main(String[] args) {
          
          Scanner scan = new Scanner(System.in);
          
          double Total = 0;
          
          double total = 0;
          
          System.out.print("Enter a number: ");
          
          double x = scan.nextInt();
          
          for (double n = 1; n != x + 1; n++) {
            
            double devide = 1/n;
            
            total = total + devide;
            
          }
          
          for (double y = x; y != 0; y--) {
            
            double sum = 1/y;
            
            Total = Total + sum;
          }
          
          System.out.println("The sum is " + total + " and " + Total + ".");
          
      }
  }