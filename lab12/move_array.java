////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Trent Gray
// CSE2
// 11/12/15
//
// The purpose of this program is to fill an array, of size specified by the user, and to send the value
// of one of the integers within the array, chosen by the user, to be sent to the back of the array and
// have all of the values after than value move up to fill in the space before it while still sending the
// chosen value to the back.  The array size must be greater than zero and and the chosen value is
// between zero and the size of the array minus one.  For this program, the catching of inputs and such
// will mainly be done using try/catch statements.

  import java.util.Scanner; // This statement imports a scaner from java to be used in the program to get input from the user.
  
  public class move_array{ // The line of code here creates a class called move_aray that will contain all of the code for the program.
      
      public static void main(String[] args){ // This creates the main method which will contain all of the code that the computer will run first.
          
          Scanner scan = new Scanner(System.in); // The code here creates a scanner called scan to recieve user input.
          
          int x = 1; // This creates an integer called x and sets it equal to one.
          
          System.out.print("Enter the size of the array you wish to have: "); // The line of code here prints out the message in quotations.
          
          int size = scan.nextInt(); // The code here creates an integer called size and sets it equal to the user's input.
          
          try{ // This creates a try/catch statement where, if there is an error in the try, it will be caught by the catch statement and will run the code within the catch statement instead.
              
              if (size < 1){ // The code here creates an if statement that will run the code within it if size is less than one.
                  
                  x = 0; // This sets the value of x equal to zero.
              }
              
              int c = 3/x; // The code here creates an int called c and sets it equal to three divided by x.
              
          }
          
          catch (Exception e){ // This catch statement will activate and run the code within it if the try statement runs an error.
              
              System.out.println("Invalid Imput. Array size must be greater than zero."); // The line of code here prints out the message in quotations.
              
              System.out.println("Array size is now 5."); // The line of code here prints out the message in quotations.
              
              size = 5; // The code here sets size equal to five.
              
              x = 1; // This sets x equal to one.
              
          }
          
          int[] array = new int[size]; // The line of code here creates an int array that is of size equal to the value of the integer size.
          
          for (int y = 0; y < size; y++){ // The code here creates a for loop that will continue ot loop until the number of loops is equal to size.
              
              array[y] = (int) (Math.random() * 100); // This line of code sets the int in the y slot of array equal to a random number between 0 and 100.
              
          }
          
          System.out.println("Enter the value you wish to send to the back of the array."); // The line of code here prints out the message in quotations.
          
          System.out.print("Enter a value between 0 and " + (size - 1) + ": "); // The line of code here prints out the message in quotations and the value of size minus one.
          
          int value = scan.nextInt(); // The code here creates an integer called value and sets it equal to the user's input.
          
          try{ // This creates a try/catch statement where, if there is an error in the try, it will be caught by the catch statement and will run the code within the catch statement instead.
              
              if (value < 0 || value > (size - 1)){ // This if statement will activate if value is less than zero or greater than or equal to size.
                  
                  x = 0; // The line of code here sets x equal to zer.
              }
              
              int c = 3/x; // The code here creates an int called c and sets it equal to three divided by x.
              
          }
          
          catch (Exception e){ // This catch statement will activate and run the code within it if the try statement runs an error.
              
              System.out.println("Invalid Input. Value must be at least zero and less than " + (size-1)); // The line of code here prints out the message in quotations and the value of size minus one.
              
              System.out.println("Value is now zero."); // The line of code here prints out the message in quotations.
              
              value = 0; // The line of code here sets value equal to zero.
              
          }
          
          int temp = array[value]; // This line of code creates an int called temp and sets it equal to the int in the value slot of array.
          
          System.out.println(""); // The line of code here prints out the message in quotations.
          
          System.out.print("    The orginal array is: "); // The line of code here prints out the message in quotations.
          
          for (int g = 0; g < size; g++){ // The code here creates a for loop that will continue ot loop until the number of loops is equal to size.
              
              System.out.print(array[g] + " "); // The code here prints out the int in the g slot of array as well as a space.
              
          }
          
          System.out.println(""); // The line of code here prints out the message in quotations.
          
          System.out.print("The re-arranged array is: "); // The line of code here prints out the message in quotations.
          
          for (int q = value; q < size-1; q++){ // This for loop will continue to loop until the number of loops is equal to size minus one.
              
              array[q] = array[q+1]; // The code here sets the int in the q slot of array equal to the int in the q plus one slot of array.
              
          }
          
          array[size-1] = temp; // This sets the int in the size minus one slot of array equal to the value of temp.
          
          for (int u = 0; u < size; u++){ // This for loop will continue to loop until the number of loops is equal to size.
              
              System.out.print(array[u] + " "); // The code here prints out the value of the int in the u slot of array and a space.
              
          }
          
          System.out.println(""); // The line of code here prints out the message in quotations.
      }
  }