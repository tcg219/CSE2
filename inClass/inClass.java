//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Trent Gray
// CSE2
// 9/14/15

// This program is for the purpose of praticing durring class in order to follow the professer.

  import java.util.Scanner;
  
  public class inClass {
    
      public static void main(String[] args) {
          
          Scanner scan = new Scanner(System.in);
          
          int a = scan.nextInt();
          
          int b;
          
          try{
            
            b = (int) 10/a;
            
          }
          
          catch(Exception e){
            
            System.out.println("You entered zero");
            b = (int) 10/2;
            
          }
          
          System.out.println("b = " + b);
          
      }
  }