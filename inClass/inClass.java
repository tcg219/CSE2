//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Trent Gray
// CSE2
// 9/14/15

// This program is for the purpose of praticing while durring class in order to follow the professer.

  import java.util.Scanner;
  public class inClass {
      public static void main(String[] args) {
          
          Scanner scan = new Scanner(System.in);
          
          int i = 1;
          int sum=0;
          
          while (i <= 10) {
            System.out.print(i);
            i = i+1;
            sum += i;
            
           System.out.println(sum);
          }
      }
  }