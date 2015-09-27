////////////////////////////////////////////////////////////////////////////////////////////////
// Trent Gray
// CSE2

// The point of this program is to use it in order to help figure out questions for quizzes.

  import java.util.Scanner;
  
  public class Quiz {
      public static void main(String[] args) {
          
          Scanner in = new Scanner (System.in);
          
          System.out.print("What is your monthly rent cost?");
          
          int rent = in.nextInt();
            
            if (600 > rent || rent > 1200) {
              
              System.out.println("Unusual rent you have there.");
            }
      }
  }