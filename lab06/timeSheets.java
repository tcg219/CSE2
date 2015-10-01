////////////////////////////////////////////////////////////////////////////////////////////////////
// Trent Gray
// CSE2
// 10/1/15

// The purpose of this program is to print out the total payroll of all employees for a given
// week (Mondy through Friday).  The user of the program will imput the number of timesheets,
// the number of hours worked each day of the week by each employee and each employee's salary.
// The program will calulate and print out the total payroll of all the employees by adding up
// each employee's total hours worked, multiplying that by each individual employee's salary,
// and then adding up the total amounts earned by each employee together to get the total
// payroll of all of the empployees.

  import java.util.Scanner; // This line of code here tells the computer to import a scanner
  // from java to be used in the program.
  
  public class timeSheets { // The code here sets up a class called timeSheets which will contain
  // all of the code for the program.
      
      public static void main(String[] args) { // Here, the code is telling the computer to have
      // java read and interpret the code within the brackets using the main method.
          
          Scanner scan = new Scanner(System.in); // This sets up a new scanner class called
          // scanner which will allow the scanner to be used in the program.
          
          System.out.print("Enter a non-negative number of employee timesheets to be read in: ");
          // The code above tells the computer to print out the message in quotations.
          
          int sheets = scan.nextInt(); // Here, the code sets up a variable named sheets as an
          // integer and sets it equal to the integer value imput by the user.
          
          while (sheets < 0) { // The satement here sets up a loop which will repeat the code
          // contained within it while the value of sheets is less than zero.
              
              System.out.print("Invalid number of timesheets. Enter a non-negative integer: ");
              // The code above tells the computer to print out the message in quotations for the
              // user to see.
              
              sheets = scan.nextInt(); // This tells the computer that the value of sheets is
              // equal to the integer value typed in by the user.
          }
          
          double total = 0; // The code here tells the computer to create a double called total
          // and that its value is equal to zero.
          
          int employee = 0; // Here, the code creates an integer called employee which is equal
          // to zero.
          
          for (int timeSheets = 0; timeSheets<sheets; timeSheets++) { // This here creates a 
          // loop where the integer timeSheets is equal to zero, the loop will continue to loop
          // while timeSheets is less than sheets, and that, after each loop, timeSheets is 
          // equal to timeSheets plus 1.
              
              employee++; // The code on this line tells the computer to add 1 to the value of
              // employee.
              
              System.out.print("Enter the pay per hour in cents of employee " + employee + " : ");
              // The code above tells the computer to print out the message in quotations as well
              // as the value of employee.
              
              double salary = scan.nextDouble(); // This line of code creates a double called
              // salary and sets it equal to the imput of the user.
              
              int hours = 0; // Here, the code creates an integer named hours and sets it
              // equal to zero.
              
              for (int day = 1; day<6 ; day++) { // The line of code here creates a for loop where
              // the integer day is equal to 1, the loop will continue while day is less than 6,
              // and after each loop, the value of day will go up by 1.
                  
                  System.out.print("Enter number of hours worked for day " + day + ": ");
                  // The line of code above tells the computer to print out the message above 
                  // as well as the value of day.
                  
                  hours = scan.nextInt(); // Here, the code sets hours equal to the imput of the 
                  // user.
                  
                  total += salary * hours; // This tell the computer that the value of total is
                  // equal to the value of total plus the product of salary and hours.
              }
          }
          
          int payroll = (int) total; // The line of code here creates an integer called payroll
          // and sets it equal to the value of total.
          
          int decimal = (int) ((total*100) % 100); // Here, the code creates an integer called
          // decimal and sets it equal to the product of total and 100 mod 100. This essentially
          // sets the variable equal to the first two digits of total that are behind the decimal
          // point.
          
          System.out.println("The payroll value is $" + payroll + "." + decimal + " dolars.");
          // The final line of code here tells the computer to print out the quoted message as
          // well as the value of payroll and deciamal.
      }
  }