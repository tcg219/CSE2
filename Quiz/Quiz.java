////////////////////////////////////////////////////////////////////////////////////////////////
// Trent Gray
// CSE2

// The point of this program is to use it in order to help figure out questions for quizzes.

  import java.util.Scanner;
  
  public class Quiz {
      public static void main(String[] args) {
          
          Scanner scan = new Scanner(System.in);
          System.out.print("Enter your first number: ");
          double one = scan.nextDouble();
          System.out.print("Enter your second number: ");
          double two = scan.nextDouble();
          System.out.print("Enter your third number: ");
          double three = scan.nextDouble();
          double average = (one + two + three) / 3;
          System.out.println("The average of your three numbers is " + average + ".");
      }
  }