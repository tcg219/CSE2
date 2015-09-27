////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Trent Gray
// CSE2
// 9/24/15
//
// The purpose of this program is to test out the while method of the loop tool. Should be fun!!!

  import java.util.Scanner;
  public class inFinity {
      public static void main(String[] args) {
          
          Scanner scan = new Scanner(System.in);
         
            System.out.print("Type in Whatever: ");
              String whatever = scan.next();
              
          int x = 1;
          while (x == 1) {
              

              System.out.print(whatever);
          }
      }
  }