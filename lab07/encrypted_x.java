//////////////////////////////////////////////////////////////////////////////////////////////
// Trent Gray
// CSE2
// 10/8/15

// The purpose of this program is to hide a secret message, x, instead of simply
// printing it by burying it in a hanful of stars.  The program will ask the user
// for the size of the square the program will make for the user.  The program will
// also check for valid imput.  If the imput is not between 0 and 100, the system will
// quit the program.  For this process, a while loop will be used.

  import java.util.Scanner; // The statement here imports a scanner from java
  // to be used in the program.
  
  public class encrypted_x { // This statement creates a class that will hold all
  // of the code for the program in.
      
      public static void main(String[] args) { // This line of code tells the
      // computer to read the lines of code within it with the main method.
          
          Scanner scan = new Scanner(System.in); // This creates a new scanner class
          // called scan to be used for user imput.
          
          System.out.print("Enter an integer between 0 and 100 for the size of the square you wish to have: ");
          // The line of code above prints out the message in quotes for the user.
          
          int number = scan.nextInt() + 1;
          // This creates a variable called number and sets it equal to the scanned
          // number plus one.
          
          if (number < 0 || number > 100) { // This if statement performs the code
          // within it if the value of number is greater than 100  or less than
          // zero.
              
              System.exit(-1); // This exits the entire code if it is reached.
              
          }
          
          if (number % 2 != 0) { // This if statement performs the code within it
          // if the value of number is not a factor of two.
                  
                  number++; } // The statement here adds one the the value of number.
          
          for (int row = 1; row != number; row++) { // This sets up a for statement
          // where integer row is equal to one, it will loop until row is equal to 
          // number, and after each loop, row goes up by one in value.
              
              for (int collumn = 1; collumn != number; collumn++) {
                  // The code above sets up a for loop where the integer collumn is
                  // equal to one, the loop will repeat until collumn is equal to 
                  // number, and after each loop, collumn increases by one.
                  
                  if (collumn==row || collumn==(number-row)) {
                      // The if statement above will execute the code within it if
                      // collumn is equal to row or if collumn is equal to number
                      // minus row.
                      
                      System.out.print(" "); // The code here tells the computer
                      // to print out a space.
                      
                  }
                  
                  else { // If the requirements of the if statement aren't met, the
                  // code contained within this else statement will be executed.
                      
                      System.out.print("*"); // The code here tells the computer
                      // to print out a star.
                      
                  }
              }
              
              System.out.println(""); // The code here tells the computer to start
              // printing on a new line.
              
          }
          
          
      }
  }