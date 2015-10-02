/////////////////////////////////////////////////////////////////////////////////////////
// Trent Gray
// CSE2
// 9/2/15

// The purpose of this program is to have the user imput a number which represents the
// size of a pyramid that they want using nested loops.

  import java.util.Scanner; // The line of code here tells the computer to import a
  // scanner from java to be used in the code for the program.
  
  public class pyramid { // This line of code creates a class called pyramid to
  // hold all of the code in.
      
      public static void main(String[] args) { // The code here tells the computer to
      // have java read and execute the code below using the main method.
          
          Scanner scan = new Scanner(System.in); // Here, the code tells the computer
          // to set up a new scanner class called scan to be used in the program to
          // allow the user to type in imput into the program.
          
          System.out.print("What size pyramid do you want? "); // The code here tells
          // the computer to print out and display the abreviated message for the
          // user to see.
          
          int size = scan.nextInt() + 1; // The code here creates a variable that is
          // an integer called size and sets it equal to the user's imput plus one
          // simply to make the variable classifications below easier to write
          // and make work in the code.
          
          for (int layer=1; layer!=size; layer++) { // This here creates a for loop
          // where the integer layer equals 1, the loop while continue to loop while
          // layer is not equal to size, and that after each loop, the value of layer
          // goes up by one.
              
              for (int spaces=0; spaces!=(size-layer); spaces++) { // Here, the code
              // creates a for loop where the integer spaces is equal to zero, where
              // the loop will continue while spaces is not equal to size minus layer
              // and thet the value of spaces goes up by one each loop.
                  
                  System.out.print(" "); // This line of code here tells the computer
                  // to print out a single space.
              }
              
              for (int stars=0; stars!=(2*layer)-1; stars++) { // The code here creates
              // a for loop where the integer stars is equal to zero, where the loop
              //  will continue while stars isn't equal to the product of two and 
              // stars, product minus one.
                  
                  System.out.print("*"); // Here, the code has the computerto print
                  // a star for the user to see.
                  
              }
              
              System.out.println(""); // Here, the code tells the computer to print
              // nothing, but uses println which causes the next thing to be printed
              // to be printed on a different line.
          }
          
      }
  }