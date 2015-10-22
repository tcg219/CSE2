//////////////////////////////////////////////////////////////////////////////////////////////////////////
// Trent Gray
// CSE2
// 10/22/15
// 
// The purpose of this program is to simulate the flipping of a coin using multiple methods.  A 
// method named flip will simulate the coin toss and return heads or tails while the main method
// will print out the heads vs tails.  The number of tosses must be between 0 and 100. If zero, one
// method will be used while anything between 1 and 100 will be done via another method.  The program
// will end when the user enters a number greater than 100.

  import java.util.Scanner; // The code here imports a scanner into java to be used in the program.
  
  public class coinFlipping { // This creates a class called coinFlipping that will hold all of the 
  // code for the program.
      
      public static void flip(int x) { // This creates a method called flip for where x is an int.
          
          int heads = 0; // This creates an integer called heads and sets it equal to zero.
          
          int tails = 0; // This creates an integer called tails and sets it equal to zero.
          
          while (true) { // The code here creates a while loop that will repeat the code within it until
          // it hits a break statement.
              
              int flip = (int)(Math.random() * 10); // This creates a variable called flip and sets it
              // equal to a one digit random nuber.
              
              if (flip == 0) { // This creates an if statement that will perform the code within it if flips
              // is equal to zero.
                  
                  heads++; // The code here adds one to the value of heads.
                  
                  break; // This break statement stops the while loop, stopping it form repeating.
                  
              }
              
              else if (flip == 1) { // This will perform the code within it if flip is equal to one.
                  
                  tails++; // The code here adds one to the value of tails.
                  
                  break; // This code breaks the while loop, causing it to stop repeating.
              }
          }
          
          System.out.println("Tails(" + tails + ") Heads(" + heads + ")."); // This prints out the message
          // as well as the values of tails and heads.
          
      }
      
      public static void flip(int x, boolean z) { // The code here sets up a method called flip for an integer
      // x and a boolean z.
          
          int heads = 0; // This creates an integer called heads and sets it equal to zero.
          
          int tails = 0; // The code here creates an integer called tails and sets it equal to zero.
          
          int flip = 0; // Here, the code creates an integer called flip and sets it equal to zero.
          
          for (int y = 0; y < x; y++) { // This creates a loop where y is equal to zero, the loop will repeat
          // until y is greater than or equal to x, and y increases by one after every loop.
            
            while (true) { // This creates a loop that will only stop via a break statement.
              
              flip = (int)(Math.random() * 10); // This sets int flip equal to a single random number.
              
              if (flip == 0 || flip == 1) { // The if statement will activate if flip is equal to 0 or 1.
                
                break; // This will stop the while loop from looping.
                
              }
              
            }
              
              if (flip == 0) { // The if statement will activate if flip is equal ot zero.
                  
                  heads++; // This adds one to the value of heads.
                  
              }
              
              else if (flip == 1) { // The else if statement will activate if flip is equal to one.
                  
                  tails++; // This adds one to the value of tails.
                  
              }
          }
          
          System.out.println("Tails(" + tails + ") Heads(" + heads + ")."); // This prints out the 
          // statment as well as the values of tails and heads.
          
      }
      
      public static void main(String[] args) { // This creates a main method where the program will start running at.
          
          Scanner scan = new Scanner(System.in); // This creates a scanner called scan.
          
          while (true) { // This creates a loop that will repeat until a break statment is used.
            
          System.out.print("Enter an integer between 0 and 100 for the number of coin flips you wish to have: ");
          // The code above prints out the above message.
          
          int Flips = scan.nextInt(); // This sets int Flip to the users imput.
          
          if (Flips == 0) { // This if statment will activate if Flipps is equal to zero.
              
              flip(Flips); // This calls out method flips with int Flips.
              
          }
          
          else if (0 < Flips && Flips <= 100) { // This else statment will acivate if Flipps is more than zero
          // and less than or equal to 100.
            
              flip(Flips, true); // This calls the flip method with int flips and boolean true.
              
          }
          
          else { // This else satment will activate if the if statments aren't.
            
            break; // This break statment breaks the while loop, ending the program.
            
          }
            
          }
      }
  }