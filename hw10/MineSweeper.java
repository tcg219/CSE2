////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Trent Gray
// CSE2
// 11/6/15
//
// The purpose of this program is to create a minesweeper board of size 2X2 to
// 30X30.  The user will enter in the size of the board as well as the number of
// mines. The number of mines should be between 1 and the N*N. In the boxes right
// next to the mines, the box must contain the number of mines adjacent to it.
// Mines are marked by an m. Spaces that aren't adjacent to mines are simply
// blank.

  import java.util.Scanner; // The line of code here imports a scanner into the code to allow user input.
  
  public class MineSweeper { // This creates a class called MineSweeper to contain all of the code for the program.
    
    public static String[][] symbols(int[][] grid, int size){ // This creates a method called symbols that accepts a 2-d int array and an int as input and has a 2-d String array as an output.
      
      String[][] field = new String[size][size]; // This creates a 2-d string array of size equal to the value of size for length and width.
      
      for (int x = 0; x < size; x++){ // This creates a for loop that will continue to loop until the number of loops is equal to the value of size.
        
        for (int y = 0; y < size; y++){ // The code here creates a loop taht will continue to loop until the number of loops is equal to size.
          
          if (grid[x][y] == 0){ // This if statement will run the code within it if the int value of grid at x and y is equal to zero.
            
            field[x][y] = "_ "; // This sets the x,y slot of field equal to a line and a space.
          }
          
          else if (grid[x][y] == 9){ // This else if statement will run if grid at x,y is equal to nine.
            
            field[x][y] = "M "; // This sets the x,y slot of field equal to M and a space.
          }
          
          else{ // This else statement will run the code within it if the if and else if statements aren't run.
            
            field[x][y] = Integer.toString(grid[x][y]) + " "; // The code here sets the x,y slot of field equal to the String equivalent of the int in the x,y slot of grid.
          }
        }
      }
      
      return field; // This return statement will return the 2-d String array called field to the main method when this method is called.
      
    }
      
      public static int[][] Numbers(int[][] grid, int size){ // The code here creates a method called Numbers that recieved a 2-d int array and an int and sends back an int 2-d array.
          
          for (int x = 0; x < size; x++){ // The for statement here will continue to loop until the number of loops is equal to the value of size.
              
              for (int y = 0; y < size; y++){ // This for loop will continue to loop until the number of loops is equal to the value of size.
                  
                  if (grid[x][y] == 9){ // This if statement will run the code within it if the value of the int in the x,y slot of grid is equal to nine.
                      
                      for (int a = -1; a < 2; a++){ // This for loop will continue to loop until the number of loops is equal to three.
                          
                          for (int b = -1; b < 2; b++){ // The for loop here will continue to loop until the number of loops is equal to three.
                            
                            try{ // This try statement will try to run the code within it. If there are any errors, the code will move to the catch statement and run the code within it instead of creating the error.
                              
                              if (grid[x+a][y+b] != grid[x][y]){ // This if statement will run the code within it if the int in the x+a,y+b slot of grid isn't equal to the x,y slot of grid.
                                
                                if (grid[x+a][y+b] != 9){ // The if statement here will run the code within it if the int in the x+a,y+b slot of grid isn't equal to nine.
                                  
                                  grid[x+a][y+b]++; // This adds one to the value of the int in the x+a and the y+b slot of grid.
                                  
                                }
                            }
                            }
                            
                            catch(Exception q){ // This catch statement will run the code within it if an error occures in the try statement above.
                              
                  }
              }
          }
                  }
              }
          }
          
          return grid; // The line of code here returns the 2-d array grid back to the main method.
              
          }
      
      public static int[][] Mines(int[][] board, int size, int mines){ // The code here creates a method called Mines that recieves a 2-d int array and two integer values and sends back a 2-d int array.
          
          int[] X = new int[mines]; // This creates an array called x and sets the size equal to the value of mines.
          
          int[] Y = new int[mines]; // The code here creates an array called Y and sets the size of it equal to the value of mines.
          
          for (int z = 0; z < size; z++){ // This for loop will continue to loop until the number of loops is equal to the value of size.
              
              for (int q = 0; q < size; q++){ // This for loop will continue to loop until the number of loops is equal to the value of size.
                  
                  board[z][q] = 0; // The code here sets the int in the z,q slot of board equal to zero.
                  
              }
          }
          
          for (int a = 0; a < mines; a++){ // This for loop will continue to loop until the number of loops is equal to the number of mines.
              
              int repeat = 0; // The code here creates a variable called repeat and sets it equal to zero.
              
              int x = (int) (Math.random() * size); // This creates a variable called x and sets it equal to a random decimal multiplied by the value of size.
              
              int y = (int) (Math.random() * size); // This creates a variable called y and sets it equal to a random decimal multiplied by the value of size.
              
              if (a > 0){ // The if statement here will activate if a is greater than zero.
                  
                  for (int b = 0; b < a; b++){ // The for loop here will continue to loop until the nummber of loops is equal to the value of a.
                      
                      if (X[b] == x && Y[b] == y){ // The if statement here will activate if the int in the b slot of X is equal to x and the int in the b slot of Y is equal to y.
                          
                          repeat++; // This adds one to the value of repeat.
                          
                      }
                  }
                  
                  if (repeat == 0){ // This if statement will activate if repeat is equal to zero.
                      
                      X[a] = x; // This sets the a slot of X equal to x.
                      
                      Y[a] = y; // This sets the a slot of Y equal to y.
                      
                  }
                  
                  else { // The else statement here will activate if the if statement above doesn't activate.
                      
                      a -= 1; // The line of code here subtracts one from the value of a.
                      
                  }
              }
          }
          
          for (int z = 0; z < mines; z++){ // This for loop will continue ot loop until the number of loops is equal to the value of mines.
              
              board[X[z]][Y[z]] = 9; // The code here sets the X[z],Y[z] slot of the board array equal to nine.
              
          }
          
          return board; // The statement here returns the 2-d array named board to the main method.
      }
      
      public static void main(String[] args){ // This creates the main method where the computer will start running code.
          
          Scanner scan = new Scanner(System.in); // The code here creates a scanner called scanner to be used to recieve input from the user.
          
          int size = 0; // This creates an integer called size and sets it equal to zero.
          
          int mines = 0; // The code here creates an integer called mines and sets it equal to zer.
          
          System.out.println("Enter the size of the board you want."); // The code here prints out the message in quotations.
          
          while (true){ // The code here creates a while loop that will continue to loop until a break statement is reached.
              
              System.out.print("Enter a size of 2-30: "); // The code here prints out the message in quotations.
          
              size = scan.nextInt(); // This line of code sets the value of size equal to the user's input.
          
              if (size < 2 || size > 30){ // The if statment here will activate if the value of size is less than two or greater than thirty.
              
                  System.out.println("Invalid Imput"); // The code here prints out the message in quotations.
              
              }
              
              else { // This else statement will activate if the if statement above isn't activated.
                  
                  break; // This break statement stops the while loop from looping.
              }
          }
          
          System.out.println("Enter the number of mines you want."); // The code here prints out the message in quotations.
          
          while (true){ // The code here creates a while loop that will continue to loop until a break statement is reached.
              
              System.out.print("Enter a number of mines less than " + size * size + " and more than one: "); // The code here prints out the message in quotations as well as the value of size*size.
              
              mines = scan.nextInt(); // This line of code sets the value of mines equal to the user's input.
              
              if (mines < 1 || mines > size*size){ // This if statement will activate if the value of mines is less than one or greater than the value of size squared.
                  
                  System.out.println("Invalid Imput"); // The code here prints out the message in quotations.
                  
              }
              
              else{ // This else statement will activate if the if statement above isn't activated.
                  
                  break; // This break statement stops the while loop from looping.
                  
              }
          }
          
          int[][] Board = new int[size][size]; // This creates a 2-d int array with a length and width both equal to the value of size.
          
          int[][] board = Mines(Board, size, mines); // This creates a 2-d int array that is equal to the exported 2-d array given by the Mines() method.
          
          int[][] grid = Numbers(board, size); // This creates a 2-d int array that is equal to the exported 2-d array given by the Numbers() method.
          
          System.out.println(""); // The code here prints out the message in quotations.
          
          System.out.println("Size is " + size + " and mines is " + mines + "."); // The code here prints out the message in quotations as well as the values of size and mines.
          
          System.out.println(""); // The code here prints out the message in quotations.
          
          String[][] field = symbols(grid, size); // This creates a 2-d String array equal to the exported 2-d array given by the symbols() method.
          
          for (int x = 0; x < size; x++){ // This line of code creates a for loop that will continue to loop until the number of loops is equal to the value of size.
            
            for (int y = 0; y < size; y++){ // This line of code creates a for loop that will continue to loop until the number of loops is equal to the value of size.
              
              System.out.print(field[x][y]); // The code here prints out the value of the String in the x,y slot of the field array.
              
            }
            
            System.out.println(""); // The code here prints out the message in quotations.
          }
      }
  }