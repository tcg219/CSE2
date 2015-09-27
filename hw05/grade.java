////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Trent Gray
// CSE2
// 9/27/15

  import java.util.Scanner;
  public class grade {
      public static void main(String[] args) {
          
          Scanner scan = new Scanner(System.in);
          
          boolean loop = true;
          
          double sum = 0;
          
          double x = 0;
         
         while (loop = true) {
             
             System.out.print("Enter a grade: ");
             
             double i = scan.nextDouble();
             
             sum = sum + i;
             
             x = x + 1; 
             
             if (i == 999) {
                 
                 double total = sum - 999;
                 
                 double numGrades = x - 1;
                 
                 double average = total / numGrades;
                 
                 int roundAve = (int) average;
                 
                 System.out.println("The rounded average of the valid grades is " + roundAve + ".");
                 
                 break;
                 
             }
             
             else if (i <= 100 && i >= 0) {
                 
                 
             }
             
             else {
                 
                 sum = sum - i;
                 
                 x = x - 1;
                 
                 System.out.println("Invalid imput. Grades must be no less than 0 and no greater than 100.");
                 
             }
         }
         
      }
  }