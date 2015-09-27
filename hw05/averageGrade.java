////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Trent Gray
// CSE2
// 9/26/15

// The purpose of this program is to calculate the average grade of a bunch of test grades, which are imput by the user,
// using a while loop and if-else statements.

  import java.util.Scanner; // The line of code here tells the computer to import a scanner from jave to be uses in the program to
  // allow the user of the program to imput information.
  
  public class averageGrade { // This line sets up a class called averageGrade which will hold all of the code for the program within
  // it.
    
      public static void main(String[] args) { // This here tells the computer to have java use the main method to analyze all of the
      // code contained within the public static void.
          
          Scanner scan = new Scanner(System.in); // The line of code here tells the computer to create a new scanner class called
          // scan which can now be implemented in the rest of the program to use the scanner to scan the users imput and use it
          // in the program.
          
          boolean loop = true; // Here, the code is telling the computer to create a boolean named loop that is true.
          
          double sum = 0; // The code here sets up a variable called sum as a double and sets it equal to zero.
          
          double Grades = 0; // The purpose of this line of code is to create a varialble called Grades as a double equal to zero.
         
         while (loop = true) { // This line of code creates a loop using a while statement which will repeat the actions set by the code
         // contained within the while statement as long as loop equals true. It will also stop repeating if a break statement is used.
             
             System.out.print("Enter a grade: "); // This tells the computer to print out the message in quotations for the user to see.
             
             double imput = scan.nextDouble(); // The line of code here tells the computer to create a double called imput and sets it
             // equal to the value the user imputs.
             
             sum = sum + imput; // Here, the code tells the cumputer that sum is equal to the value of sum plus imput.
             
             Grades = Grades + 1; // The purpose of the code here is to set Grades equal to the value of Grades plus 1.
             
             if (imput == 999) { // The line of code here starts an if-else system. If imput is equal to 999, the commands
             // coded within the if statement will be executed.
                 
                 double total = sum - 999; // This sets up a variable called total as a double that is equal to 
                 // sum minus 999.
                 
                 double numGrades = Grades - 1; // This here tells the computer to make a double called numGrades that
                 // is equal to Grades - 1.
                 
                 double average = total / numGrades; // The line of code here tells the computer to create a double called average
                 // that is equal to total devided by numGrades.
                 
                 int roundAve = (int) average; // The purpose of this code here is to create an integer called roundAve that
                 // is equal to the integer value of average, essentilly eliminating all decimals.
                 
                 double decimal = (average*100) % 100; // This line of code here sets the double decimal equal to the decimal value
                 // of average up to the hundreths place.
                 
                 int Decimal = (int) decimal; // Here, decimal is converted from a double to an intiger, making it not display a deciaml
                 // after it.
                 
                 System.out.println("The rounded average is " + roundAve + "." + Decimal + " for all valid grades."); // This here
                 // tells the computer to print out the above messages in quotes plus the numerical values of roundAve and Decimal.
                 
                 break; // The purpose of the code here is to tell the computer to stop loopint the commands in the while statement.
                 
             }
             
             else if (imput <= 100 && imput >= 0) { // This line of code here sets up an else if statement where if imput is less
             // than or equal to 100 and greater than or equal to zero, the commands contained within the statement will be
             // executed, which is nothing since there are no commands in it. This will simply have the computer loop the program
             // contained within the while statement since there is nothing left for it to do.
                 
             }
             
             else { // The purpose of this line of code is to have the program execute the commands contained in the else statement
             // if the "if" and "else if" statements aren't executed. This else statement is only followed by the computer if the 
             // value of imput typed in by the user is neither 999 or less than or equal to 100 and greater than or equal to zero.
                
                 sum = sum - imput; // This here tells the computer that sum the value of sum is equal to sum minus the value of 
                 // imput.
                 
                 Grades = Grades - 1; // The line of code here tells the computer that the value of Grades is equal to Grades minus
                 // one.
                 
                 System.out.println("Invalid imput. Grades must be no less than 0 and no greater than 100."); // Here, the code
                 // tells the computer to print out the message in quote for the user to see.
                 
             }
         }
         
      }
  }