////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Trent Gray
// CSE2
// 9/8/15
  
  import java.util.Scanner;
  public class Prac {
      public static void main(String[] args) {
          
          System.out.println("Goodmoring me, are you having a good morning?");
          System.out.println("Y or N");
          Scanner scan = new Scanner(System.in);
          char input = scan.nextchar();
            
            if (input = 'Y') {
                System.out.println("Glad you are havaing a good morning! Perhaps you should grab a nice hot coffee and enjoy the day!");
            }
            else if (input = 'N') {
                System.out.println("I'm sorry to hear that. Perhaps you shoudl get some coffee?");
            }   
      }
  }