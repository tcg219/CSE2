//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Trent Gray
// CSE2

  import java.util.Scanner;
  
  public class INCLASS {
      
      public static void main(String[] args) {
          
          String[][] arr;
          
          arr = new String[5][5];
          
          for (int i = 0; i < 5; i++){
            
            for (int j = 0; j < 5; j++) {
              
              arr[i][j]=" ";
              
            }
          }
          
          int numBombs = 0;
          
          while( numBombs < 3 ){
            
            int X = (int) (Math.random()*5);
            int Y = (int) (Math.random()*5);
            //there is no bomb at this location
            
            if(!arr[X][Y].equals("M")) {
              
              // we place the bomb
              
              arr[X][Y]="M";
              
              numBombs = numBombs + 1;
            }
            
          }
          
          for (int i=0; i<5; i++) {
            
            for (int j=0; j<5; j++) {
              
              System.out.print(arr[i][j] + "/t ");
              
            }
            System.out.println("");
            
          }
      }
  }