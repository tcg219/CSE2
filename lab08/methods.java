///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Trent Gray
// CSE2
// 10/15/15
//
// The purpose of this program is to ask the user to type in ten numbers and have the program
// find the mean and median of those numbers as well as print out the results.  Each part
// of the program, calculating median, calculating mean, and printing the information out,
// will each be done by an individual method.

  import java.util.Scanner; // The code here imports a scanner from java to be used in the program to allow user imput.
  
  public class methods { // This creates a class called methods that will contain all of the code for the program.
      
      public static double mean(double total) { // This here creates a method called mean to hold some of the code in.
          
          double mean = total/10; // The code here creates a variable called mean and sets it equal to total devided by ten.
          
          return mean; // This returns the value of mean to be used if this method is used in the main method.
          
      }
      
      public static double median(double e,double f) { // This creates a method called median for a variable e and a variable f.
          
          double median = (e + f)/2; // This line of code creates a variable median and sets it equal to the sum of e plus f devidedd by two.
          
          return median; // The line of code here returns the value of median to be used if this method is used within the main method.
          
      }
      
      public static void main(String[] args) { // The code here sets up the main method.  It is within this method that the computer will begin executing commands from and, in doing so, will skip over the above commands
      // unless they are used within this method.
          
          Scanner scan = new Scanner(System.in); // This line of code sets up a scanner class called scan so it can be used to scan imput from the user and usd it in the program.
          
          double Total = 0; // The line of code here creates a variable named Total and sets it equal to zero.
          
          double imput; // The code here creates a variable named imput.
          
          double E = 0; // This creates a variable named E and sets it equal to zero.
          
          double F = 0; // This creates a variable named F and sets it equal to zero.
          
          double pastImput = 0; // This creates a variable called pastImput and sets it equal to zero.
          
          System.out.println("Enter ten numbers, from smallest to largest, that you wish to find the mean and median of one at a time.");
          // The line of code above tell the computer to print out the message in quotations.
          
          for (int x = 1; x != 11; x++) { // This sets up a for loop where x is an integer equal to one, the loop will continue unless x is equal to 11, and the value of x increases by one every loop cycle.
              
              System.out.print("Enter number " + x + ": "); // The code here tell the computer to print out the abbreviated message and the value of x.
              
              imput = scan.nextDouble(); // This sets imput equal the imput inserted by the user.
              
              switch (x) { // The statement here sets a switch statement where x is the prominent factor.
                  
                  case 5: // The code here will perform the code below it if x is equal to five.
                      
                      E = imput; // This sets the variable E equal to the imput;
                      
                      break; // The break statement will prevent the switch statment from performing any more code that is below it.
                  
                  case 6: // This will cause the switch statement to perform the commands below it if x is equal to 6.
                      
                      F = imput; // The code here sets F equal to the imput.
                      
                      break; // The break satement will prevent the swich statement from performing any more code that is below it.
                  
              }
              
            if (x > 1) { // This if statement will perform the commands within it if the value of x is greater than one.
              
              if (pastImput > imput) { // This if statement will perform the commands within it if the value of pastImput is greater than imput.
                
                System.out.println("Invalid imput."); // The code here tells the computer to print out the abbreviated message.
                
                System.out.println("Enter a number that is greater than or equal to " + pastImput + " please."); // The code here tells the computer to print out the message as well as the value of pastImput.
                
                x--; // The code here tells the computer to subtract one from the value of x.
                
              }
              
            }
            
              pastImput = imput; // Here, the code sets pastImput equal to the value of imput.
              
              Total += imput; // Here, the value of Total is set equal to Total plus the value of imput.
              
          }
          
          double m = mean(Total); // This code here creates a double called m which is equal to the mean method of the value of Total.
          
          double M = median(E,F); // The code here creates a double called M and sets it equal to the median method of E and F.
          
          System.out.println("The median is " + M + " and " + m + " is the mean."); // This statement tells the computer to print out the statement as well as the values of M and m.
          
      }
  }