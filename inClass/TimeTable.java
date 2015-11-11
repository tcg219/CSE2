//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Trent Gray
// CSE2
// 10/7/15

// This program is for the purpose of creating a Times Table.

  import java.util.Scanner;
  public class TimeTable {
      public static void main(String[] args) {
          
          Scanner scan = new Scanner(System.in);
          
          System.out.println(" * 1 2 3 4 5 6 7 8 9");
          
          int x = 1;
          
          for (int row = 1; row < 10; row++){
          
          System.out.print(" " + x);
          
          for (int num = 1; num <= 9; num++){
          
          int print = num * row;
          
          System.out.print(" " + print);
          
          }
          
          x++;
          
          System.out.println("");
          
          }
      }
  }