//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Trent Gray
// CSE2
// 10/29/15
//
// The purpose of this program is to ask the user for how many random numbers he or she wants
// and to have the program create n numbers and place them in an array list.  The program will
// then print out all of the values, the sum of the values, the average value, and all of the 
// values that are greater than or equal to the average value.

  import java.util.Scanner; // This imports the scanner class from java to be used in the program.
  
  public class averageArrays { // The code here creates a class that will contain all of the code for the program.
      
      public static void main(String[] args) { // This creates a main method that will contain the code for the program that the computer will go to first to read.
          
          Scanner scan = new Scanner(System.in); // The line of code here creates a scanner that will be used in the code for the program.
          
          System.out.println("Enter the number of integers you wish to be made: "); // The code here prints out the abreviated message.
          
          int n = scan.nextInt(); // This creates an integer called n and sets it equal to the users imput.
          
          int average = 0; // The line of code here creates an integer called average and sets it equal to zero.
          
          int[] list = new int[n]; // This creates an array called list that will hold a number of integers equal to the value of n.
          
          for (int x = 0; x < n; x++) { // The code here creates a for loop that will repeat the commands inside it until the number of loops run through is equal to n.
              
              list[x] = (int) (Math.random() * 100); // This sets the int in the x position equal to a random number between 0 and 99.
              
          }
          
          System.out.print("The numbers in the list are "); // The line of code here tells the computer to print out the message in quotations.
          
          for (int x = 0; x < n; x++) { // This creates a for loop which will loop until the number of loops is equal to n.
              
              System.out.print(list[x]); // The code here prints out the value of the integer in the x position in the list array.
              
              if (x != n-1) { // This if statement will have the computer run the code within it if x isn't equal to the value of n minus one.
                  
                  System.out.print(","); // The code here prints out a comma.
                  
              }
          }
          
          System.out.println("."); // This line of code has the computer print out a period.
          
          int sum = 0; // This sets int sum equal to zero.
          
          for (int x = 0; x < n; x++) { // This for loop will loop until x is equal to n.
              
              sum += list[x]; // This sets the value of sum to sum plus the value of the int in the x position of the list array.
              
              if (x == n-1) { // This if statement will have the computer run the code within it if x is equal to the value of n minus one.
                  
                  System.out.println("The sum of the numbers is " + sum + "."); // This prints out the message as well as the value of sum.
                  
                  average = sum / n; // This sets average equal to sum devided by n.
                  
                  System.out.println("The average of the numbers is " + average + "."); // The code here prints out the message as well as the value of average.
              }
          }
          
          System.out.print("The numbers in the list that are larger than or equal to the average are "); // This prints out the message in quotations.
          
          for (int x = 0; x < n; x++){ // This for loop will loop until x is equal to n.
              
              int z = list[x]; // This creates a variable called z and sets it equal to the int in the x position of the list array.
              
              if (z >= average) { // This if statment will activate if z is greater than or equal to the value of average.
                  
                  System.out.print(list[x]); // The code here prints out the value of the int in the x position of the list array.
                  
                  if (x != n - 1){ // This if statment will activate if x isn't equal to n minus one.
                      
                      System.out.print(","); // This will print out a comma.
                  }
              }
          }
          
          System.out.println("."); // This line of code will print out a period.
          
      }
  }