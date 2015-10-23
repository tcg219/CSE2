//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Trent Gray
// CSE2
// 10/23/15
//
// The purpose of this program is to calculate the area of either a cirlce, rectange, or
// trapezoid.  The program will ask the user to imput which shape they wish to know the
// are of and then use an overloaded method called area to calculate the area of the
// given shape.

  import java.util.Scanner; // This line of code here tells the computer to import a scanner from java to be used in the program.
  
  public class areas { // The line of code here creates a class called areas which will contain all of the code for the program.
      
      public static double area(double x) {  // The code here creates method called area which uses a single variable value.
          
          double area = Math.PI * x * x; // This creates a variable called area and sets it equal to pi times x squared.
          
          int Area = (int) area; // This creates an integer called area and sets it equal to the integer value of area;
          
          int decimal = (int) ((area * 100) % 100); // The line of code here creates a variable called decimal and sets it equal to
          // the first two digits of the product of area and 100.
          
          double Decimal = decimal; // This line of code creates a double called Decimal and sets it equal to the value of decimal.
          
          double AREA = Area + (Decimal/100); // This here creates a double called AREA and sets it equal to Area plus the quotiant of decimal
          // and one-hundred.
          
          return AREA; // The line of code here tells the computer to return the value of AREA which is what will be used in the 
          // main method which is found down below.
      }
      
      public static double area(double x, double y) { // The code here creates a method called area that utilizes two doubles.
          
          double area = x * y; // This line of code creates a double called area and sets it equal to the product of x and y.
          
          int Area = (int) area; // This creates an integer called area and sets it equal to the integer value of area;
          
          int decimal = (int) ((area * 100) % 100); // The line of code here creates a variable called decimal and sets it equal to
          // the first two digits of the product of area and 100.
          
          double Decimal = decimal; // This line of code creates a double called Decimal and sets it equal to the value of decimal.
          
          double AREA = Area + (Decimal/100); // This here creates a double called AREA and sets it equal to Area plus the quotiant of decimal
          // and one-hundred.
          
          return AREA; // The line of code here tells the computer to return the value of AREA which is what will be used in the 
          // main method which is found down below.
      }
      
      public static double area(double x, double y, double z) { // This here creates a method called area that utilizes three doubles.
          
          double area = ((x + y) / 2) * z; // The line of code here creates a double called area and sets it equal to the sum of x and
          // y devided by zero and then multiplied by z.
          
          int Area = (int) area; // This creates an integer called area and sets it equal to the integer value of area;
          
          int decimal = (int) ((area * 100) % 100); // The line of code here creates a variable called decimal and sets it equal to
          // the first two digits of the product of area and 100.
          
          double Decimal = decimal; // This line of code creates a double called Decimal and sets it equal to the value of decimal.
          
          double AREA = Area + (Decimal/100); // This here creates a double called AREA and sets it equal to Area plus the quotiant of decimal
          // and one-hundred.
          
          return AREA; // The line of code here tells the computer to return the value of AREA which is what will be used in the 
          // main method which is found down below.
      }
      
      public static void main(String[] args) { // This creates the main method where the computer will start running the lines of code.
      // In order for the other methods to be used, they must be called within the main method and have the appropriot variables assigned
      // to them.
          
          Scanner scan = new Scanner(System.in); // The line of code here creates a scanner called scan which will be used to recieve imput
          // from the user of the program.
          
          while (true) { // The code here creates a while loop that will always repeat unless a break command is hit.
              
              System.out.println("Enter 'circle,' 'rectange,' or 'trapezoid' recieve the area of the shape. Type exit to exit: ");
              // The line of code above prints out the abbreviated message for the user to see.
          
              String shape = scan.next(); // This creates a string called shape and sets it equal to the user's imput.
              
              if (shape.equals("circle")) { // This if statement will activate and perform the cammands from the code contained within it
              // if shape is equal to "circle".
                  
                  System.out.print("Enter the radius of the circle: "); // This line of code prints out the abbeviated message.
                  
                  double radius = scan.nextDouble(); // The code here sets radius equal to the user's imput.
                  
                  System.out.println("The area of the circle is " + area(radius) + " units."); // This code here prints out the abreviated
                  // message as well as the area given the value radius.
              }
              
              else if (shape.equals("rectangle")) { // This if statement will run the code within it if shape is equal to "rectangle."
                  
                  System.out.print("Enter the length of the rectangle: "); // The code here prints out the abreviated message.
                  
                  double length = scan.nextDouble(); // This creates a variable called length and sets it equal to the imput of the user.
                  
                  System.out.print("Enter the width of the rectangle: "); // The code here prints out the abreviated statement for the user 
                  // to read.
                  
                  double width = scan.nextDouble(); // This sets the double width equal to the user's imput.
                  
                  System.out.println("The area of the circle is " + area(length,width) + " units."); // The code here prints out the abreviated
                  // message as well as the area given the length and the width.
              }
              
              else if (shape.equals("trapezoid")) { // This if statment will activate if shape is equal to "trapezoid."
                  
                  System.out.print("Enter the length of the top of the trapezoid: "); // This code prints out the abreviated message.
                  
                  double top = scan.nextDouble(); // The code here creates a variable named top and sets it equal to the user's imput.
                  
                  System.out.print("Enter the length of the base: "); // The code here prints out the abreviated message.
                  
                  double base = scan.nextDouble(); // This creates a variable called base and sets it equal to the user's imput.
                  
                  System.out.print("Enter the height of the trapezoid: "); // This code here prints out the abbreviated message.
                  
                  double height = scan.nextDouble(); // The code here creates a double called height and sets it equal to the user's imput.
                  
                  System.out.println("The area of the trapezoid is " + area(top,base,height) + " units."); // The code here prints out
                  // the abreviated message as well as the area given top, base, and height.
              }
              
              else if (shape.equals("exit")) { // This if statment will activate if shape is equal to "exit."
                  
                  break; // This is a break statement which will break the while loop, effectively ending the program.
                  
              }
              
              else { // This else statment will activate if none of the if statment's requirements are met.
                  
                  System.out.println("Invalid response."); // This prints out the abbreviated message for the user to see.
              }
              
          }
      }
  }