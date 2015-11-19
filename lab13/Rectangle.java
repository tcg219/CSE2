//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Trent Gray
// CSE2
// 11/19/15
//
// The purpose of this program is to use non-static methods and variables in order to compute the set the
// height and width of a rectangle and to solve for, and print out, the area of the rectange.

  public class Rectangle{ // This creates a class called Rectangle which will hold all of the code for the program.
      
      double width; // This creates a non-static double called width.
      
      double height; // The line of code here creates a non-static double called height.
      
      public void setWidth(double x){ // This creates a non-static method called setWidth which acceptes a double.
          
          width = x; // This sets width equal to x.
          
      }
      
      public void setHeight(double y){ // The code here creates a non-static method called setHeight that accepts a double.
          
          height = y; // This sets height equal to y.
          
      }
      
      public double getArea(){ // The mehtod here is a non-static method which will return a double to the main method when it is called.
          
          double Area = width * height; // The line of code here creates a double called Area and sets it equal to width times height.
          
          return Area; // This returns the value of Area back to the main method.
          
      }
      
      public static void main(String[] args){ // This creates the main method where the computer will begin runnining the program.
          
          Rectangle r1 = new Rectangle(); // This creates a class called r1 that is a new Rectangle class. This is used to make non-static methods usable.
          
          r1.setWidth(5.3); // This calls the setWidth method with 5.3 as input.
          
          r1.setHeight(7.3); // This calls the setHeight method with 7.3 as input.
          
          double area = r1.getArea(); // The line of code here creates a double called area and sets it equal to the output of getArea.
          
          System.out.println("The area of the rectangle is " + area + " units."); // The code here prints out the abbreviated message and the value of area.
          
      }
  }