///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Trent Gray
// CSE2
// 11/4/15
//
// The purpose of this program is to take two arrays, one of size 20 and one of size 10, each filled with
// random numbers between 0 and 100, and sort them into ascending order. Then, the program will add
// set one and set two together and put them in ascending order as well to create a third sorted array.
  
  public class sort{ // The line of code here creates a class called sort which will contain all of the code for the program.
      
      public static void Sort(int[] ray, int size){ // This creates a void method called Sort which, to be used, must be called in the main method. It also must be given an integer array and an int.
          
          int[] Array = new int[size]; // The code here creates an integer array that has a number of slots equal to the imported int value size.
          
          int a = 0; // This creates an integer called a and sets it equal to zero.
          
          for (int x = 0; x < 101; x++){ // The code here creates a for loop where x = 0, the loop will repeat unless x is no longer less than 101, and after each loop, the value of x icreases by one.
              
              for (int y = 0; y < size; y++){ // The code here creates a for loop where y = 0, the loop will repeat unless y is no longer less than size, and after each loop, the value of y icreases by one.
                  
               if (ray[y] == x){ // This if statement will have the program perform the comands within it if the int in the y slot of ray is equal to x.
                   
                   Array[a] = ray[y]; // This sets the int in the a slot of Array equal to the y slot of ray.
                   
                   a++; // The code here has the value of a increase by one.
               }   
              }
          }
          
          for (int v = 0; v < size; v++){ // This creates a for loop that will continue to loop until the value of v is greater than the value of size.
              
              ray[v] = Array[v]; // This sets the int in the v slot of ray equal to the int in the v slot of Array.
          }
      }
      
      public static void main(String[] args){ // The line of code here creates a main method which will contain the code the computer will run first.
          
          int[] array1 = new int[20]; // The line of code here creates an integer array of size 20.
          
          int[] array2 = new int[10]; // This creates an integer array of size 10.
          
          int[] array3 = new int[30]; // This creates an integer array of size 30.
          
          for (int x = 0; x < 20; x++){ // This creates a for loop that will continue to loop until the value of x is greater than 20.
              
              array1[x] = (int)(Math.random()*100); // The code here sets the int in the x slot of array1 equal to a random number between 0 and 100.
              
              array3[x] = array1[x]; // This line of code sets the int in the x slot of array3 equal to the x slot in array 1.
              
          }
          
          for (int y = 0; y < 10; y++){ // The code here creates a for loop that will repeat until y is equal to 10 and y increases by one every loop.
              
              array2[y] = (int)(Math.random()*100); // The code here sets the y slot of array2 equal to a random nubmer between 0 and 100.
              
              array3[y + 20] = array2[y]; // This sets the int in the slot of y + 20 in array3 equal to the int in the y slot of array2.
              
          }
          
          Sort(array1,20); // This calls the Sort method given array1 and the number 20.
          
          Sort(array2,10); // This calls the Sort method given array2 and the number 10.
          
          Sort(array3, 30); // This calls the Sort method given array3 and the number 30.
          
          System.out.print("Sorted Array One is equal to: "); // The code here prints out the message in quotes here.
          
          for (int z = 0; z < 20; z++){ // This creates a for loop that will continue to loop until the value of z is equal to or greater than 20.
              
              System.out.print(array1[z]); // The code here prints out the int in the z slot of array1.
              
              if (z < 19){ // This if statement will activate and run the code within it if z is less than 19.
                  
                  System.out.print(" "); // The code here prints out a space.
              }
          }
          
          System.out.print("."); // This line of code prints out a period.
          
          System.out.println(""); // This line of code tells the computer to start printing information on a new line.
          
          System.out.print("Sorted Array Two is equal to: "); // The code here tells the computer to print out the abbreviated code.
          
          for (int a = 0; a < 10; a++){ // This for loop will continue to loop and perform the code within it until a is greater than or equal to 10.
              
              System.out.print(array2[a]); // This tells the computer to print out the int in the a slot of array2.
              
              if (a < 9){ // This if statement will activate if a is less than nine.
                  
                  System.out.print(" "); // This tells the computer to print out a space.
              }
          }
          
          System.out.print("."); // This command has the computer print out a period.
          
          System.out.println(""); // The code here tells the computer to skip to the next line.
          
          System.out.print("Sorted Array Three is equal to: "); // The code here has the computer print out the abbreviated message.
          
          for (int b = 0; b < 30; b++){ // This creates a for loop which will loop the code within it until b is greater than or equal to 30.
              
              System.out.print(array3[b]); // The code here has the computer print out the value of the int in the b slot of array3.
              
              if (b < 29){ // This if statement will activate if b is less than 29.
                  
                  System.out.print(" "); // This statment tells the computer to print out a space.
              }
          }
          
          System.out.print("."); // This tells the computer to print out a period.
          
          System.out.println(""); // This tells the computer to jump to the next line while printing or displaying information.
          
      }
  }