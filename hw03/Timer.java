////////////////////////////////////////////////////////////////////////////////////////////////
// Trent Gray
// CSE2
// 9/10/15

// The main purpose of this program is to take the current time and the time of a dinner 
// resrevation, both of which are imputed by the user, and to have the program to calculate
// and display the amount of time before the dinner resrevation in times and minutes.  The
// times given will be in military time.

  import java.util.Scanner; // This line of code tells java to import a scanner so that the
  // program can use it to allow the user to imput the required information.
  
  public class Timer { // The purpose of this line of code is to set up a class with which
  // will contain the code for the program.  Every program must be contained within a class.
        
        public static void main(String[] args) {  //The line of code here has java use the
        // main method to read and registered the lines of code within it.  For now, I
        // will only be using the main method.
        
  Scanner scan = new Scanner (System.in); // This line tells sets up a scanner comand called
  // scan to allow me to write code that utilizes the scanner.
  
  System.out.print("Enter the current time: "); // By writing this line, the program will
  // print out the abreviated message as well as let the user write in the current time
  // on the same line.
  
  int time = scan.nextInt(); // The line written here will tell the computer to assign
  // the user's imput time as an intager labled time.
  
  System.out.print("Enter the time that you will be eating dinner: "); // The line of code 
  // written here will tell the computer to print out and display the abreviated message
  // as well as the user to imput information on the next line.
  
  int dinner = scan.nextInt(); // This line of code tells the computer to take the user's
  // imput of the time that dinner is at and assign it as an integer named dinner.
  
  int timeUntil = dinner - time; // The code here will tell the computer to create an integer
  // called timeUntil that represents the time until dinner which is equal to the time
  // dinner is at minus the current time.
  
  int hours,
       minutes; // These two lines of code create integers called hours and minutes.
  
  hours=timeUntil/100; // This line of code will make hours equal to the number of hours
  // until dinner while getting rid of the number of minutes.
  
  minutes=timeUntil % 100; // The line of code here will make minutes equal to the 
  // number of minutes until dinner while getting rid of the number of hours.
  
  System.out.println("You have " + hours + " hours and " + minutes + " minutes until dinner.");
  // This above line of code tells the computer to print out the abreviated message as well
  // as the number of hours and minutes until dinner.
  
        }
  }