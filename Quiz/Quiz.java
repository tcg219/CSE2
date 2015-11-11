////////////////////////////////////////////////////////////////////////////////////////////////
// Trent Gray
// CSE2

// The point of this program is to use it in order to help figure out questions for quizzes.

  import java.util.Scanner;
  
  public class Quiz {
    
    public static void same(int[] array1, int[] array2){
      
      System.out.println("The repeated values in the two arrays are: ");
      
      for (int x = 0; x < 20; x++){
        
        for (int y = 0; y < 20; y++){
          
          if (array1[x]==array2[y]){
            
            System.out.print(array1[x] + " ");
          }
        }
      }
    }
    
     public static void main(String[] args) {
          
          Scanner scan = new Scanner(System.in);
          
          int[] array1 = new int[20];
          
          int[] array2 = new int[20];
          
          for (int x = 0; x < 20; x++){
           
           array1[x] = (int) (Math.random()*100);
           
           array2[x] = (int) (Math.random()*100);
            
          }
          
          same(array1, array2);
          
          System.out.println("");
     }
  }
    
     