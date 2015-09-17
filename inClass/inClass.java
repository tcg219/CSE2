//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Trent Gray
// CSE2
// 9/14/15

// This program is for the purpose of praticing while durring class in order to follow the professer.

  import java.util.Scanner;
  public class inClass {
      public static void main(String[] args) {
          
          Scanner scan = new Scanner(System.in);
          
        System.out.print("Enter a number between 1 and 10: ");
        int num = scan.nextInt();
        
    //    if (num==0) {
      //    System.out.println("Zero");
      //  }
        
      //  else if (num==1) {
      //    System.out.println("One");
      //  }
        
      //  else if (num==2) {
      //    System.out.println("Two");
      //  }
      //  else if (num==3) {
      //    System.out.println("Three");
      //  }
      //  else if (num==4) {
      //    System.out.println("Four");
      //  }
      //  else if (num==5) {
      //    System.out.println("Five");
      //  }
      //  else if (num==6) {
      //    System.out.println("Six");
      //  }
      //  else if (num==7) {
      //    System.out.println("Seven");
      //  }
      //  else if (num==8) {
      //    System.out.println("Eight");
      //  }
      //  else if (num==9) {
      //    System.out.println("Nine");
      //  }
      //  else if (num==10) {
      //    System.out.println("Ten");
      //  }
      //  else if (num==13) {
      //    System.out.println("YOU ARE EVIL!!!");
      //  }
      //  else {
      //    System.out.println("You have selected a number outside the range of 1-10");
      //  }
        switch (num) {
          case 1:
            System.out.println("One");
            break;
          case 2:
            System.out.println("Two");
            break;
          case 3:
             System.out.println("Three");
             break;
          case 4:
            System.out.println("Four");
            break;
          case 5:
            System.out.println("Five");
            break;
          case 6:
            System.out.println("Six");
            break;
          case 7:
            System.out.println("Seven");
            break;
          case 8:
            System.out.println("Eight");
            break;
          case 9:
            System.out.println("Nine");
            break;
          case 10:
            System.out.println("Ten");
            break;
          default:
            System.out.println("Not a valid choice.");
            break;
        }
      }
  }