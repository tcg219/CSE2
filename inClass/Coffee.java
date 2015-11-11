//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Trent Gray
// CSE2
// 9/21/15

// The purpose of this program is to determine if the user could use some coffee.
  
  import java.util.Scanner;

  public class Coffee {
      public static void main(String[] args) {
          
          Scanner scan = new Scanner(System.in);
          
          System.out.print("Are you having a good morning? Type yes or no: ");
          
          String answer = scan.next();
          
          String yes = "yes";
          
          String no = "no";
          
          if (answer.equals(yes)) {
              System.out.println("Glad you are having a good morning! Perhaps you should grab a cup of coffee to make it better!");
          }
          
          else if (answer.equals(no)) {
              System.out.println("Aww, I'm sorry to hear that. Perhaps you should grab a cup of coffee to cheer you up?");
          }
          
          else {
              System.out.println("You seem to be talking incoherently. Perhaps you should grab a cup of coffee to help you wake up?");
          }
          
          System.out.print("You do like coffee, right? Type yes or no: ");
          
          String Answer = scan.next();
          
          if (answer.equals(yes)) {
            System.out.println("That's great! You should deffinatealy grab some coffee then!");
          }
          
          else if (answer.equals(no)) {
            System.out.println("Well, that's too bad...");
          }
          else {
            System.out.println("Well, I have no idea what you are saying, but it sure sounds like you could use a cup of coffee!");
          }
          
          System.out.print("Are you hungry? Type yes or no: ");
          
          String ans = scan.next ();
          
          if (ans.equals(yes)) {
            System.out.println("Perhaps you should grab a bagel, or a donut, or maybe even a scone!");
            System.out.println("You know what tastes good with scones?");
            System.out.println("COFFEE!!! ");
          }
          else if (ans.equals(no)) {
            System.out.println("Hmm, not hungry eh? Know what will help hold you off this morning?");
            System.out.println("COFFEE!!!");
          }
          else {
            System.out.println("Yep, still no idea as to what you are saying. Perhaps you should grab a bagle, or a dunut, or maybe even a scone.");
            System.out.println("You know what tastes good with scones?");
            System.out.println("COFFEE!!!");
          }
          
          
          
          while (true) {
            
            System.out.print("Isn't coffee the greatest drink in the world? Type yes or no: ");
          
          String Yes = scan.next();
          
          String ok = yes;
          
          String mocha = no;
            
            if (Yes.equals(ok)) {
              
              System.out.println("Great! Sounds like you have great taste!");
              
              break;
            }
            
            else if (Yes.equals(mocha)) {
            
            System.out.println("What was that?");
            }
          
          else{
            
            System.out.println("I'm sorry, I don't understand.");
            
          }
          }
      }
  }