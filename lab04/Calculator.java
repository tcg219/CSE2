////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Trent Gray
// 9/17/15
// CSE2

// The purpose of this program is to create a calculator that can be used by the user.  The program will
// prompt the user to imput two integers, a and b, and to select an operator, '*','-','+', or '/', and will
// calculate what the user desires for it to calculate.  I will use the switch statement to complete this
// program.

  import java.util.Scanner; // The first line of code here tells the computer to import a scanner into java
  // to allow the user of the program to imput data.
  
  public class Calculator { // This line of code sets up a public class to contain all of the code for the 
  // program in.
  
       public static void main(String[] args) { // The line of code here tells the computer to use the main
       // method within java to read and process the lines of code contained within it.
           
           Scanner scan = new Scanner(System.in); // This sets up a new Scanner called scan which can now
           // be used in the program to give the user to put imput into the program.
           
           System.out.print("Enter your first integer, integer a: "); // The line of code here tells the
           // computer to print out the above message in a way that allows the user to type imput directly
           // to the right of the message which is in quotes.
           
           int a = scan.nextInt(); //This here creates an integer called a and sets it equal to the
           // integer value that the user types in.
           
           System.out.print("Enter your second integer, integer b:"); // The line of code here tells the 
           // computer to print out the above message in a way that allows the user to type imput directly
           // to the right of the message which is in quotes.
           
           int b = scan.nextInt();  //This here creates an integer called b and sets it equal to the
           // integer value that the user types in.
           
           System.out.print("Enter an opporator of '*','-','+', or '/': "); // The line of code here tells
           // the computer to print out the above messabe in a way that allows the user to type imput
           // directly to the right of the message which is in quotes.
           
           switch (scan.next()) { // This line of code here sets up a switch set up which allows varying
           // results based on the user's imput.  Based on the opperator the user chooses to use, the 
           // program will either add, subtract, multipy, or devide the two integers they typed in
           // previously.
           
               case "+": // The line of code here tells the computer to perform the following commands
               // if the user imputs the opperator of +.
               
                   int sum = a + b; // This here sets up an integer variable called sum which is equal
                   // to integer a plus b.
                   
                   System.out.println(a + " + " +  b + " = " + sum + "."); // The line of code here tells
                   // the computer to print out the value of a plus the value of b equals the value of
                   // sum, all in equation form.
                   
                   break; // The line of code here tells the program to stop here and not to perform the
                   // comands of the code below it.
                   
               case "-": // The line of code here tells the computer to perform the following comands
               // if the user imputs the opperator of -.
               
                   int sub = a - b; // This here sets up an integer variable called sub which is equal
                   // to integer a minus integer b.
                   
                   System.out.println(a + " - " + b + " = " + sub + "."); //The line of code here tells
                   // the computer to print out the value of a minus the value of b equals the value of
                   // sub, all in equation form.
                   
                   break; // The line of code here tells the program to stop here and not to perform the
                   // comands of the code below it.
                   
               case "*":  // The line of code here tells the computer to perform the following comands
               // if the user imputs the opperator of *.
               
                   int mult = a * b;  // This here sets up an integer variable called mult which is equal
                   // to the value of a times the value of b.
                   
                   System.out.println(a + " * " + b + " = " + mult + "."); //The line of code here tells 
                   // the computer to print out the value of a times the value of b equals the value of
                   // mult, all in equation form.
                   
                   break; // The line of code here tells the program to stop here and not to perform the
                     // comands of the code below it.
                   
               case "/": // The line of code here tells the computer to perform the following comands
               // if the user imputs the opperator of /.
               
                   int dev = a / b; // This here sets up an integer variable called dev which is equal
                   // to the value of a devided by the value of b.
                   
                   System.out.println(a + " / " + b + " = " + dev + "."); //The line of code here tells
                   // the computer to print out the value of a devided by the value of b equals the value of
                   // dev, all in equation form.
                   
                   break; // The line of code here tells the program to stop here and not to perform the
                   // comands of the code below it.
                   
               default: // The command here tells the computer to perform the below comands if none of the
               // cases above were used.
               
                   System.out.println("Illegar Operator"); // This line of code here tells the computer
                   // to print out and display and message in quotations.
           }
           
       }
  }