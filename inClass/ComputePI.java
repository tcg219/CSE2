//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Trent Gray
// CSE2
// 10/5/15

// This program is to compute pi.

  import java.util.Scanner;
  public class ComputePI {
      public static void main(String[] args) {
          
          Scanner scan = new Scanner(System.in);
          
          double pi=0;
          
          double sum = 0;
          
          int x = 1;
          
          int y=0;
          
          double z=0;
          
          System.out.print("Type pi to compute pi and zero to devide by zero: ");
          
          String next = scan.next();
          
          String PI = "pi";
          
          String zero = "zero";
          
          if (next.equals(PI)) {
          
          for (double frac = 1; z<999999999; frac = frac + 2) {
            
            if (x % 2 == 0) {
              
              sum = sum - (1/frac);
              
              z = z + 1;
            
          }
          
          else {
            
            sum = sum + (1/frac);
            
          }
          
          x++;
          
          
          }
          
          pi = 4*sum;
          
          double pie = Math.PI;
          
          double mod = pie % pi;
          
          System.out.println("I found pie as " + pi + " and the real is " + pie + ".");
          
          System.out.println("My pi mod real pi equals " + mod + ".");
          }
          
          else if (next.equals(zero)){
              
              while (true) {
                  
                  System.out.print("error ");
                  
              }
          }
          
          else {
              
              System.out.println("Invalid imput.");
          }
      }
  }