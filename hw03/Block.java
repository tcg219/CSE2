///////////////////////////////////////////////////////////////////////////////////////////////
// Trent Gray
// CSE2
// 9/11/15

// The purpose of this program is to calculate the volume and surface area of a block when given
// the lenght, width, and height by the user via a scanner.

  import java.util.Scanner; // This line of code will have java import a scanner to be used in
  // the program so that the user can imput information.
  
  public class Block { // The line of code here creates a class within which the program
  // will be contained in.
  
  public static void main(String[] args) { //Here, the line of code tells java to use
  // the main method to read and process the program contained within it.
  
  Scanner scan = new Scanner (System.in);  // The code here sets up a new scanner called
  // scan which will allow the scanner to be used and, therefore, the user to imput
  // information.
  
  System.out.print("Enter the lenght of the block: "); //The line of code here tells the 
  // computer to print out and display the abbreviated message.
  
  double length = scan.nextDouble(); // This line of code here assignes the users imput
  // as a double named lenght.
      
  System.out.print("Enter the width of the block: ");  // Here, the line of code tells the 
  // computer to print out the abbreviated message.
  
  double width = scan.nextDouble(); // What the line of code here does is tell the computer
  // to assign the useres imput number as a double named width.
  
  System.out.print("Enter the height of the block: "); // This line of code here tells the
  // computer to print out the abbreviated message which is in quotations.
  
  double height = scan.nextDouble(); // The line of code here tells the computer to assign
  // the number, inputted by the user, as a double named height.
  
  double Volume = length * width * height; // Here, the code assigns a variable named 
  // Volume as a double and sets it equal to the product of length times width times height.
  
  double surfaceArea = (2 * length * width) + (2 * width * height) + (2 * length * height);
  // The line of code above assigns the variable surfaceArea as a double which is equal
  // to two times the lenght times the width plus two times the width times the height plus
  // the lenght times the height to produce the surface area of the block.
  
  System.out.println("The volue of the block with the dimensions " + length + " x "
  + width + " x " + height + " is " + Volume + "."); // Here, what the line of code, which
  // takes up two lines, does is tell the computer to print out the abbreviated message
  // and the value of the variables lenght, width, height, and volume.
  
  System.out.println("The surface area of the block is " + surfaceArea + ".");
  // What the line of code above does is have the computer print out the abbreviated
  // message as well as display the value of the surface area.
  }
  }

